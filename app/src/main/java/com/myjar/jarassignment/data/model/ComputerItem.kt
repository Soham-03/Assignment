package com.myjar.jarassignment.data.model

import com.google.gson.annotations.SerializedName

//data class ComputerItem(
//    val id: String,
//    val name: String,
//    val data: ItemData? = null
//)
//
//data class ItemData(
//    val color: String? = null,
//    val cdata class ComputerItem(
////    val id: String,
////    val name: String,
////    val data: ItemData? = null
////)
////
////data class ItemData(
////    val color: String? = null,
////    val capacity: String? = null,
////    @SerializedName("price") val price: Double? = null,
////    @SerializedName("capacity GB") val capacityGB: Int? = null,
////    @SerializedName("Screen size") val screenSize: Double? = null,
////    @SerializedName("Description") val description: String? = null,
////    @SerializedName("Generation") val generation: String? = null,
////    @SerializedName("Strap Colour") val strapColour: String? = null,
////    @SerializedName("Case Size") val caseSize: String? = null,
////    @SerializedName("CPU model") val cpuModel: String? = null,
////    @SerializedName("Hard disk size") val hardDiskSize: String? = null
////)apacity: String? = null,
//    @SerializedName("price") val price: Double? = null,
//    @SerializedName("capacity GB") val capacityGB: Int? = null,
//    @SerializedName("Screen size") val screenSize: Double? = null,
//    @SerializedName("Description") val description: String? = null,
//    @SerializedName("Generation") val generation: String? = null,
//    @SerializedName("Strap Colour") val strapColour: String? = null,
//    @SerializedName("Case Size") val caseSize: String? = null,
//    @SerializedName("CPU model") val cpuModel: String? = null,
//    @SerializedName("Hard disk size") val hardDiskSize: String? = null
//)

//class ComputerItem : ArrayList<ComputerItemItem>()

data class ComputerItem(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String
)

data class Data(
    @SerializedName("CPU model")
    val cPUModel: String,
    @SerializedName("capacity")
    val capacity: String,
    @SerializedName("Capacity")
    val Capacityy: String,
    @SerializedName("capacity GB")
    val capacityGB: Int,
    @SerializedName("Case Size")
    val caseSize: String,
    @SerializedName("color")
    val color: String,
    @SerializedName("Color")
    val Colorr: String,
    @SerializedName("Description")
    val description: String,
    @SerializedName("generation")
    val generation: String,
    @SerializedName("Generation")
    val Generationn: String,
    @SerializedName("Hard disk size")
    val hardDiskSize: String,
    @SerializedName("price")
    val price: Double,
    @SerializedName("Price")
    val Pricee: String,
    @SerializedName("Screen size")
    val screenSize: Double,
    @SerializedName("Strap Colour")
    val strapColour: String,
    @SerializedName("year")
    val year: Int
)