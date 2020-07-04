package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SampleController {
    private final SampleService sampleService;

    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @RequestMapping("add")
    public SampleEntity add() {
        return sampleService.generate();
    }

    @RequestMapping("all")
    public List<SampleEntity> all() {
        return sampleService.all();
    }

    @RequestMapping("read")
    public SampleEntity read(@RequestParam String id) {
        return sampleService.read(id).orElseGet(() -> new SampleEntity());
    }

}
