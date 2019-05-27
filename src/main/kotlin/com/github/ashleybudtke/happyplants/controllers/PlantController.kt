package com.github.ashleybudtke.happyplants.controllers

import com.github.ashleybudtke.happyplants.domain.Plant
import com.github.ashleybudtke.happyplants.domain.PlantService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class PlantController {

    @Autowired
    lateinit var plantService: PlantService

    @GetMapping(value = ["/api/plants"])
    fun getAllPlants(): List<Plant> {
        return plantService.getAllPlants()
    }

    @GetMapping(value = ["/api/plants/{id}"])
    fun getPlantById(@PathVariable(name = "id") id: Long): Plant {
        return plantService.getPlantById(id)
    }
}