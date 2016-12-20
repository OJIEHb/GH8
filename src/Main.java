import beans.Car;
import beans.Cat;
import beans.Human;

/**
 * Created by andrey on 15.12.16.
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException{
        Cat cat = new Cat("Black",3,4,35);
        Car car = new Car("Black",190,"Sedan","RX-7");
        Human human = new Human(180,"male",22,75);
        BeanRepresenter.represent(cat);
        Human humanClone = CloneCreator.clone(human);
        BeanRepresenter.represent(humanClone);
        BeanComparator.compare(car, new Car("Black",190,"Coupe","RX-8"));
    }
}
