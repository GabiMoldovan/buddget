package com.example.buddget.model;

import com.example.buddget.model.enums.AgeIntervals;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "user_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Id of the details of a user")
    private Long id;

    @Schema(description = "User's current job")
    private String job;

    @Enumerated(EnumType.STRING)
    @Schema(description = "The user's age interval")
    private AgeIntervals ageInterval;

    @Schema(description = "User's salary")
    private Long salary;

    @OneToOne(mappedBy = "userDetails")
    @Schema(description = "The details of a user")
    private User user;

    public UserDetails(String job, AgeIntervals ageInterval, Long salary, User user) {
        this.job = job;
        this.ageInterval = ageInterval;
        this.salary = salary;
        this.user = user;
    }
}
