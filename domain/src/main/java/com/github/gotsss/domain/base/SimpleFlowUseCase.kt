package com.github.gotsss.domain.base

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn

/**
 * Executes business logic in its execute method and keep posting updates to the result as
 * [Result<R>].
 * Handling an exception (emit [AppResult.Error] to the result) is the subclasses's responsibility.
 */
// For requests without any input parameter

abstract class SimpleFlowUseCase<out R>(private val coroutineDispatcher: CoroutineDispatcher) {
    operator fun invoke(forceRefresh: Boolean): Flow<AppResult<R>> = execute(forceRefresh)
        .catch { e -> emit(AppResult.Error(Exception(e))) }
        .flowOn(coroutineDispatcher)

    protected abstract fun execute(refresh: Boolean): Flow<AppResult<R>>
}