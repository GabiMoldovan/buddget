package com.example.buddget.repository;

import com.example.buddget.model.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepo extends JpaRepository<Log, Long> {
}
