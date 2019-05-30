package com.github.ashleybudtke.happyplants.domain

import com.fasterxml.jackson.annotation.JsonFormat

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
enum class Water(val scale: Int, val description: String) {
    ALLOW_TO_COMPLETELY_DRY(1, "Allow the soil to dry completely between waterings. Water at most once per month in winter."),
    ALLOW_TO_MOSTLY_DRY(2, "Allow the soil to dry almost completely between waterings."),
    ALLOW_SURFACE_TO_DRY(3, "Allow the surface of soil to dry between waterings."),
    KEEP_MOIST(4, "Keep the soil moist, but avoid over-watering or making the soil soggy. Permit the soil to dry out more in the Fall/Winter."),
    KEEP_ROOTS_SUBMERGED_IN_WATER(5, "This plant can be grown directly in water. Keep the roots submerged at all times and change the water regularly.")
}