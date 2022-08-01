package com.laveces.genesis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;
    private  String AdmNo;
    private String Surname;
    private String FirstName;
    private String OtherNames;
    private String Gender;
    private String DateOfAdm;
    private Date DateOfBirth;
    @CreatedDate
    private Date CreatedAt;
    private String BirthCert;

    /**
     **/
}
