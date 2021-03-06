package com.github.princesslana.smalldkt.gateway

import com.github.princesslana.smalldkt.ChannelEvent
import com.github.princesslana.smalldkt.type.Snowflake
import kotlinx.serialization.Serializable

@Serializable
data class TypingStartEvent(
    override val channel_id: Snowflake,
    val guild_id: Snowflake? = null,
    val user_id: Snowflake,
    val timestamp: Int
) : ChannelEvent