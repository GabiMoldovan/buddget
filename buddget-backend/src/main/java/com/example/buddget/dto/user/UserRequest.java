package com.example.buddget.dto.user;

import com.example.buddget.dto.userDetails.UserDetailsRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserRequest(
        @Schema(description = "The email of the user")
        @Email(message = "Email should be valid")
        @Size(min = 2, max = 64, message = "The username must be between 2 and 64 characters")
        @NotBlank(message = "Email is mandatory")
        String email,

        @NotBlank(message = "Username is mandatory")
        @Size(min = 2, max = 64, message = "The username must be between 2 and 64 characters")
        @Schema(description = "The username of the user")
        String username,

        @Schema(description = "The password of the user")
        @NotBlank(message = "Password is mandatory")
        @Size(min = 8, max = 64, message = "Password must be between 8 and 64 characters")
        String password,

        @Nullable
        @Schema(description = "The details of a user")
        UserDetailsRequest userDetails
) {
        public UserRequest(String email, String username, String password, UserDetailsRequest userDetails) {
            this.email = email;
            this.username = username;
            this.password = password;
            this.userDetails = userDetails;
        }
}
