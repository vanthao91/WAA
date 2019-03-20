package com.example.demo.serviceImpl;

import com.example.demo.domain.BlocksToDisplay;
import com.example.demo.repository.Blockrepository;
import com.example.demo.service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BlockServiceImp implements BlockService {

    @Autowired
    private Blockrepository blockrepository;

    @Override
    public BlocksToDisplay findByUsername(String blockName) {
        return null;
    }

    @Override
    public BlocksToDisplay findByBlockbyID(String blockName, String id) {
        return null;
    }

    @Override
    public BlocksToDisplay saveBlockTodisplay(BlocksToDisplay user) {
        return null;
    }

    @Override
    public List<BlocksToDisplay> findallBlocks() {

        return blockrepository.findAll();
    }
}
