package com.example.buddget.model;

import com.example.buddget.model.enums.Roles;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "User's id")
    private Long id;

    @Email(regexp=".*@.*\\..*", message = "Email should be valid")
    @Column(unique = true)
    @Schema(description = "User's email")
    private String email;

    @Schema(description = "User's username")
    private String username;

    @Schema(description = "User's password")
    private String password;

    @Enumerated(EnumType.STRING)
    @Schema(description = "User's role")
    private Roles role = Roles.ROLE_USER;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_details_id")
    @Schema(description = "The id of the record in the data base")
    private UserDetails userDetails;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    @Schema(description = "Reference to the logs of a user")
    private List<Log> logs;
}
