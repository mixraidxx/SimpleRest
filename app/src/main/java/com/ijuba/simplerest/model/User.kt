package com.ijuba.simplerest.model


data class User(
    val name: String,
    val lastName: String,
    val city: String,
    val thumbnail: String,
    val id: Int = 0
)