package com.amk.employee_management.models.req.customers;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.Data;
import java.util.List;

@Data
public class CustomerReq {
    @JsonIgnore
    private Integer id;
    private String name;
    private String gender;
    private String phoneNumber;
    private String mobileNumber;
    private String address;
    private String status;
    private List<AccountReq> accountReqList;
}
