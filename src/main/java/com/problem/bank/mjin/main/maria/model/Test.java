package com.problem.bank.mjin.main.maria.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name ="test")
public class Test {

    @Id
    @Column(nullable = false, unique = true , length = 50)
    private String id;

    @Column(length = 50)
    private String contents;
}
