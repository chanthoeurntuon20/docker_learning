package com.amk.employee_management.models.req.customers;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NonNull;

import java.util.Date;
@Data
public class AccountReq {
    @JsonIgnore
    private Integer id;
    private Integer cusId;
    private String acctNo;
    @NonNull

    private String acctName;
    private String acctCcy;
    private double amount;
    private String status;
    private Date createdAt;
    private String createdBy;
}
