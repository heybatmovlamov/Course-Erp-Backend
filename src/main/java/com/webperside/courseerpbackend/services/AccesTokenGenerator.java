package com.webperside.courseerpbackend.services;

import com.webperside.courseerpbackend.entity.Users;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Component;

@Component
public class AccesTokenGenerator implements TokenGenerator<Users>{
    @Override
    public String generate(Users obj) {
        return Jwts.builder()
                .setSubject(null)
                .setIssuedAt(null)
                .setExpiration(null)
                .setClaims(null)
                .signWith(null,"")
                .compact();
    }
}
