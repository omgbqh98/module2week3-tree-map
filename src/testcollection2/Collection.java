package testcollection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Collection {

    public static void main(String[] args) {
        java.util.Collection <String> collection = new ArrayList<>();
        collection.add("huynh");
        collection.add("xcvccvc");

        java.util.Collection<String> collection1 = new ArrayList<>();
        collection1.add("adfd");
//        collection
            collection.addAll(collection1);
        collection.toArray();
//    collection.clear();
        collection.remove("huynh");
//        collection.containsAll;
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
