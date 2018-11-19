import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class doubboTest {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:doubbo.xml");
        context.start();
        System.in.read();
    }
}
