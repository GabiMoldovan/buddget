package com.example.buddget.dto.user;

import com.example.buddget.dto.spending.SpendingResponse;
import com.example.buddget.model.enums.Roles;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

public record UserResponse(
        @Schema(description = "The id of the user")
        Long id,

        @Schema(description = "The email of the user")
        String email,

        @Schema(description = "The username of the user")
        String username,

        @Schema(description = "The role of the user")
        Roles role,

        @Schema(description = "The list of spendings of the user")
        List<SpendingResponse> spendings
) {
        public UserResponse(Long id, String email, String username, Roles role, List<SpendingResponse> spendings) {
            this.id = id;
            this.email = email;
            this.username = username;
            this.role = role;
            this.spendings = spendings;
        }
}
