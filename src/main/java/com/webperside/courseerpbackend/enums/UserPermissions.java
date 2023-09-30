package com.webperside.courseerpbackend.enums;

import lombok.Getter;

@Getter
public enum UserPermissions {
    USERS_READ("users:read"),
    USERS_WRITE("users:write"),
    ;

    private final String permission;

    UserPermissions(String permission) {
        this.permission = permission;
    }

}
