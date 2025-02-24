package com.example.project.Selection_Sort;
import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSortRunner{
    public static void main(String[] args) {
        ArrayList<String> words = SelectionSort.loadWordsInto(new ArrayList<String>());
        words = SelectionSort.selectionSortWordList(words);
        System.out.println(words);
    }
}