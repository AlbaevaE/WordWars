package com.example.demo.service;

import com.example.demo.model.Word;
import com.example.demo.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordSerrviceImpl implements WordService {
    @Autowired
    private WordRepository wordRepository;


    @Override
    public Word addNewWord(Word w) {
        return this.wordRepository.save(w);
    }

    @Override
    public List<Word> getAllWord() {
        return this.wordRepository.findAll();
    }

    @Override
    public Word getWordById(Long id) {
        return this.wordRepository.findById(id).get();
    }

    @Override
    public void deleteWord(Long id) {
        this.wordRepository.deleteById(id);
    }
}
