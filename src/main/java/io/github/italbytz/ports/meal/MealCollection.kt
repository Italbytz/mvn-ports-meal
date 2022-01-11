package io.github.italbytz.ports.meal

interface MealCollection {
    val category : Category
    val meals : List<Meal>
}
