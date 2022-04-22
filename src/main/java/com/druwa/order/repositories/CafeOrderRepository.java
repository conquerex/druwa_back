package com.druwa.order.repositories;

import com.druwa.order.entity.CafeOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CafeOrderRepository extends JpaRepository<CafeOrder, Long> {
    //
}
