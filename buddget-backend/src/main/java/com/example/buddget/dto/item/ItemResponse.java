package com.example.buddget.dto.item;

import com.example.buddget.model.enums.Category;
import io.swagger.v3.oas.annotations.media.Schema;

public record ItemResponse (
        /*
            RESPONSE - the data that the response object is made out of
         */
        @Schema(description = "The Id of the item")
        long itemId,

        @Schema(description = "The name of the item")
        String itemName,

        @Schema(description = "The price per unit per item")
        float pricePerUnit,

        @Schema(description = "The number of units per item")
        float units,

        @Schema(description = "The total price of the item")
        float totalPrice,

        @Schema(description = "The category of the item")
        Category category,

        @Schema(description = "The ID of the spending entry")
        Long spendingId
){
    public ItemResponse(long itemId, String itemName, float pricePerUnit, float units, float totalPrice, Category category, Long spendingId) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.pricePerUnit = pricePerUnit;
        this.units = units;
        this.totalPrice=totalPrice;
        this.category = category;
        this.spendingId = spendingId;
    }
}
