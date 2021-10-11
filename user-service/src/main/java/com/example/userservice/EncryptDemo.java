package com.example.userservice;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncryptDemo {
    public static void main(String[] args) {
//        $2a$10$/FK01g0jzGvygjONWyne.O.x0ZM2O7ZCW2PyvTQx4wauDbMYgzVtG
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.matches("3333",
                "$2a$10$/FK01g0jzGvygjONWyne.O.x0ZM2O7ZCW2PyvTQx4wauDbMYgzVtG"));
        System.out.println(passwordEncoder.matches("3333",
                "$2a$10$D1SqS6SJuA2KV6v1PqnRGOpR4K4hp7eHcWEAl3uviGnDvXX5PC/n6"));
        System.out.println(passwordEncoder.matches("22222",
                "$2a$10$lQ6Hns9I//E/kMrSdTCMs.8ujSw6YOAnAlWaO/cBP2J79Pz5fFAHS"));
    }
}
