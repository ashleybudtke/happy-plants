package com.github.ashleybudtke.happyplants.domain

import com.fasterxml.jackson.annotation.JsonFormat

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
enum class Light(val scale: Int, val description: String) {
    LOW(1, "This is one of those rare plants that prefers low light."),
    LOW_TO_MEDIUM(2, "This plant can tolerate low light, but would prefer medium light."),
    LOW_TO_BRIGHT(3, "This plant can tolerate low light, but will grow much better in bright light."),
    MEDIUM(4, "This plant would like to be placed in a spot with medium light."),
    MEDIUM_TO_BRIGHT_INDIRECT(5, "This plant can tolerate medium light, but would prefer bright light (as long as it's indirect)"),
    MEDIUM_TO_BRIGHT(6, "This plant can tolerate medium light, but would grow much better in bright light."),
    BRIGHT_INDIRECT(7, "This plant needs access to bright, but indirect, light."),
    BRIGHT(8, "This plant would like a spot very close to a window with bright light."),
    FULL_SUN(9, "This plant would love to sit on a windowsill and soak up sun rays all day.")
}