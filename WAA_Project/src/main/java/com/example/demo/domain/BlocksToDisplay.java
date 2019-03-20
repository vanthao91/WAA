package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class BlocksToDisplay {
    @Id
    private long blockID;

    private String BlockName;
    @OneToMany
    private List<Course> offeredCourse;

    public Long getBlockID() {
        return blockID;
    }

    public void setBlockID(Long blockID) {
        this.blockID = blockID;
    }

    public String getBlockName() {
        return BlockName;
    }

    public void setBlockName(String blockName) {
        BlockName = blockName;
    }


    public List<Course> getOfferedCourse() {
        return offeredCourse;
    }

    public void setOfferedCourse(List<Course> offeredCourse) {
        this.offeredCourse = offeredCourse;
    }
}
