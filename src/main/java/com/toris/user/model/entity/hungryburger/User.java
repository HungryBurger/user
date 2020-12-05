package com.toris.user.model.entity.hungryburger;

import com.toris.user.model.entity.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class User extends BaseEntity {
    @Column(nullable = false)
    private Long mbr_seq;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String password;
    private String passwordDtm;
    @Column(nullable = false)
    private String joinDtm;
    private String nickname;
    @Column(nullable = false)
    private String name;
    @Embedded
    private Address address;
    @Column(nullable = false)
    private String profilePicture;
    @Column(nullable = false)
    private String email;
    private String emailChangeDtm;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Embedded
    private OrderBase orderbase;

}