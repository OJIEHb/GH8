import java.lang.reflect.Field;

/**
 * Created by andrey on 15.12.16.
 */
public class CloneCreator {
    public static <T> T clone(T object) throws InstantiationException, IllegalAccessException{
        Class objectsClass = object.getClass();
        T clonedObject = (T)objectsClass.newInstance();
        Field[] fields = objectsClass.getDeclaredFields();
        for(Field field: fields){
            field.setAccessible(true);
            field.set(clonedObject,field.get(object));
        }
        return clonedObject;
    }

}
