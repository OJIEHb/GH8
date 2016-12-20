import java.lang.reflect.Field;

/**
 * Created by andrey on 15.12.16.
 */
public class BeanComparator {
    public static<T> void compare(T objectA, T objectB)throws NoSuchFieldException, IllegalAccessException{
        System.out.println("Field                 A         B       Match");
        if(objectA.getClass() != objectB.getClass()){
            System.out.println("Not equals");
            return;
        }
        for(Field fieldA : objectA.getClass().getDeclaredFields()){
            Field fieldB = objectB.getClass().getDeclaredField(fieldA.getName());
            fieldA.setAccessible(true);
            fieldB.setAccessible(true);
            Object fieldAValue = fieldA.get(objectA);
            Object fieldBValue = fieldB.get(objectB);
            boolean meaningMatch = false;
            if(fieldAValue.equals(fieldBValue)){
                meaningMatch = true;
            }
            System.out.printf("%-20s%-10s%-10s%s\n",fieldA.getName(),fieldAValue,fieldBValue,meaningMatch);
        }
    }
}
