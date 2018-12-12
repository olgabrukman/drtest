package com.example.drtest.similarity;

import com.example.drtest.com.example.drtest.tokenizer.MyTockenizer;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
/*
 Compute intersection size of unique elements
 */
public class SimilarityComparatorImpl2 {

    public int computeSimilarity(MyTockenizer tokenizer, String str1, String str2) {
        Set<String> set1 = getSet(tokenizer.split(str1));
        Set<String> set2 = getSet(tokenizer.split(str2));
        return SimilarityUtil.intersection(set1, set2).size();
    }

    private Set<String> getSet(List<String> list) {
        Set<String> set = new HashSet<>();
        set.addAll(list);
        return set;
    }
}

