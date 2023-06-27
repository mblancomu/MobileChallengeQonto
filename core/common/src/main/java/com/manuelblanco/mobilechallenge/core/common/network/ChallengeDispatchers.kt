package com.manuelblanco.mobilechallenge.core.common.network

import javax.inject.Qualifier

/**
 * Created by Manuel Blanco Murillo on 26/6/23.
 */

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class Dispatcher(val challengeDispatcher: ChallengeDispatchers)

enum class ChallengeDispatchers {
    Default,
    IO,
}