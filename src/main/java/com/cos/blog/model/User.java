package com.cos.blog.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity //UserがMySQLにテーブル作成される
public class User {
    @Id//Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)//プロジェクトに繋いでいるDBナンバリングを使用する
    private int id;//auto_increment
    
    @Column(nullable = false, length = 30, unique = true)
    private String username;// id
    
    @Column(nullable = false, length = 100)
    private String password;//ハッシュコードを使用するためLengthが長い
    
    @Column(nullable = false, length = 50)
    private String email;
    
    //DBはRoleTypeはない
    //@ColumnDefault("user")
    @Enumerated(EnumType.STRING)
    private RoleType role;//Enumを使用するのがいい//admin, user, managerドメイン設定できる（範囲を設定）
    
    @Column
    @CreationTimestamp//時間が自動で入力できる
    private Timestamp createDate;
    
}
