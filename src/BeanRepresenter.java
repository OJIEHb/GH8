import java.lang.reflect.Field;

/**
 * Created by andrey on 15.12.16.
 */
public class BeanRepresenter {
    public static void represent(Object object) throws IllegalAccessException{
        Class objectsClass = object.getClass();
        System.out.println("Class: " + objectsClass.getName());
        Field[] objectsFields = objectsClass.getDeclaredFields();
        for (Field field:objectsFields) {
            field.setAccessible(true);
            System.out.println(field.getName().toString() + " = " + field.get(object));
        }
    }
}
