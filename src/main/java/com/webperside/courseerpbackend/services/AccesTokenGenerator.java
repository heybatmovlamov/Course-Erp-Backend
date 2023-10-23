package com.webperside.courseerpbackend.services;

import com.webperside.courseerpbackend.entity.Users;
import com.webperside.courseerpbackend.model.properties.security.JwtData;
import com.webperside.courseerpbackend.model.properties.security.SecurityProperties;
import com.webperside.courseerpbackend.utils.PublicPrivateKeyUtils;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
@RequiredArgsConstructor
@Slf4j
@Component
public class AccesTokenGenerator implements TokenGenerator<Users>{

    private final SecurityProperties securityProperties;




    @Override
    public String generate(Users obj) {
        Claims claims = Jwts.claims();
        claims.put("email",obj.getEmail());

        Date now =  new Date();
        Date exp =  new Date(now.getTime() + securityProperties.getJwt().getAccessTokenValidityTime());

        return Jwts.builder()
                .setSubject(String.valueOf(obj.getId()))
                .setIssuedAt(now)
                .setExpiration(exp)
                .setClaims(claims)
                .signWith(SignatureAlgorithm.RS256,PublicPrivateKeyUtils.getPrivateKey())
                .compact();

    }
}
