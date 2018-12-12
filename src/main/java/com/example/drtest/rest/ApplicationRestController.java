package com.example.drtest.rest;

import com.example.drtest.com.example.drtest.tokenizer.WordsTockenizer;
import com.example.drtest.index.Index;
import com.example.drtest.similarity.SimilarityComparatorImpl1;
import javafx.util.Pair;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApplicationRestController {
    private Index index;

    public  ApplicationRestController(){
        index= new Index(new SimilarityComparatorImpl1(), new WordsTockenizer());
    }

    @RequestMapping("/")
    String index() {
        return "Hello Word!";
    }

    @RequestMapping(value = "/index", method = RequestMethod.POST, consumes = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity< String > addEntry(@RequestBody String str) {
        boolean added = index.add(str);
        if (added) {
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }
        return ResponseEntity.status(HttpStatus.CONFLICT).build();
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET, consumes = MediaType.TEXT_PLAIN_VALUE)
    public @ResponseBody
    List<Pair<String, Integer>> searchIndex(@RequestBody String str) {
        return index.search(str);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET,  produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<String> list() {
        return index.list();
    }
}