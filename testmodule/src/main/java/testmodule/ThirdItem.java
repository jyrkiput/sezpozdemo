package testmodule;

import definition.Appender;
import definition.Saveable;

@Saveable(id = "ThirdItem")
public class ThirdItem implements Appender {
    @Override
    public void append(StringBuilder sb) {
        sb.append("ThirdItem");
    }
}
