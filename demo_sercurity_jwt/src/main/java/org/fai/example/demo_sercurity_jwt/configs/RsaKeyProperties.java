package org.fai.example.demo_sercurity_jwt.configs;

import org.springframework.boot.context.properties.ConfigurationProperties;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

@ConfigurationProperties(prefix = "rsa")
public record RsaKeyProperties (RSAPublicKey publicKey, RSAPrivateKey privateKey){
}
