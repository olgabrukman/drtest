package com.example.drtest.similarity;

import com.example.drtest.com.example.drtest.tokenizer.MyTockenizer;

public interface SimilarityComparator {
    public int computeSimilarity(MyTockenizer tokenizer, String str1, String str2);
}
