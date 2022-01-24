package com.amk.employee_management.models.req.orders;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class OrderDetailReq {
    @JsonIgnore
    private Integer Id;
    private Integer orderId;
    private Integer quantity;
    private Double unitPrice;
    private Double discount;
}
