package com.metalface.application.mapping;

import com.metalface.application.dto.AccountDTO;
import com.metalface.application.models.Account;
import org.modelmapper.ModelMapper;

public class AccountsMapping {
    private ModelMapper modelMapper;
    private AccountDTO convertToDto(Account account)
    {
        return modelMapper.map(account, AccountDTO.class);
    }

    private Account convertToEntity(AccountDTO accountDTO)
    {
        return modelMapper.map(accountDTO, Account.class);
    }
}
