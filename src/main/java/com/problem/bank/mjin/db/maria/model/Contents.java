package com.problem.bank.mjin.db.maria.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Data
//@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="contents")
public class Contents implements Serializable {

    /**
     * create TABLE contents (
     * id int auto_increment,
     * company_id NVARCHAR(100) not null,
     * contents_id nvarchar(200) not null,
     * cate1 NVARCHAR(50) not null,
     * cate2 nvarchar(50) ,
     * cate3 NVARCHAR(50) ,
     * contents_type(10),
     * contents_title nvarchar(200) not null,
     * contents_description nvarchar(500),
     * contents_path navrchar(200),
     * reg_time  datetime default NOW(),
     * reg_id    nvarchar(50),
     * edit_time datetime,
     * edit_id   nvarchar(50),
     * TMP1	nvarchar(50) ,
     * TMP2    nvarchar(50) ,
     * primary key (id)
     * );
     *
     *
     */
    /**
     * TODO contents DB 데이터 매핑
     */

    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,unique = true,name = "id")
    private int id;
    @Column(nullable = false,length = 100,name = "company_id")
    private String companyId;
    @Column(nullable = false,length = 200,name = "contents_id")
    private String contentsId;

    @Column(nullable = false,length = 50,name = "cate1")
    private String cate1;
    @Column(length = 50,name="cate2")
    private String cate2;
    @Column(length = 50,name="cate3")
    private String cate3;

    @Column(length = 10,name="contents_type")
    private String contentsType;
    @Column(nullable = false,length = 200,name="contents_title")
    private String contentsTitle;
    @Column(length = 500,name="contents_description")
    private String contentsDescription;
    @Column(length = 200,name="contents_path")
    private String contentsPath;

    @Temporal(TemporalType.DATE)
    @Column(name="reg_time")
    private Date regTime;
    @Column(length = 50,name="reg_id")
    private String regId;

    @Temporal(TemporalType.DATE)
    @Column(name="edit_time")
    private Date editTime;
    @Column(length = 50,name="edit_id")
    private String editId;

    @Column(length = 50,name="TMP1")
    private String TMP1;
    @Column(length = 50,name="TMP2")
    private String TMP2;

}
