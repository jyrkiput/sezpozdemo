package sezpoz;

import definition.Appender;
import definition.Saveable;

public class AnotherItem
{
    @Saveable(id = "id2", type = "anothertype")
    public static final InnerClass inner = new InnerClass();
    
    public static class InnerClass implements Appender {
        
        InnerClass() {
            System.out.println("In constructor of Innerclass");
        }

        @Override
        public void append(StringBuilder sb) {
            sb.append("bar");            
        }
    }
}
