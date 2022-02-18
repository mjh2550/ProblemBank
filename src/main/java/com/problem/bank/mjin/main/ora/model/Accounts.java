package com.problem.bank.mjin.main.ora.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.security.Timestamp;
import java.sql.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name ="accounts")
public class Accounts {

    @Id
    @Column(name = "USERID" , nullable = false, unique = true , length = 20)
    private String USERID;

    @Column(name = "PW" , nullable = false, length = 100)
    private String PW;

    @Column(name = "KORNAME" , nullable = false, length = 20)
    private String KORNAME;

    @Column(name = "ENGNAME" , length = 30)
    private String ENGNAME;

    @Column(name = "EMAIL" , length = 50)
    private String EMAIL;

    @Temporal(TemporalType.DATE)
    @Column(name = "BIRTHDAY")
    private java.util.Date BIRTHDAY;

    @Temporal(TemporalType.DATE)
    @Column(name = "EDITTIME")
    private java.util.Date EDITTIME;

    @Temporal(TemporalType.DATE)
    @Column(name = "REGTIME")
    private java.util.Date REGTIME;

}
