package české.řazení;

import java.text.Collator;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.Collections;
import java.util.Locale;

public class ČeskéŘazení {

    public static void main(String[] args) {
        ArrayList<String> seznam
                = new ArrayList<>(asList("ch", "c", "i", "í", "ž",
                "a", "A", "abcz", "abc", "Abc"));
        
        Collator col = Collator.getInstance(new Locale("cs", "CZ"));
        col.setStrength(Collator.PRIMARY);
        Collections.sort(seznam, col);
        
        for (int i = 0; i < seznam.size(); i++) {
            System.out.print(seznam.get(i)+" ");
        }
    }
}
