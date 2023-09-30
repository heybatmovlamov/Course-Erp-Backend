package com.webperside.courseerpbackend.enums;

import com.google.common.collect.Sets;
import lombok.Getter;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.HashSet;
import java.util.Set;

import static com.webperside.courseerpbackend.enums.UserPermissions.USERS_READ;
import static com.webperside.courseerpbackend.enums.UserPermissions.USERS_WRITE;
@Getter
public enum UsersRole {
    ADMIN(Sets.newHashSet(USERS_READ,USERS_WRITE)),
    USERS(Sets.newHashSet( ));

    private final Set<UserPermissions> permissionsSet;
    UsersRole(Set<UserPermissions> permissionsSet){
        this.permissionsSet = permissionsSet;
    }
}
