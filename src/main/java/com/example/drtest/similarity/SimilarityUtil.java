package com.example.drtest.similarity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SimilarityUtil {
    public static List<String> intersection(Collection<String> collection1, Collection<String> collection2){
        List<String> result = new ArrayList<>();
        for (String str: collection1){
            if (collection2.contains(str)){
                result.add(str);
            }
        }
        return result;
    }
}
