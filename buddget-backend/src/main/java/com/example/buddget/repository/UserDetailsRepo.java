package com.example.buddget.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserDetailsRepo extends JpaRepository<UserDetails, Long> {
}
