package app.mobius.domain.role

import com.benasher44.uuid.Uuid

data class Resource(
    val uuid: Uuid? = null,
    val name: String,
    val location: String,
)