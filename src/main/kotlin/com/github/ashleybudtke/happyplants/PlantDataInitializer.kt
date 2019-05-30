package com.github.ashleybudtke.happyplants

import com.github.ashleybudtke.happyplants.domain.Light
import com.github.ashleybudtke.happyplants.domain.Plant
import com.github.ashleybudtke.happyplants.domain.PlantRepository
import com.github.ashleybudtke.happyplants.domain.Water
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class PlantDataInitializer : CommandLineRunner {

    @Autowired
    lateinit var plantRepository: PlantRepository

    @Throws(Exception::class)
    override fun run(args: Array<String>) {
        plantRepository.save(Plant(1, "African Violet", Light.BRIGHT_INDIRECT, Water.ALLOW_SURFACE_TO_DRY))
        plantRepository.save(Plant(2, "Areca Palm", Light.BRIGHT_INDIRECT, Water.ALLOW_SURFACE_TO_DRY))
        plantRepository.save(Plant(3, "Arrowhead Vine", Light.LOW_TO_MEDIUM, Water.KEEP_MOIST))
        plantRepository.save(Plant(4, "Bird of Paradise", Light.BRIGHT_INDIRECT, Water.KEEP_MOIST))
        plantRepository.save(Plant(5, "Boston Fern", Light.MEDIUM_TO_BRIGHT, Water.KEEP_MOIST))
        plantRepository.save(Plant(6, "Cactus", Light.FULL_SUN, Water.ALLOW_TO_COMPLETELY_DRY))
        plantRepository.save(Plant(7, "Calathea (Prayer Plant)", Light.LOW_TO_MEDIUM, Water.ALLOW_SURFACE_TO_DRY))
        plantRepository.save(Plant(8, "Calla Lily", Light.BRIGHT, Water.KEEP_MOIST))
        plantRepository.save(Plant(9, "Cast Iron Plant", Light.LOW, Water.ALLOW_SURFACE_TO_DRY))
        plantRepository.save(Plant(10, "Chinese Evergreen", Light.LOW_TO_MEDIUM, Water.KEEP_MOIST))
        plantRepository.save(Plant(11, "Columnea (Goldfish Plant)", Light.BRIGHT, Water.KEEP_MOIST))
        plantRepository.save(Plant(12, "Croton", Light.BRIGHT, Water.ALLOW_SURFACE_TO_DRY))
        plantRepository.save(Plant(13, "Dieffenbachia", Light.LOW_TO_MEDIUM, Water.KEEP_MOIST))
        plantRepository.save(Plant(14, "Dracaena", Light.MEDIUM_TO_BRIGHT, Water.ALLOW_SURFACE_TO_DRY))
        plantRepository.save(Plant(15, "English Ivy", Light.MEDIUM_TO_BRIGHT, Water.KEEP_MOIST))
        plantRepository.save(Plant(16, "Ficus Elastica (Rubber Plant/Tree/Fig)", Light.MEDIUM_TO_BRIGHT, Water.ALLOW_SURFACE_TO_DRY))
        plantRepository.save(Plant(17, "Fiddle Leaf Fig", Light.MEDIUM_TO_BRIGHT, Water.ALLOW_SURFACE_TO_DRY))
        plantRepository.save(Plant(18, "Grape Ivy", Light.MEDIUM, Water.KEEP_MOIST))
        plantRepository.save(Plant(19, "Hoya", Light.MEDIUM_TO_BRIGHT, Water.ALLOW_SURFACE_TO_DRY))
        plantRepository.save(Plant(20, "Jade", Light.BRIGHT, Water.ALLOW_TO_MOSTLY_DRY))
        plantRepository.save(Plant(21, "Lucky Bamboo", Light.MEDIUM_TO_BRIGHT_INDIRECT, Water.KEEP_ROOTS_SUBMERGED_IN_WATER))
        plantRepository.save(Plant(22, "Monstera deliciosa (Swiss Cheese Plant)", Light.BRIGHT_INDIRECT, Water.ALLOW_TO_MOSTLY_DRY))
        plantRepository.save(Plant(23, "Orchid", Light.MEDIUM_TO_BRIGHT_INDIRECT, Water.ALLOW_TO_MOSTLY_DRY))
        plantRepository.save(Plant(24, "Oxalis Triangularis (Purple Shamrock Plant)", Light.MEDIUM_TO_BRIGHT, Water.ALLOW_SURFACE_TO_DRY))
        plantRepository.save(Plant(25, "Peace Lily", Light.MEDIUM_TO_BRIGHT_INDIRECT, Water.KEEP_MOIST))
        plantRepository.save(Plant(26, "Philodendron", Light.MEDIUM_TO_BRIGHT_INDIRECT, Water.ALLOW_SURFACE_TO_DRY))
        plantRepository.save(Plant(27, "Pilea Peperomia (Chinese Money Plant)", Light.MEDIUM_TO_BRIGHT_INDIRECT, Water.ALLOW_SURFACE_TO_DRY))
        plantRepository.save(Plant(28, "Pothos", Light.LOW_TO_BRIGHT, Water.ALLOW_TO_MOSTLY_DRY))
        plantRepository.save(Plant(29, "Ponytail Palm", Light.BRIGHT, Water.ALLOW_TO_MOSTLY_DRY))
        plantRepository.save(Plant(30, "Schefflera", Light.MEDIUM_TO_BRIGHT, Water.KEEP_MOIST))
        plantRepository.save(Plant(31, "Snake Plant", Light.LOW_TO_BRIGHT, Water.ALLOW_SURFACE_TO_DRY))
        plantRepository.save(Plant(32, "Spider Plant", Light.MEDIUM_TO_BRIGHT, Water.KEEP_MOIST))
        plantRepository.save(Plant(33, "Succulents", Light.FULL_SUN, Water.ALLOW_TO_COMPLETELY_DRY))
        plantRepository.save(Plant(34, "Weeping Fig", Light.BRIGHT_INDIRECT, Water.ALLOW_SURFACE_TO_DRY))
        plantRepository.save(Plant(35, "ZZ Plant", Light.LOW_TO_BRIGHT, Water.ALLOW_SURFACE_TO_DRY))
    }
}