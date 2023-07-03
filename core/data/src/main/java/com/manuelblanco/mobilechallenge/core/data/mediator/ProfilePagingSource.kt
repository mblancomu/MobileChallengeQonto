package com.manuelblanco.mobilechallenge.core.data.mediator

import androidx.paging.ExperimentalPagingApi
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.manuelblanco.mobilechallenge.core.data.model.asEntities
import com.manuelblanco.mobilechallenge.core.database.model.ProfileEntity
import com.manuelblanco.mobilechallenge.core.network.retrofit.RetrofitNetworkApi
import retrofit2.HttpException
import java.io.IOException

/**
 * Created by Manuel Blanco Murillo on 29/6/23.
 */

const val STARTING_PAGE_INDEX = 1

@ExperimentalPagingApi
class ProfilePagingSource(private val service: RetrofitNetworkApi) : PagingSource<Int, ProfileEntity>() {
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ProfileEntity> {
        val page = params.key ?: STARTING_PAGE_INDEX
        return try {
            val response = service.getProfiles(page = page)
            LoadResult.Page(
                data = response.asEntities(),
                prevKey = if (page == STARTING_PAGE_INDEX) null else page - 1,
                nextKey = if (response.asEntities().isEmpty()) null else page + 1
            )
        } catch (exception: IOException) {
            return LoadResult.Error(exception)
        } catch (exception: HttpException) {
            return LoadResult.Error(exception)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, ProfileEntity>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(anchorPosition)?.nextKey?.minus(1)
        }
    }
}