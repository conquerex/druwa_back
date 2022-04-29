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

    @GetMapping("/list")
    @Operation(summary = "주문 내역", description = "카페 주문 목록")
    public List<CafeOrderResponse> getOrderList() {
        return cafeOrderService.getOrderList();
    }

//    @PatchMapping("/restore")
//    @Operation(summary = "주문 복원", description = "완료 혹은 취소처리된 주문을 대기 처리")
//    public void restoreOrder(@RequestBody CafeOrderRequest cafeOrderRequest) {
//        cafeOrderService.restoreOrder(cafeOrderRequest);
//    }

}
