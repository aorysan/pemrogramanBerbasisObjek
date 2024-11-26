package percobaan1;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class CobaHashSet {
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        Set mSetCity = new HashSet();

        mSetCity.add("Malang");
        mSetCity.add("Banyuwangi");
        mSetCity.add("Yogyakarta");
        mSetCity.add("Batu");
        // set.add("Malang");

        System.out.println(mSetCity);
        Iterator<String> mIterator = mSetCity.iterator();

        while(mIterator.hasNext()) {
            System.out.println(mIterator.next().toLowerCase());
        }

    }
}
