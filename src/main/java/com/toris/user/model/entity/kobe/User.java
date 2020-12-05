package com.toris.user.model.entity.kobe;

import com.toris.user.model.entity.BaseEntity;
import com.toris.user.model.enums.JoinChannel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@Table(name = "user")
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    private String email;
    private String password;
    private LocalDateTime changedPasswordAt;
    private String name;
    private String zipCode;
    private String address;
    private String addressDetail;
    private String phoneNumber;
    private LocalDateTime joinedAt;
    private JoinChannel joinChannel;
    private String extraEmail;

    @OrderBy("role_id asc")
    @ManyToMany
    @JoinTable(name = "user_role",
            joinColumns =  @JoinColumn(name ="USER_ID"), inverseJoinColumns= @JoinColumn(name="ROLE_ID"))
    private Set<Role> roles = new LinkedHashSet<>();

    @OneToMany(mappedBy = "user", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true)
    private Set<Address> addresses = new LinkedHashSet<>();

    @OneToMany(mappedBy = "user", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true)
    private Set<Device> devices = new LinkedHashSet<>();
}
