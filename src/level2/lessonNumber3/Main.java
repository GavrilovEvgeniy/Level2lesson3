package level2.lessonNumber3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.TreeSet;

public class Main {

    public static String quote = "O how this spring of love resembleth " +
                                 "The uncertain glory of an April day " +
                                 "Which now shows all the beauty of the sun " +
                                 "And by and by a cloud takes all away";

    private static TreeSet<String> getWords(String[] array) {
        return new TreeSet<>(Arrays.asList(array));
    }

    private static HashMap<String, Integer> getNumber(String[] array) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s: array) {
            map.merge(s, 1, Integer::sum);
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(getWords(quote.toLowerCase().split(" ")));
        System.out.println(getNumber(quote.toLowerCase().split(" ")));

        PhoneBook phbook = new PhoneBook();
        phbook.add("Vasin", "777-30-20");
        phbook.add("Petin", "999-11-22");
        phbook.add("Kolin", "222-34-43");
        phbook.add("Petin", "123-45-67");

        System.out.println("Phone Vasin " + phbook.get("Vasin"));
        System.out.println("Phone Petin " + phbook.get("Petin"));
        System.out.println("Phone Kolin " + phbook.get("Kolin"));
    }
}
