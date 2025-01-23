package com.github.cylonsam.model

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "ingredients")
data class Ingredient(
    @Id
    val id: Int,
    val name: String,
    val quantity: Int,
    val unit: String
)
