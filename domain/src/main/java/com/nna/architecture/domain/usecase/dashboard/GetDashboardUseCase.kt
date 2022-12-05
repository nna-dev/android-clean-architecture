package com.nna.architecture.domain.usecase.dashboard

import com.nna.architecture.domain.model.Dashboard
import com.nna.architecture.domain.repository.ZingRepository
import com.nna.architecture.domain.usecase.FlowUseCase
import com.nna.architecture.domain.usecase.Result
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

data class GetDashboardParams(
    private val id: String,
)

class GetDashboardUseCase(
    private val repository: ZingRepository,
    private val dispatcher: CoroutineDispatcher
): FlowUseCase<GetDashboardParams, Dashboard>(dispatcher) {
    override fun execute(params: GetDashboardParams): Flow<Result<Dashboard>> {
        return repository.getDashboard().map { Result.Success(it) }
    }
}