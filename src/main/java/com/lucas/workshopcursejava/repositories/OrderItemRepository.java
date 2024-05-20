package com.lucas.workshopcursejava.repositories;

import com.lucas.workshopcursejava.entities.OrderItem;
import com.lucas.workshopcursejava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
