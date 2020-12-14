package com.biblia;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BibleVerses {
    private List<String> verses = null;

    public BibleVerses() {
        this.verses = Arrays.asList("Verš prvý", "Verš druhý");
    }

    public String getVerse(){
        Random random = new Random();
        int i = random.nextInt(verses.size());
        return verses.get(i);
    }

    public static void main(String[] args) {
        BibleVerses bibleVerses = new BibleVerses();
        System.out.println(bibleVerses.getVerse());
    }
}
