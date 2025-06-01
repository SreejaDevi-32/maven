package beansconfig;


import org.springframework.stereotype.Service;

@Service // While we are configuring this in XML, this annotation can still be present
public class MyServiceImpl implements MyService {

    private String message;

    public MyServiceImpl() {
    }

    public MyServiceImpl(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
