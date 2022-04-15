package com.druwa.demo.controllers;

import com.druwa.common.api.base.BaseResponseBody;
import com.druwa.demo.repositories.DemoRepositorySupport;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "public/demo")
public class DemoController {

    private final DemoRepositorySupport demoRepositorySupport;

    @Autowired
    public DemoController(DemoRepositorySupport demoRepositorySupport) {
        this.demoRepositorySupport = demoRepositorySupport;
    }

    @GetMapping("/healthcheck")
    @Operation(summary = "샘플용 API", description = "강제로 200 만들기")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "OK !!"),
        @ApiResponse(responseCode = "400", description = "BAD REQUEST !!"),
        @ApiResponse(responseCode = "404", description = "NOT FOUND !!"),
        @ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR !!")
    })
    public ResponseEntity demo() {
        return BaseResponseBody.create(
            200,
            "success - demo",
            demoRepositorySupport.getDemoes()
        );
    }
}
