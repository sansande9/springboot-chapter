package edu.cqie.shiyan5.encoder;

public class MyPasswordEncoder implements org.springframework.security.crypto.password.PasswordEncoder{

    @Override
    public String encode(CharSequence rawPassword) {
        return encode(rawPassword).toString();
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return encode(rawPassword).equals(encodedPassword);
    }
}
