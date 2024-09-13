package org.fai.example.demo_sercurity_jwt.service;

import com.nimbusds.jwt.JWTClaimsSet;
import org.fai.example.demo_sercurity_jwt.payload.Token;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
@Service
public class TokenService {
    JwtEncoder jwtEncoder;
    public TokenService(JwtEncoder jwtEncoder) {
       this.jwtEncoder = jwtEncoder;
    }
    public String generateToken(Authentication authentication){
        Instant now = Instant.now();
        String scope = authentication.getAuthorities().stream()
               .map(GrantedAuthority::getAuthority)
               .collect(Collectors.joining(" "));

        JwtClaimsSet claims = JwtClaimsSet.builder()
                .issuer("T2210a")
                .issuedAt(now)
                .expiresAt(now.plus(1, ChronoUnit.HOURS))
                .claim("email","aptech@gmail.com")
                .claim("scope",scope)
                .build();
        return jwtEncoder.encode(JwtEncoderParameters.from(claims)).getTokenValue();
    }
}
