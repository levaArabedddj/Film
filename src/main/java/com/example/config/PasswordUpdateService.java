package com.example.config;



import com.example.Repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PasswordUpdateService {

    @Autowired
    private UsersRepo usersRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

//    @PostConstruct
//    public void updatePasswords() {
//        List<Users> users = usersRepo.findAll();
//        for (Users user : users) {
//            String password = user.getPassword();
//            if (password != null && !password.startsWith("{bcrypt}")) {
//                user.setPassword(passwordEncoder.encode(password));
//                usersRepo.save(user);
//            }
//        }
//    }
}
