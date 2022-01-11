package io.github.italbytz.ports.meal

interface Meal {
    val name: String
    val image: String
    val price: Price
    val allergens: java.util.EnumSet<Allergens>
    val additives: java.util.EnumSet<Additives>
    val category: Category
}