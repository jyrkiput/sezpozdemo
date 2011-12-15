package sezpoz;

import net.java.sezpoz.Indexable;

import java.awt.event.ActionListener;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
@Indexable(type=Appender.class)
public @interface Saveable {
    String id();
    String type() default "roottype";
}

