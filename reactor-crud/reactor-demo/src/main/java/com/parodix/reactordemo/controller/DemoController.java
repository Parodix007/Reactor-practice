package com.parodix.reactordemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/reactor/demo")
public class DemoController {

  @GetMapping
  public Mono<String> demo() {
    return Mono.just("Demo test");
  }
}
