package com.myapp.ordernow.repositories;

import com.myapp.ordernow.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderTestRepository extends JpaRepository<Order, Long> {

    Order findByName(String name);
}
