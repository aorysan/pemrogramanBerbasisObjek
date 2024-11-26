package percobaan3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class CobaHashMap {
    public static void main(String[] args) {
        HashMap hMapItem = new HashMap();

        hMapItem.put("1", "Apple");
        hMapItem.put("2", "Orange");
        hMapItem.put("3", "Pear");
        System.out.println(hMapItem);

        Collection mCollection = hMapItem.values();
        Iterator mIterator = mCollection.iterator();
        System.out.println();

        while(mIterator.hasNext()) {
            System.out.println(mIterator.next());
        }

        System.out.println();
        System.out.printf("HashMap item total : %d\n\n", hMapItem.size());

        Object mObject = hMapItem.remove("1");

        System.out.printf("%s remove from HashMap\n", mObject);
        System.out.printf("HashMap item total : %d\n", hMapItem.size());
        System.out.println(hMapItem);

        hMapItem.clear();
        System.out.println("\nHashMap telah dibersihkan");
        System.out.printf("HashMap item total : %d\n", hMapItem.size());
    }
}
