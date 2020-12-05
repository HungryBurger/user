package com.toris.user.model.entity.kobe;

import com.toris.user.model.entity.BaseEntity;
import com.toris.user.model.enums.RoleType;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "role")
@NoArgsConstructor
public class Role extends BaseEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "role_name")
    private RoleType name;

    @Column(name = "description")
    private String description;

    public Role(Long roleId) {
        this.id = roleId;
    }
}
