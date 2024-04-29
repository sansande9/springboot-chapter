package edu.cqie.chapter1.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Datasource {
    public String Url;
    public String Username;
    public String Password;
}
