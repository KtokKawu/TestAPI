package example.api;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // Annotation for Web API function.
public class Controller {

  private final String template = "Hello, %s";
  private final AtomicLong counter = new AtomicLong();

  @RequestMapping("/test")
  public String test() {
    return "Hello, test API !";
  }

  @RequestMapping("/uinfo")
  public UserInfo uinfo(@RequestParam(value = "name", defaultValue = "API !") String name) {
    return new UserInfo(counter.incrementAndGet(), String.format(template, name));
  }
}
