package com.example.demo.controller;

import com.example.demo.model.Word;
import com.example.demo.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(WordController.URL_WORD)
public class WordController {
    public static final String URL_WORD = "/api/word";

    @Autowired
    private WordService wordService;

    @GetMapping("/{id}")
    public Word getWord(@PathVariable Long id){
        return this.wordService.getWordById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Word addWord(@RequestBody Word w){
        return this.wordService.addNewWord(w);
    }

    @GetMapping
    public List<Word>getAllWords(){
        return this.wordService.getAllWord();
    }

    @DeleteMapping("/{id}")
    public void deleteWord(@PathVariable Long id){
        this.wordService.deleteWord(id);

    }
}
