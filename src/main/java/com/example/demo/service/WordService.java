package com.example.demo.service;

import com.example.demo.model.Word;

import java.util.List;

public interface WordService {
    Word addNewWord(Word w);
    List<Word>getAllWord();
    Word getWordById(Long id);
    void deleteWord(Long id);
}
