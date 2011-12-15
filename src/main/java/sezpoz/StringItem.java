package sezpoz;

@Saveable(id="id1")
public class StringItem implements Appender {
    @Override
    public void append(StringBuilder sb) {
        sb.append("foo");
    }
}
