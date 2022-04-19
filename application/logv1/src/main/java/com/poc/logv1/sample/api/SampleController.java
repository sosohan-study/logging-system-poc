package com.poc.logv1.sample.api;

import com.poc.logv1.sample.domain.service.SampleFacadeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/samples")
public record SampleController (
    SampleFacadeService sampleFacadeService
) {

    @GetMapping("/process")
    public void process() {
        sampleFacadeService.process();
    }

    @GetMapping("/exception")
    public void exception() {
        sampleFacadeService.throwException();
    }
}
