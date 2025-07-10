package com.example.buddget.dto.log;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

public record LogResponse(
        @Schema(description = "The id of the log")
        long id,

        @Schema(description = "The message of the log")
        String message,

        @Schema(description = "The date when the action happened")
        LocalDateTime date
) {
        public LogResponse(long id, String message, LocalDateTime date) {
                this.id = id;
                this.message = message;
                this.date = date;
        }
}
