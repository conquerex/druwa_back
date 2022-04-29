package com.druwa.order.model;

import com.druwa.order.entity.CafeOrder;
import com.druwa.order.entity.CafeOrderProduct;

import java.time.LocalDateTime;
import java.util.List;

public class CafeOrderResponse {
    private Long orderId;
    private String orderName;
    private String orderDong;
    private String orderHo;
    private LocalDateTime orderDate;
    private String orderState;
//    private List<CafeOrderProduct> cafeOrderProductList;

    public CafeOrderResponse(CafeOrder cafeOrder) {
        this.orderId = cafeOrder.getId();
        this.orderName = cafeOrder.getOrderName();
        this.orderDong = cafeOrder.getOrderDong();
        this.orderHo = cafeOrder.getOrderHo();
        this.orderDate = cafeOrder.getOrderDate();
        this.orderState = cafeOrder.getOrderState();
//        this.cafeOrderProductList = cafeOrder.getCafeOrderProductList();
    }

    public Long getOrderId() {
        return orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public String getOrderDong() {
        return orderDong;
    }

    public String getOrderHo() {
        return orderHo;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public String getOrderState() {
        return orderState;
    }
}
