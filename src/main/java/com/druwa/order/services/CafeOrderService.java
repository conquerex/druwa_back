package com.druwa.order.services;

import com.druwa.order.entity.CafeOrder;
import com.druwa.order.entity.CafeOrderProduct;
import com.druwa.order.model.CafeOrderProductModel;
import com.druwa.order.model.CafeOrderRequest;
import com.druwa.order.repositories.CafeOrderRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CafeOrderService {

    CafeOrderRepository cafeOrderRepository;

    public CafeOrderService(CafeOrderRepository cafeOrderRepository) {
        this.cafeOrderRepository = cafeOrderRepository;
    }

    public void createOrder(CafeOrderRequest cafeOrderRequest) {
        CafeOrder cafeOrder = new CafeOrder();
        cafeOrder.setOrderName(cafeOrderRequest.getOrderName());
        cafeOrder.setOrderDong(cafeOrderRequest.getOrderDong());
        cafeOrder.setOrderHo(cafeOrderRequest.getOrderHo());
        List<CafeOrderProduct> cafeOrderProducts = new ArrayList<>();
        for (CafeOrderProductModel product : cafeOrderRequest.getOrderProducts()) {
            CafeOrderProduct cafeOrderProduct = new CafeOrderProduct();
            cafeOrderProduct.setOrderMenuId(product.getOrderMenuId());
            cafeOrderProduct.setCafeOrder(cafeOrder);
            cafeOrderProduct.setOrderMenuName(product.getOrderMenuName());
            cafeOrderProduct.setOrderMenuCost(product.getOrderMenuCost());
            cafeOrderProduct.setOrderMenuCount(product.getOrderMenuCount());
            cafeOrderProducts.add(cafeOrderProduct);
        }
        cafeOrder.setCafeOrderProductList(cafeOrderProducts);
        cafeOrderRepository.save(cafeOrder);
    }

}
