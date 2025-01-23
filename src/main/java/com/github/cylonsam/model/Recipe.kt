package com.github.cylonsam.model

import jakarta.persistence.*

@Entity
@Table(name = "recipes")
data class Recipe(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val name: String,
    val description: String,
    @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    val ingredients: List<Ingredient>,
    val instructions: String,
    val prepTime: Int,
    val servings: Int,
)
