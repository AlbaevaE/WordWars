package com.example.demo.service;

import com.example.demo.enums.Level;
import com.example.demo.model.Word;
import com.example.demo.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<Word> getWordsByCategory(Long categoryId) {
        return wordRepository.findAll().stream().filter(x->x.getCategory().getId().equals(categoryId)).collect(Collectors.toList());
    }

    @Override
    public List<Word> getWordsByLevel(Integer level) {
        switch (level){
            case (1): return wordRepository.findAll().stream().filter(x->x.getCategory().getLevel().equals(Level.ELEMENTARY)).collect(Collectors.toList());
            case (2): return wordRepository.findAll().stream().filter(x->x.getCategory().getLevel().equals(Level.PREiNTERMEDIATE)).collect(Collectors.toList());
            case (3): return wordRepository.findAll().stream().filter(x->x.getCategory().getLevel().equals(Level.INTERMEDIATE)).collect(Collectors.toList());
            case (4): return wordRepository.findAll().stream().filter(x->x.getCategory().getLevel().equals(Level.UPPERiNTERMEDIATE)).collect(Collectors.toList());
            case (5): return wordRepository.findAll().stream().filter(x->x.getCategory().getLevel().equals(Level.ADVANCE)).collect(Collectors.toList());
            default: return null;
        }
    }

}
