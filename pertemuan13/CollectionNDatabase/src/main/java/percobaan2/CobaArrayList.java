package percobaan2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CobaArrayList {
    public static void main(String[] args) {
        List mListCountry = new ArrayList();

        mListCountry.add("Indonesia");
        mListCountry.add("Malaysia");
        mListCountry.add("Jerman");

        // System.out.println(mListCountry);

        // System.out.format("List index 0 : %s\n", mListCountry.get(0));
        // System.out.format("List index 2 : %s\n", mListCountry.get(2));

        System.out.println("Country List");

        Iterator<String> mIterator = mListCountry.iterator();

        while(mIterator.hasNext()) {
            Object elemen = mIterator.next();
            System.out.printf("%s ", elemen);
        }

    }
}
