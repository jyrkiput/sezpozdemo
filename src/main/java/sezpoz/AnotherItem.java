package sezpoz;

public class AnotherItem 
{
    @Saveable(id = "id2", type = "anothertype")
    public static final InnerClass inner = new InnerClass();
    
    public static class InnerClass implements Appender {
        @Override
        public void append(StringBuilder sb) {
            sb.append("bar");            
        }
    }
}
