package sezpoz;

import net.java.sezpoz.Index;
import net.java.sezpoz.IndexItem;

public class Application {

    public static void main(String[] args) throws InstantiationException {
        StringBuilder sb = new StringBuilder();
        for (final IndexItem<Saveable,Appender> item :
                Index.load(Saveable.class, Appender.class)) {
            sb.append(item.annotation().id()).append(" ").append(item.annotation().type()).append(" ");
            item.instance().append(sb);
            sb.append(System.getProperty("line.separator"));

         }
        System.out.println(sb.toString());
    }
}
