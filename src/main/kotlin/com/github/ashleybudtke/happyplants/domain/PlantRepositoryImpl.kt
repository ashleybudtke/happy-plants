package com.github.ashleybudtke.happyplants.domain

import org.springframework.stereotype.Repository

@Repository
class PlantRepositoryImpl : PlantRepository {

    //TODO: move this data to a DB
    val tempPlants: List<Plant> = listOf(
            Plant(1, "African Violet"),
            Plant(2, "Areca Palm"),
            Plant(3, "Arrowhead Vine"),
            Plant(4, "Bird of Paradise"),
            Plant(5, "Boston Fern"),
            Plant(6, "Cactus"),
            Plant(7, "Calathea (Prayer Plant)"),
            Plant(8, "Calla Lily"),
            Plant(9, "Cast Iron Plant"),
            Plant(10, "Chinese Evergreen"),
            Plant(11, "Columnea (Goldfish Plant)"),
            Plant(12, "Croton"),
            Plant(13, "Dieffenbachia"),
            Plant(14, "Dracaena"),
            Plant(15, "English Ivy"),
            Plant(16, "Ficus Elastica (Rubber Plant/Tree/Fig)"),
            Plant(17, "Fiddle Leaf Fig"),
            Plant(18, "Grape Ivy"),
            Plant(19, "Hoya"),
            Plant(20, "Jade"),
            Plant(21, "Lucky Bamboo"),
            Plant(22, "Monstera deliciosa (Swiss Cheese Plant)"),
            Plant(23, "Orchid"),
            Plant(24, "Oxalis Triangularis (Purple Shamrock Plant)"),
            Plant(25, "Peace Lily"),
            Plant(26, "Philodendron"),
            Plant(27, "Pilea Peperomia (Chinese Money Plant)"),
            Plant(28, "Pothos"),
            Plant(29, "Ponytail Palm"),
            Plant(30, "Schefflera"),
            Plant(31, "Snake Plant"),
            Plant(32, "Spider Plant"),
            Plant(33, "Succulents"),
            Plant(34, "Weeping Fig"),
            Plant(35, "ZZ Plant")
    )

    override fun getAllPlants(): List<Plant> {
        return tempPlants
    }

    override fun getPlantById(id: Long): Plant {
        return tempPlants.single { plant -> plant.id == id }
    }
}