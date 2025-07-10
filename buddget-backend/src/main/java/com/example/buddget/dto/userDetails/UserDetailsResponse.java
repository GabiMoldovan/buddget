package com.example.buddget.dto.userDetails;

import com.example.buddget.model.enums.AgeIntervals;
import com.example.buddget.model.enums.SalaryCurrency;
import io.swagger.v3.oas.annotations.media.Schema;

public record UserDetailsResponse(
        @Schema(description = "The id of the user details entry")
        Long id,

        @Schema(description = "The user's job")
        String job,

        @Schema(description = "The user's age interval")
        AgeIntervals ageInterval,

        @Schema(description = "The user's salary")
        Long salary,

        @Schema(description = "The user's salary currency")
        SalaryCurrency salaryCurrency
) {
}
