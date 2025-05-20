package com.daivesh.service;


import com.daivesh.domain.USER_ROLE;
import com.daivesh.model.User;
import com.daivesh.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataInitializationComponent implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;



    @Override
    public void run(String... args) {
        initializeAdminUser();
    }

    private void initializeAdminUser() {
        String adminUsername = "yourusername@gmail.com";

        if (userRepository.findByEmail(adminUsername)==null) {
            User adminUser = new User();

            adminUser.setPassword(passwordEncoder.encode("yourpassword"));
            adminUser.setFullName("You");
            adminUser.setEmail(adminUsername);
            adminUser.setRole(USER_ROLE.ROLE_ADMIN);

            User admin=userRepository.save(adminUser);
        }
    }

}