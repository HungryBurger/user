package com.toris.user.model.entity.hungryburger;

import javax.persistence.Embeddable;

@Embeddable
public class OrderBase {
    private Address address;
    private String mobile;
    private String addressee;
}
