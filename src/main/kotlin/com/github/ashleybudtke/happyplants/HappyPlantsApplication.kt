package com.github.ashleybudtke.happyplants

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HappyPlantsApplication

fun main(args: Array<String>) {
	runApplication<HappyPlantsApplication>(*args)
}
