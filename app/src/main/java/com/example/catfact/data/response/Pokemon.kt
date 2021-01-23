package com.example.catfact.data.response

data class Pokemon(

    val height: String,
    val id: Int,
    val img: String,
    val name: String,
    val num: String,
    val type: List<String>,
    val weight: String
)