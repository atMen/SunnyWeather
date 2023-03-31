package com.example.sunnyweather.logic.model
import com.google.gson.annotations.SerializedName
data class PlaceResponse(var status: String,var places: List<Place>)
data class Place(var name: String,var location: Location, @SerializedName("formatted_address") var address: String)
data class Location(var lng: String, var lat: String)