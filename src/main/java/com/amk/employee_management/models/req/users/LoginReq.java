package com.amk.employee_management.models.req.users;

import lombok.Data;

@Data
public class LoginReq {
    private String userName;
    private String password;
}
