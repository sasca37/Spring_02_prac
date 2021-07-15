package com.example.core_prac.member;

public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);
}
