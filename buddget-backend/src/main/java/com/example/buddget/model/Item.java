package com.example.buddget.model;

import com.example.buddget.model.enums.Category;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "items")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "The id of an item")
    private Long itemId;

    @Column(nullable = false, length = 128)
    @Schema(description = "The name of an item")
    private String itemName;

    @Column(nullable = false)
    private float pricePerUnit;

    @Column(nullable = false)
    private float units;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @Schema(description = "The category of the item")
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "spending_id")
    private Spending spending;

    public Item(String itemName, float pricePerUnit, float units, Category category, Spending spending) {
        this.itemName = itemName;
        this.pricePerUnit = pricePerUnit;
        this.units = units;
        this.category = category;
        this.spending = spending;
    }
}
