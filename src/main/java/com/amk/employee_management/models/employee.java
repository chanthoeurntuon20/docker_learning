package com.amk.employee_management.models;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tbl_employees",schema = "amk")
public class employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Integer Id;
    @Column(name = "First Name")
    private String firstName;
    @Column(name = "Last Name")
    private String lastName;
    @Column(name = "Email")
    private String email;
    @Column(name = "Phone Number")
    private String phone;
}
