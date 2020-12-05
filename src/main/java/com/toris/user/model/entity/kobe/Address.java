package com.toris.user.model.entity.kobe;

import com.toris.user.model.entity.BaseEntity;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "address")
@NoArgsConstructor
public class Address extends BaseEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long id;
    private String name;
    private String nickname;
    private String zipCode;
    private String address;
    private String addressDetail;
    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
