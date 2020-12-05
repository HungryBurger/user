package com.toris.user.model.entity.kobe;

import com.toris.user.model.entity.BaseEntity;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "device")
@NoArgsConstructor
public class Device extends BaseEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "device_id")
    private Long id;
    private String name;
    private String os;
    private String appVersion;
    private String pushToken;
    private String uid;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}