package sezpoz;

import definition.Appender;
import definition.Saveable;

@Saveable(id="id1")
public class StringItem implements Appender {

    public StringItem() {
        System.out.println("In constructor of StringItem");
    }

    @Override
    public void append(StringBuilder sb) {
        sb.append("foo");
    }
}
