package mavenproject.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This is a custom annotation
 * // ElementType.TYPE // this can only be used on classes
 * for multiple element types must pass in arguments as an array
 * @Target(ElementType.TYPE) // what annotation this target is allowed to be used on
 * 
 * 
 * keeps the annotation around through the actual running of the program
 * @Retention(RetentionPolicy.RUNTIME)
 * 
 * suppress warnings would be an example of an annotation that you need to get rid of before compilation
 * gets rid of the annotation before java starts to compile your code
 * @Retention(RetentionPolicy.SOURCE)
 * 
 * will get rid of the annotation after compilation and before runtime
 * @Retention(RetentionPolicy.CLASS)
 * 
 * 
 *  */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface VeryImportant {
    
}
