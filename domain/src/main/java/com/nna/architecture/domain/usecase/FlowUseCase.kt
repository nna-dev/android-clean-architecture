package com.nna.architecture.domain.usecase

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import java.lang.Exception

abstract class FlowUseCase<in P, out R>(private val dispatcher: CoroutineDispatcher) {
    operator fun invoke(params: P): Flow<Result<R>> = execute(params)
        .catch { e -> emit(Result.Error(Exception(e))) }
        .flowOn(dispatcher)

    protected abstract fun execute(params: P): Flow<Result<R>>
}