package me.toyexample.graphql_sample.repository;

import me.toyexample.graphql_sample.domain.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {

    private List<Order> orderList = new ArrayList<>();
}
