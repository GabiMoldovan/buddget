package com.example.buddget.repository;

import com.example.buddget.model.Spending;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpendingRepo extends JpaRepository<Spending, Long> {
}
