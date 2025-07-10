package com.example.buddget.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "logs")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Id of a log")
    private Long logId;

    @Schema(description = "Description of the action that the user performed")
    private String message;

    @Schema(description = "The date at which the action happened")
    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @Schema(description = "The id of the user to which the log belongs to")
    private User user;

    public Log(String message, LocalDateTime timestamp, User user) {
        this.message = message;
        this.timestamp = timestamp;
        this.user = user;
    }
}
