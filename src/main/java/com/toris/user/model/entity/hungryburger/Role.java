package com.toris.user.model.entity.hungryburger;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {
    GUEST, USER, DORMANT, ADMIN
}
