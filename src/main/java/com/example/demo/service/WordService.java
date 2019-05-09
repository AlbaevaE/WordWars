package com.example.demo.service;

import com.example.demo.enums.Level;
import com.example.demo.model.Word;

import java.util.List;

public interface WordService {
    Word addNewWord(Word w);
    List<Word>getAllWord();
    Word getWordById(Long id);
    void deleteWord(Long id);
    List<Word> getWordsByCategory(Long categoryId);
    List<Word> getWordsByLevel(Integer level);
}
