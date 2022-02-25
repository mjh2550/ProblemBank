package com.problem.bank.mjin.common.maria.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Contents {

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
    private String id;
    @Column(nullable = false)
    private String companyId;
    @Column(nullable = false)
    private String contentsId;
    @Column(nullable = false,length = 50)
    private String cate1;
    private String cate2;
    private String cate3;

    @Column(length = 10)
    private String contentsType;
    @Column(nullable = false)
    private String contentsTitle;
    private String contentsDescription;
    private String contentsPath;

    @Temporal(TemporalType.DATE)
    private Date regTime;

    private String regId;

    @Temporal(TemporalType.DATE)
    private Date editTime;

    private String editId;
    private String TMP1;
    private String TMP2;


}
