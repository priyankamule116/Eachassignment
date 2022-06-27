package com.capgemini.lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class Order_Ques2 {

	public static void main(String[] args) 
    {

        List<Order> orders=Arrays.asList(
                new Order(5000),
                new Order(15000),
                new Order(54666),
                new Order(7000));
        orders.stream()
                .filter(t->t.getPrice()>10000)
                .forEach(t -> System.out.println("order is accepted/completed:"+t));

    }
}


 class Order
{
    int price;

    public Order(int price)
    {
        this.price = price;
    }

    public int getPrice() 
    {
        return price;
    }

    @Override
    public String toString() {
        return "{" +
                "price=" + price +
                '}';
    }
}