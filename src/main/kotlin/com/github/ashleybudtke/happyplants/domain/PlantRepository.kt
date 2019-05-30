package com.github.ashleybudtke.happyplants.domain

import org.springframework.data.mongodb.repository.MongoRepository

interface PlantRepository : MongoRepository<Plant, Long> {
    fun findPlantById(id: Long): Plant
}