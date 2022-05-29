package com.example.smartlabelling.presentation.presentation.models

import com.example.smartlabelling.presentation.presentation.base.IBaseDiffModel

data class ProductUI(
    override val id: Int,
    val objectId: String,
    var productName: String,
    var productionDate: String,
    var expiryDate: String,
    var manifacturerCountry: String,
    var ingredients: List<String>,
    var category: String,
    var packagingSize: Int,
    val seriesNumber: Int,
    val nutritionDeclaration: NutritionDeclarationUI,
    var consumptionInfo: ConsumptionInfoUI,
    val productImage: String
): IBaseDiffModel

fun com.example.domain.models.Product.toProductUI() = ProductUI(
    id,
    objectId,
    productName,
    productionDate,
    expiryDate,
    manifacturerCountry,
    ingredients,
    category,
    packagingSize,
    seriesNumber,
    nutritionDeclaration.toNutritionDeclarationUI(),
    consumptionInfo.toConsumptionInfoUI(),
    productImage,
)