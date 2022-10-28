package com.example.firstmicroservice.entities;

import com.example.firstmicroservice.enums.AccountType;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = BankAccount.class, name = "p1")
public interface AccountProjection {
    // Préciser les champs qu'on veut afficher dans la projection

    public String getId();
    public AccountType getType();
    public Double getBalance();
}
