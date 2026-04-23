package com.descomplica.FrameBlog.modelos;

import com.descomplica.FrameBlog.enums.RoleEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String name;
    private String email;
    private String password;
    private RoleEnum role;
}
