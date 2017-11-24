package cs410.javacafe.Processing;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


public class PassHash {
    private String hashedPass;

    public PassHash(String unsaltedPass){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        encoder.encode(unsaltedPass);
    }

    public String getHashedPass() {
        return hashedPass;
    }
}
