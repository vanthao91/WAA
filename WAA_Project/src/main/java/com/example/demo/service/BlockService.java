package com.example.demo.service;

import java.util.Date;
import java.util.List;

import com.example.demo.domain.Block;
import com.example.demo.domain.MeditationRecord;

public interface BlockService {
    List<Block> getBlockByEntryDate(Date entryDate);
    List<Block> getAll();
    Block getById(Integer blockID);
}
