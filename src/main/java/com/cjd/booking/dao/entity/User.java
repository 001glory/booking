package com.cjd.booking.dao.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class User {
    private Integer id;
    private String username;
    private String password;
}
