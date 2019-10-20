package _annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * class marker
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface JsonSerializable {
}
