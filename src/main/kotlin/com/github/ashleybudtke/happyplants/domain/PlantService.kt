package com.github.ashleybudtke.happyplants.domain

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PlantService {

    @Autowired
    lateinit var plantRepository: PlantRepository

    fun getAllPlants(): List<Plant> {
        return plantRepository.findAll()
    }

    fun getPlantById(id: Long): Plant {
        return plantRepository.findPlantById(id)
    }
}