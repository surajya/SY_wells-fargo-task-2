package com.wellsfargo.counselor.entity;

import java.time.LocalDateTime;

public class Client {

    private long clientId;
    private String name;
    private String email;
    private long phoneNumber;
    private String address;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private long advisorId;
}
