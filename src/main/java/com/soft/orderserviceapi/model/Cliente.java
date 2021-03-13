package com.soft.orderserviceapi.model;

import lombok.Data;

@Data
public class Cliente {
    private Long id;
    private String name;
    private String phone;
    private String email;
}
