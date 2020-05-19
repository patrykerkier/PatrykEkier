package hello;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class byeController {

    private static final String template = "Bye, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/bye") // odpowiada endpoint’om http
    public bye bye(@RequestParam(value = "name", defaultValue = "World") String
                           name) {
        return new bye(counter.incrementAndGet(), String.format(template, name));

    }

}