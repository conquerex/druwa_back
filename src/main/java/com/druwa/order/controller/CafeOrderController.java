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

    @PatchMapping("/restore/{orderId}")
    @Operation(summary = "주문 복원", description = "완료 혹은 취소처리된 주문을 대기 처리")
    public void restoreOrder(@PathVariable("orderId") long orderId) {
        cafeOrderService.restoreOrder(orderId);
    }

    @PatchMapping("/cancel/{orderId}")
    @Operation(summary = "주문 취소", description = "제품이나 서비스가 제공되기 전에 주문을 취소")
    public void cancelOrder(@PathVariable("orderId") long orderId) {
        cafeOrderService.cancelOrder(orderId);
    }

    @PatchMapping("/complete/{orderId}")
    @Operation(summary = "주문 완료", description = "주문한 제품과 서비스를 제공하고 완료처리 함")
    public void completeOrder(@PathVariable("orderId") long orderId) {
        cafeOrderService.completeOrder(orderId);
    }

}
