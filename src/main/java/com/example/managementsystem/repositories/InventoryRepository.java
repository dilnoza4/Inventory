package com.example.managementsystem.repositories;

import com.example.managementsystem.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    List<Inventory> findByStockLessThan(int threshold);
}
