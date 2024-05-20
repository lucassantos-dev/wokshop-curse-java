package com.lucas.workshopcursejava.repositories;

import com.lucas.workshopcursejava.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
