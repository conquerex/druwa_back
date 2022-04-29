package com.druwa.order.controller;

import com.druwa.order.model.CafeOrderRequest;
import com.druwa.order.model.CafeOrderResponse;
import com.druwa.order.services.CafeOrderService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "order")
public class CafeOrderController {

    private final CafeOrderService cafeOrderService;

    public CafeOrderController(CafeOrderService cafeOrderService) {
        this.cafeOrderService = cafeOrderService;
    }

    @PostMapping("/")
    @Operation(summary = "주문", description = "주민의 카페 주문")
    public void createOrder(@RequestBody CafeOrderRequest cafeOrderRequest) {
        cafeOrderService.createOrder(cafeOrderRequest);
    }

//    @GetMapping("/list")
//    @Operation(summary = "주문 내역", description = "카페 주문 목록")
//    public List<CafeOrderResponse> getOrderList(@RequestParam String residentId) {
//        return cafeOrderService.getOrderList(residentId);
//    }
}
