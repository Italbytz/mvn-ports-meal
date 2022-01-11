package io.github.italbytz.ports.meal

import io.github.italbytz.ports.common.Command

interface GetMealsCommand  : Command<MealQuery, List<MealCollection>> {
}

