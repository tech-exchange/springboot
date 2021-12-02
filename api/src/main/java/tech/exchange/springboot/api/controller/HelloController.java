package tech.exchange.springboot.api.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author yurun
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
  @GetMapping("/get/{name1}")
  public String get(@PathVariable String name1, @RequestParam(defaultValue = "name2dv") String name2) {
    return "hello " + name1 + " " + name2;
  }

  @PostMapping("/post")
  public String post(@RequestBody PostParams params) {
    return "hello " + params.getName1() + " " + params.getName2();
  }

  @PutMapping("/put")
  public String put(@RequestBody PostParams params) {
    return "hello " + params.getName1() + " " + params.getName2();
  }

  @PatchMapping("/patch")
  public String patch(@RequestBody PostParams params) {
    return "hello " + params.getName1() + " " + params.getName2();
  }

  @DeleteMapping("/delete")
  public String delete(@RequestBody PostParams params) {
    return "hello " + params.getName1() + " " + params.getName2();
  }
}
