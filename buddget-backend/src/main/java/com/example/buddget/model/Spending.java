package com.example.buddget.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "spendings")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Spending {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "The id of the spending")
    private Long spendingId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @Schema(description = "The user who made the spending")
    private User user;

    @Column(nullable=false, length=128)
    @Schema(description = "The name of the company of the spending")
    private String companyName;

    @Column(nullable = false)
    @Schema(description = "The total price of the spending")
    private float totalPrice;

    @Column(nullable = false)
    @Schema(description = "The date when the spending occurred")
    private LocalDateTime date;

    @OneToMany(mappedBy = "spending", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Schema(description = "List of items purchased in the spending")
    private List<Item> products;

    @Column(length = 256)
    @Schema(description = "Description about the spending")
    private String description;

    @Column(length = 512)
    @Schema(description = "The path to the image")
    private String imagePath;
}
