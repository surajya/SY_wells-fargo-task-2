package com.wellsfargo.counselor.entity;

import java.time.LocalDateTime;

public class Security {
    private long securityId;
    private String name;
    private LocalDateTime purchaseDate;
    private double purchasePrice;
    private int qualtity;
    private String category;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private long portfolioId;
}
