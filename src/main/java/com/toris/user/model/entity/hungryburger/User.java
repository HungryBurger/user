package com.toris.user.model.entity.hungryburger;

import com.toris.user.model.entity.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@Table(name = "user")
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "user_id")
    private String user_id;

    @Column(nullable = false)
    private String name;

    private String mobile;
    private String password;
    private String email;

    @Column(name="password_change_at")
    private String passwordChangeAt;

    @Column(name="join_at")
    private String joinAt;

    @OneToMany(mappedBy = "user", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true)
    private Set<com.toris.user.model.entity.hungryburger.Address> addresses = new LinkedHashSet<>();



}