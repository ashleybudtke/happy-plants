package com.github.ashleybudtke.happyplants.domain

interface PlantRepository {
    fun getAllPlants(): List<Plant>
    fun getPlantById(id: Long): Plant
}