package com.dfx.manuel.model;



import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;


public record Users(
        @Id
        Integer user_id,

        String username,

        String full_name,
        String useremail,
        String phoneNumber,
        Status userstatus,
        Type account_type,
        String password,
        LocalDateTime dateCreated



) {
}
