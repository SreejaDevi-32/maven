package beansconfig;


/*import com.example.demo.service.MyService;
import com.example.demo.repository.MyRepository;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private final MyService myService;
    private final MyRepository dataRepository;

    @Autowired
    public MyController(MyService myService, MyRepository myRepository) {
        this.myService = myService;
        this.dataRepository = myRepository;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return myService.getMessage() + " Data count: " + dataRepository.getCount();
    }
}