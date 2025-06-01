package beansconfig;

import org.springframework.stereotype.Repository;

@Repository // Similarly, this annotation can be present
public class MyRepositoryImpl implements MyRepository {

    private int count = 0;

    public MyRepositoryImpl() {
        System.out.println("MyRepositoryImpl initialized via XML configuration.");
        this.count = 100; // Example initial value
    }

    @Override
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
