package com.toris.user.model.enums;

public enum JoinChannel {
    EMAIL("EMAIL"),
    FACEBOOK("FACEBOOK"),
    KAKAO("KAKAO"),
    NAVER("NAVER")
    ;

    private String channel;

    JoinChannel(String channel) {
        this.channel = channel;
    }
}
