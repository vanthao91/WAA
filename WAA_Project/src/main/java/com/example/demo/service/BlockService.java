package com.example.demo.service;

import com.example.demo.domain.Block;
import com.example.demo.domain.BlocksToDisplay;

import java.util.Date;
import java.util.List;

public interface BlockService {
    BlocksToDisplay findByUsername(String blockName);
    BlocksToDisplay findByBlockbyID(String blockName, String id);
    BlocksToDisplay saveBlockTodisplay(BlocksToDisplay block);
    List<BlocksToDisplay> findallBlocks();
    List<Block> getBlockByEntryDate(Date entryDate);
}
