package com.example.buddget.dto.item;

import com.example.buddget.model.enums.Category;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record ItemRequest (
        /*
            REQUEST - the data that we create the object with
         */
        @Schema(description = "The name of the item")
        @NotBlank(message = "Name of the item is mandatory")
        @Size(min = 2, max = 128, message = "Item name should be between 2 and 128 characters")
        String itemName,

        @Schema(description = "The price per unit per item")
        @NotNull(message = "Price per unit is mandatory")
        float pricePerUnit,

        @Schema(description = "The number of units per item")
        @NotNull(message = "Number of units is mandatory")
        float units,

        @Schema(description = "The category of the item")
        @NotNull(message = "Category is mandatory")
        Category category
) {
    public ItemRequest(String itemName, float pricePerUnit, float units, Category category){
        this.itemName = itemName;
        this.pricePerUnit = pricePerUnit;
        this.units = units;
        this.category = category;
    }
}
