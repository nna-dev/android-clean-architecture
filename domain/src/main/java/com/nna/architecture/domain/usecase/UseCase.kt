package com.nna.architecture.domain.usecase

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext

abstract class UseCase<in P, out R>(private val dispatcher: CoroutineDispatcher) {
    suspend operator fun invoke(params: P): Result<R> {
        return try {
            withContext(dispatcher) {
                execute(params).let {
                    Result.Success(it)
                }
            }
        } catch (e: Exception) {
            Result.Error(e)
        }
    }

    protected abstract suspend fun execute(params: P): R
}