package me.toyexample.graphql_sample.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import me.toyexample.graphql_sample.domain.Coffee;
import me.toyexample.graphql_sample.domain.Order;
import me.toyexample.graphql_sample.repository.CoffeeRepository;
import me.toyexample.graphql_sample.repository.OrderRepository;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    private final CoffeeRepository coffeeRepository;
    private final OrderRepository orderRepository;

    public Query(CoffeeRepository coffeeRepository, OrderRepository orderRepository) {
        this.coffeeRepository = coffeeRepository;
        this.orderRepository = orderRepository;
    }

    public Coffee coffee(String name){
        return coffeeRepository.findByName(name);
    }

    public Order order(String orderId){
        return null;
    }
}