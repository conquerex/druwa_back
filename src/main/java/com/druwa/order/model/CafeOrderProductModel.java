package com.druwa.order.model;

public class CafeOrderProductModel {
    private String orderMenuId;
    private String orderMenuName;
    private String orderMenuCost;
    private String orderMenuCount;

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

    public String getOrderMenuCost() {
        return orderMenuCost;
    }

    public void setOrderMenuCost(String orderMenuCost) {
        this.orderMenuCost = orderMenuCost;
    }

    public String getOrderMenuCount() {
        return orderMenuCount;
    }

    public void setOrderMenuCount(String orderMenuCount) {
        this.orderMenuCount = orderMenuCount;
    }
}
