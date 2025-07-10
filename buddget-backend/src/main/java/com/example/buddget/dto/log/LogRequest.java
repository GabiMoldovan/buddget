package com.example.buddget.dto.log;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public record LogRequest(
        @NotBlank
        @Schema(description = "The message of the log")
        @Size(min = 2, max = 512, message = "The message should be between 2 and 512 characters")
        String message,

        @NotNull(message = "Date is mandatory")
        @Schema(description = "The date when the action happened")
        LocalDateTime date
) {
        public LogRequest(String message, LocalDateTime date) {
                this.message = message;
                this.date = date;
        }
}
