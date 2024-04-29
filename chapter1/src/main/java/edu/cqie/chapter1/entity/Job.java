package edu.cqie.chapter1.entity;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
@Data
@ToString
public class Job {
    private String company;
    private BigDecimal salary;
}
