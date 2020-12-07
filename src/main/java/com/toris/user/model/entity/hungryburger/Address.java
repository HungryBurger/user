package com.toris.user.model.entity.hungryburger;

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

    @Column(nullable = false, name = "address_usage")
    private AddressUsage addressUsage;

    private String name;
    @Column(name="zip_code")
    private String zipCode;
    private String address;

    @Column(name="address_detail")
    private String addressDetail;
    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
