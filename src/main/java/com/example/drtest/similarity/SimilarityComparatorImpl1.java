package com.example.drtest.similarity;

import com.example.drtest.com.example.drtest.tokenizer.MyTockenizer;

import java.util.ArrayList;
import java.util.List;
/*
 Compute intersection size
 */
public class SimilarityComparatorImpl1 {
    public int computeSimilarity(MyTockenizer tokenizer, String str1, String str2){
        List<String> list1 = tokenizer.split(str1);
        List<String> list2 = tokenizer.split(str2);
        return SimilarityUtil.intersection(list1, list2).size();
    }
}
