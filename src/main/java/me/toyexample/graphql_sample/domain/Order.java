package me.toyexample.graphql_sample.domain;

import lombok.Data;

@Data
public class Order {

    private String orderId;
    private String description;

    public Order(){

    }

    public Order(String orderId, String description){
        this.orderId = orderId;
        this.description = description;
    }

}