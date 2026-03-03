package csc220Week08Set02;

import java.util.Locale;
import java.util.Scanner;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class Dictionary{

    /**
     * Google Guava Search
     */

    private enum Entry {

        BOOK_1("Book", "A written work published in printed or electronic form."),
        BOOK_2("Book", "To arrange for someone to have a seat on a plane."),
        BOOKABLE("Bookable", "Can be ordered in advance."),
        BOOKCASE("Bookcase", "A piece of furniture with shelves."),
        BOOKBINDER("Bookbinder", "A person who fastens the pages of books."),
        CSC220_1("CSC220", "Data Structures."),
        CSC220_2("CSC220", "Ready to create complex data structures."),
        CSC220_3("CSC220", "To create data structures.");

        private String key;
        private String value;
        private Entry() {
        }

        private Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return this.key;
        }

        public String getValue() {
            return this.value;
        }
    }

    public static void main(String[] args) {

        System.out.println("- DICTIONARY 220 JAVA Standard -----");
        System.out.println("-----      powered by Google Guava -");
        System.out.println("");
        Scanner input = new Scanner(System.in);
        String keyWord = "";
        while (!(keyWord.equals("!q"))) {
            System.out.print("Search: ");
            keyWord = input.nextLine();
            Multimap<String, String> dictionaryGG = ArrayListMultimap.create();

            // Adding some key/value
            dictionaryGG.put(Entry.BOOK_1.getKey(), Entry.BOOK_1.getValue());
            dictionaryGG.put(Entry.BOOK_2.getKey(), Entry.BOOK_2.getValue());
            dictionaryGG.put(Entry.BOOKABLE.getKey(), Entry.BOOKABLE.getValue());
            dictionaryGG.put(Entry.BOOKCASE.getKey(), Entry.BOOKCASE.getValue());
            dictionaryGG.put(Entry.BOOKBINDER.getKey(), Entry.BOOKBINDER.getValue());
            dictionaryGG.put(Entry.CSC220_1.getKey(), Entry.CSC220_1.getValue());
            dictionaryGG.put(Entry.CSC220_2.getKey(), Entry.CSC220_2.getValue());
            dictionaryGG.put(Entry.CSC220_3.getKey(), Entry.CSC220_3.getValue());

            String searchKey = keyWord.toLowerCase(Locale.ROOT);
            if (searchKey.toLowerCase(Locale.ROOT).equals("book")) {
                System.out.println("\t|");
                System.out.println("\t" + Entry.BOOK_1.getKey() + ": " + Entry.BOOK_1.value);
                System.out.println("\t" + Entry.BOOK_2.getKey() + ": " + Entry.BOOK_2.value);
                System.out.println("\t|");
            } else if (searchKey.toLowerCase(Locale.ROOT).equals("bookable")) {
                System.out.println("\t|");
                System.out.println("\t" + Entry.BOOKABLE.getKey() + ": " + Entry.BOOKABLE.value);
                System.out.println("\t|");
            } else if (searchKey.toLowerCase(Locale.ROOT).equals("bookcase")) {
                System.out.println("\t|");
                System.out.println("\t" + Entry.BOOKCASE.getKey() + ": " + Entry.BOOKCASE.value);
                System.out.println("\t|");
            } else if (searchKey.toLowerCase(Locale.ROOT).equals("bookbinder")) {
                System.out.println("\t|");
                System.out.println("\t" + Entry.BOOKBINDER.getKey() + ": " + Entry.BOOKBINDER.value);
                System.out.println("\t|");
            } else if (searchKey.toLowerCase(Locale.ROOT).equals("csc220")) {
                System.out.println("\t|");
                System.out.println("\t" + Entry.CSC220_1.getKey() + ": " + Entry.CSC220_1.value);
                System.out.println("\t" + Entry.CSC220_2.getKey() + ": " + Entry.CSC220_2.value);
                System.out.println("\t" + Entry.CSC220_3.getKey() + ": " + Entry.CSC220_3.value);
                System.out.println("\t|");
            } else if (searchKey.equals("!q")) {
                System.out.println("");
                System.out.println("-----THANK YOU-----");
            } else if (!(searchKey.equals(dictionaryGG.entries()))) {
                System.out.println("\t|");
                System.out.println("\t <Not found>");
                System.out.println("\t|");
            }
        }
    }
}