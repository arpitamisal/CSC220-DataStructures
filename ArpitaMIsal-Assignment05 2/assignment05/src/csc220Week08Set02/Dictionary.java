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

        BOOK_1("Book", "noun", "A written work published in printed or electronic form."),
        BOOK_2("Book", "verb", "To arrange for someone to have a seat on a plane."),
        BOOKABLE("Bookable", "adjective","Can be ordered in advance."),
        BOOKCASE("Bookcase", "noun","A piece of furniture with shelves."),
        BOOKBINDER("Bookbinder", "noun","A person who fastens the pages of books."),
        CSC220_1("CSC220", "noun","Data Structures."),
        CSC220_2("CSC220", "adjective", "Ready to create complex data structures."),
        CSC220_3("CSC220", "verb","To create data structures.");

        private String key;
        private String value;
        private String figureOfSpeech;
        private Entry() {
        }

        private Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }

        private Entry(String key, String figureOfSpeech, String value) {
            this.key = key;
            this.value = value;
            this.figureOfSpeech = figureOfSpeech;
        }

        public String getKey() {
            return this.key;
        }

        public String getValue() {
            return this.value;
        }

        public String getFigureOfSpeech() {
            return this.figureOfSpeech;
        }
    }

    public static void main(String[] args) {

        System.out.println("- DICTIONARY 220 JAVA Standard -----");
        System.out.println("-----      powered by Google Guava -");
        System.out.println("");
        Scanner input = new Scanner(System.in);
        String keyWord = "";
        while (!(keyWord.toLowerCase(Locale.ROOT).equals("!q"))) {
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

            String searchKey = keyWord.toLowerCase(Locale.ROOT).strip();
            String lastWord = keyWord.replaceAll("^.*?(\\w+)\\W*$", "$1");

            if (searchKey.toLowerCase(Locale.ROOT).equals("book")) {
                System.out.println("\t|");
                System.out.println("\t" + Entry.BOOK_1.getKey() + " ["+  Entry.BOOK_1.getFigureOfSpeech() + "] : " + Entry.BOOK_1.value);
                System.out.println("\t" + Entry.BOOK_2.getKey() + " ["+  Entry.BOOK_2.getFigureOfSpeech() + "] : " + Entry.BOOK_2.value);
                System.out.println("\t|");
            } else if(searchKey.toLowerCase(Locale.ROOT).equals("book noun")){
                System.out.println("\t|");
                System.out.println("\t" + Entry.BOOK_1.getKey() + " ["+  Entry.BOOK_1.getFigureOfSpeech() + "] : " + Entry.BOOK_1.value);
                System.out.println("\t|");
            } else if(searchKey.toLowerCase(Locale.ROOT).equals("book verb")){
                System.out.println("\t|");
                System.out.println("\t" + Entry.BOOK_2.getKey() + " ["+  Entry.BOOK_2.getFigureOfSpeech() + "] : " + Entry.BOOK_2.value);
                System.out.println("\t|");
            } else if (searchKey.toLowerCase(Locale.ROOT).equals("bookable") || searchKey.toLowerCase(Locale.ROOT).equals("bookable adjective") ) {
                System.out.println("\t|");
                System.out.println("\t" + Entry.BOOKABLE.getKey() + " ["+  Entry.BOOKABLE.getFigureOfSpeech() + "] : " + Entry.BOOKABLE.value);
                System.out.println("\t|");
            } else if (searchKey.toLowerCase(Locale.ROOT).equals("bookcase") || searchKey.toLowerCase(Locale.ROOT).equals("bookcase noun")) {
                System.out.println("\t|");
                System.out.println("\t" + Entry.BOOKCASE.getKey() + " ["+  Entry.BOOKCASE.getFigureOfSpeech() + "] : " + Entry.BOOKCASE.value);
                System.out.println("\t|");
            } else if (searchKey.toLowerCase(Locale.ROOT).equals("bookbinder") || searchKey.toLowerCase(Locale.ROOT).equals("bookbinder noun")) {
                System.out.println("\t|");
                System.out.println("\t" + Entry.BOOKBINDER.getKey() + " ["+  Entry.BOOKBINDER.getFigureOfSpeech() + "] : " + Entry.BOOKBINDER.value);
                System.out.println("\t|");
            } else if (searchKey.toLowerCase(Locale.ROOT).equals("csc220")) {
                System.out.println("\t|");
                System.out.println("\t" + Entry.CSC220_1.getKey() + " ["+  Entry.CSC220_1.getFigureOfSpeech() + "] : " + Entry.CSC220_1.value);
                System.out.println("\t" + Entry.CSC220_2.getKey() + " ["+  Entry.CSC220_2.getFigureOfSpeech() + "] : " + Entry.CSC220_2.value);
                System.out.println("\t" + Entry.CSC220_3.getKey() + " ["+  Entry.CSC220_3.getFigureOfSpeech() + "] : "+ Entry.CSC220_3.value);
                System.out.println("\t|");
            } else if(searchKey.toLowerCase(Locale.ROOT).equals("csc220 noun")){
                System.out.println("\t|");
                System.out.println("\t" + Entry.CSC220_1.getKey() + " ["+  Entry.CSC220_1.getFigureOfSpeech() + "] : " + Entry.CSC220_1.value);
                System.out.println("\t|");
            } else if(searchKey.toLowerCase(Locale.ROOT).equals("csc220 adjective")){
                System.out.println("\t|");
                System.out.println("\t" + Entry.CSC220_2.getKey() + " ["+  Entry.CSC220_2.getFigureOfSpeech() + "] : " + Entry.CSC220_2.value);
                System.out.println("\t|");
            } else if(searchKey.toLowerCase(Locale.ROOT).equals("csc220 verb")){
                System.out.println("\t|");
                System.out.println("\t" + Entry.CSC220_3.getKey() + " ["+  Entry.CSC220_3.getFigureOfSpeech() + "] : "+ Entry.CSC220_3.value);
                System.out.println("\t|");
            } else if (searchKey.toLowerCase(Locale.ROOT).equals("!q")) {
                System.out.println("");
                System.out.println("-----THANK YOU-----");
            } else if(searchKey.contains(" ")) {
                if ((searchKey.contains("bookable") && (lastWord.toLowerCase(Locale.ROOT).equals("noun") || lastWord.toLowerCase(Locale.ROOT).equals("verb"))) ||
                        (searchKey.contains("bookcase") && (lastWord.toLowerCase(Locale.ROOT).equals("verb") || lastWord.toLowerCase(Locale.ROOT).equals("adjective")))||
                        searchKey.contains("bookbinder") && (lastWord.toLowerCase(Locale.ROOT).equals("adjective") || lastWord.toLowerCase(Locale.ROOT).equals("verb")) ||
                        searchKey.contains("book") && (lastWord.toLowerCase(Locale.ROOT).equals("adjective"))) {
                    System.out.println("\t|");
                    System.out.println("\t <Not found>");
                    System.out.println("\t|");
                }
                else{
                    System.out.println("\t|");
                    System.out.println("\t<2nd argument must be a part of speech or \"distinct\">");
                    System.out.println("\t|");
                    }
            } else if (!(searchKey.equals(dictionaryGG.entries()) )) {
                System.out.println("\t|");
                System.out.println("\t <Not found>");
                System.out.println("\t|");
            }
        }
    }
}

