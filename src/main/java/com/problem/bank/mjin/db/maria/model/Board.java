package com.problem.bank.mjin.db.maria.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name ="board")
public class Board {

    @Id
    @Column(nullable = false, unique = true , length = 50)
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true , length = 50)
    private String contents;

    @Column(nullable = true , length = 50)
    private String writer;

    @Column(nullable = true, length = 50)
    private String regtime;

    @Column(nullable = true, length = 50)
    private String editid;

    @Column(nullable = true, length = 50)
    private String edittime;

    @Builder
    public Board(Long id){
        this.id = id;
    }

}
