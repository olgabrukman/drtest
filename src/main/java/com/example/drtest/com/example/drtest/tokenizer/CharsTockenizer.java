package com.example.drtest.com.example.drtest.tokenizer;

import java.util.ArrayList;
import java.util.List;

public class CharsTockenizer implements MyTockenizer {
    @Override
    public List<String> split(String str) {
        char[] chars = str.toCharArray();
        List<String> list = new ArrayList<>();
        for (char ch : chars) {
            list.add(ch + "");
        }
        return list;
    }
}

