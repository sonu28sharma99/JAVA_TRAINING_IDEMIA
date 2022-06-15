package inversionOfControl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class keys{
    public void run(Engine key){
        key.start();
    }
}

public class Main {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");

        // getBean parameters are => (id, className)
        Engine key = ac.getBean("engine",Bike.class);
        new keys().run(key);

        // CREATING CAR CLASS, THEN CALLING CAR CLASS
        Engine car = ac.getBean("engine1",Car.class);
        new keys().run(car);

        // CREATING AEROPLACE CLASS, THEN CALLING AEROPLACE CLASS
        Engine aeroplace = ac.getBean("aeroplace",Aeroplane.class);
        new keys().run(aeroplace);
    }
}
