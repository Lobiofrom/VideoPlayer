package com.example.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Company(
    val bs: String,
    val catchPhrase: String,
    val name: String
)