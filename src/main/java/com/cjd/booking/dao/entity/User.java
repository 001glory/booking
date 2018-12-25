package com.cjd.booking.dao.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class User {
    @Id
    private Integer id;
    private String username;
    private String password;
}
