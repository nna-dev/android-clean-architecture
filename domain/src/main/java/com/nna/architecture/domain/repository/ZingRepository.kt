package com.nna.architecture.domain.repository

import com.nna.architecture.domain.model.Dashboard
import kotlinx.coroutines.flow.Flow

interface ZingRepository {
    fun getDashboard(): Flow<Dashboard>
}