package hello;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {


    private static final String template = "Hello, %s!" ;
    private final AtomicLong counter = new AtomicLong();


    @RequestMapping("/greeting") // odpowiada endpoint’om http
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name,
                             @RequestParam(value = "age", defaultValue = "0") int age) {

        int a = name.length();
        char[] name1 = name.toCharArray();
        String rodzaj1;
        if(name1[a - 1] == 'a'){
            rodzaj1 = "imie żeńskie";
        } else {
            rodzaj1 ="imie męskie";
        }

        return new Greeting(counter.incrementAndGet(), String.format(template, name), age, rodzaj1);

}


   /* @RequestMapping("/bye") // odpowiada endpoint’om http
    public bye bye(@RequestParam(value = "name", defaultValue = "World") String
                                     name) {
        return new bye(counter.incrementAndGet(), String.format(template2, name));

    } */

    }