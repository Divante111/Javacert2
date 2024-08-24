package mavenproject.annotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CreatingAnnotations {
    public static void main(String[] args) throws InvocationTargetException {

        //suppressing warnings of unused variables
        //this annotation is broken for some reason
        @SuppressWarnings("unused")
        Cat myCat = new Cat("Stella");
        Dog myDog = new Dog("Jerry");

        if(myCat.getClass().isAnnotationPresent(VeryImportant.class)){
            System.out.println("This thing is very important");
        }   else{
            System.out.println("This thing is not very important");
        }


        System.out.println("--------------------------------");


        for(Method method : myCat.getClass().getDeclaredMethods()){
            System.out.println(method);
            if(method.isAnnotationPresent(RunImmediately.class)){
                try{
                    RunImmediately annotation = method.getAnnotation(RunImmediately.class);

                    for (int i = 0; i < annotation.times(); i++){
                        System.out.println(i);
                        method.invoke(myCat);
                    }
                    
                }
                catch (Exception e){
                    ;
                }
                
            }
        }
        System.out.println("---------------------------------------");
        for(Field field : myCat.getClass().getDeclaredFields()){
            System.out.println(field);
            if (field.isAnnotationPresent(ImportantString.class)){
                try {
                    // variable must be set to public for this to work
                    Object objectValue = field.get(myCat);
                    System.out.println("1");
                    System.out.println(objectValue);
                    if(objectValue instanceof String){
                        System.out.println("this works");
                        System.out.println(((String) objectValue).toUpperCase());
                    }


                } catch (Exception e) {
                    System.out.println("it broke");
                }
                
            }
        }
    }
}
