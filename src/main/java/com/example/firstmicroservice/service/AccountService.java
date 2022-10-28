package com.example.firstmicroservice.service;

import com.example.firstmicroservice.dto.BankAccountRequestDTO;
import com.example.firstmicroservice.dto.BankAccountResponseDTO;
import com.example.firstmicroservice.entities.BankAccount;
import com.example.firstmicroservice.enums.AccountType;

public interface AccountService {
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO );
}
