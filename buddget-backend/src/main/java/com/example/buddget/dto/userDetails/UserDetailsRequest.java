package com.example.buddget.dto.userDetails;

import com.example.buddget.model.enums.AgeIntervals;
import com.example.buddget.model.enums.SalaryCurrency;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

public record UserDetailsRequest(
        @Size(min = 2, max = 128, message = "The job must be between 2 and 128 characters")
        @Schema(description = "The user's job")
        String job,

        @Schema(description = "The user's age interval")
        AgeIntervals ageInterval,

        @Min(value = 1, message = "Salary must be at least 1")
        @Schema(description = "The user's salary")
        Long salary,

        @Schema(description = "The user's salary currency")
        SalaryCurrency salaryCurrency
) {
        public UserDetailsRequest(String job, AgeIntervals ageInterval, Long salary, SalaryCurrency salaryCurrency) {
            this.job = job;
            this.ageInterval = ageInterval;
            this.salary = salary;
            this.salaryCurrency = salaryCurrency;
        }
}
