package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Entity
public class Attendance {
    @Id
    private Long attendanceID;

    @OneToMany
    private List<Block> blocks;

    private  String blockName;

    private HashMap<Date, Boolean> attendanceDates;

    private double attendancePercentage;

    private double extraCreditPoints;
    //private int numberOfDatesAttended;


    public List<Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<Block> blocks) {
        this.blocks = blocks;
    }

    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    public HashMap<Date, Boolean> getAttendanceDates() {
        return attendanceDates;
    }

    public void setAttendanceDates(HashMap<Date, Boolean> attendanceDates) {
        this.attendanceDates = attendanceDates;
    }

    public double getAttendancePercentage() {
        return attendancePercentage;
    }

    public void setAttendancePercentage(double attendancePercentage) {
        this.attendancePercentage = attendancePercentage;
    }

    public double getExtraCreditPoints() {
        return extraCreditPoints;
    }

    public void setExtraCreditPoints(double extraCreditPoints) {
        this.extraCreditPoints = extraCreditPoints;
    }

}
