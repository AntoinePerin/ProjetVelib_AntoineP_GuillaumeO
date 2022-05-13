package com.example.projetmaterielmobile.model

data class StationVelib(
    val station_id:Long,
    val name:String,
    val lat:Float,
    val lon:Float,
    val capacity:Int,
    val nbrVelosDispo :Int,
    val nbrDockDispo:Int,
)
