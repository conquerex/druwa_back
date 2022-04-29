package com.druwa.order.model;

public class CafeOrderProductModel {
    private String orderMenuId;
    private String orderMenuName;
    private int orderMenuCost;
    private int orderMenuCount;

    public String getOrderMenuId() {
        return orderMenuId;
    }

    public void setOrderMenuId(String orderMenuId) {
        this.orderMenuId = orderMenuId;
    }

    public String getOrderMenuName() {
        return orderMenuName;
    }

    public void setOrderMenuName(String orderMenuName) {
        this.orderMenuName = orderMenuName;
    }

    public int getOrderMenuCost() {
        return orderMenuCost;
    }

    public void setOrderMenuCost(int orderMenuCost) {
        this.orderMenuCost = orderMenuCost;
    }

    public int getOrderMenuCount() {
        return orderMenuCount;
    }

    public void setOrderMenuCount(int orderMenuCount) {
        this.orderMenuCount = orderMenuCount;
    }
}
