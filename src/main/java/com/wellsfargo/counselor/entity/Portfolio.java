package com.wellsfargo.counselor.entity;

import java.time.LocalDateTime;

public class Portfolio {
    private long portfolioId;
    private String portfolioName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private long clientId;
}
