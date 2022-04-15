package com.druwa.demo.controllers;

import com.druwa.demo.repositories.DemoRepositorySupport;
import com.druwa.common.api.base.BaseResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/public/v1")
public class DemoController {

    private final DemoRepositorySupport demoRepositorySupport;

    @Autowired
    public DemoController(DemoRepositorySupport demoRepositorySupport) {
        this.demoRepositorySupport = demoRepositorySupport;
    }

    @GetMapping("/demo")
    public ResponseEntity demo() {
        return BaseResponseBody.create(
                200,
                "success - demo",
                demoRepositorySupport.getDemoes()
        );
    }
}
