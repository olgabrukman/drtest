package com.example.drtest.index;

import com.example.drtest.com.example.drtest.tokenizer.MyTockenizer;
import com.example.drtest.similarity.SimilarityComparatorImpl1;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class  Index {
    private List<String> index;
    private SimilarityComparatorImpl1 comparator;
    private MyTockenizer tokenizer;

    public Index(SimilarityComparatorImpl1 comparator, MyTockenizer tokenizer) {
        this.comparator = comparator;
        this.tokenizer = tokenizer;
        this.index = new ArrayList<>();
    }

    public synchronized List<Pair<String, Integer>> search(String input) {
        List<Pair<String, Integer>> result = new ArrayList<>();
        for (String str:index){
            int value = comparator.computeSimilarity(tokenizer, str, input);
            if (value > 0){
                Pair<String, Integer> pair = new Pair<>(str, value);
                result.add(pair);
            }
        }
        return result;
    }

    public synchronized boolean add(String str) {
        if (!index.contains(str)) {
            index.add(str);
            return true;
        }
        return false;
    }

    public List<String> list() {
        return index;
    }
}
