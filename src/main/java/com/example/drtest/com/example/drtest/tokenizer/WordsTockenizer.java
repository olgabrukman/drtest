package com.example.drtest.com.example.drtest.tokenizer;

import java.util.Arrays;
import java.util.List;

public class WordsTockenizer implements MyTockenizer {
    @Override
    public List<String> split(String str) {
        String[] split1 = str.split(" ");
        return Arrays.asList(split1);
    }
}
