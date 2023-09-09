package com.metalface.application.mapping;

import com.metalface.application.dto.AccountDTO;
import com.metalface.application.models.Account;
import org.springframework.stereotype.Component;

import javax.annotation.processing.Generated;
import java.util.Date;
import java.util.UUID;

@Generated(
        value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class AccountsMapperImpl implements AccountsMapper {
    @Override
    public AccountDTO AccountToAccountDTO(Account account)
    {
        if (account == null)
        {
            return null;
        }

        AccountDTO accountDTO = new AccountDTO();

        if (account.getAccountId() != null)
        {
            accountDTO.setAccountId(account.getAccountId());
        }

        if (account.getUsername() != null)
        {
            accountDTO.setUsername(account.getUsername());
        }

        if (account.getEmail() != null)
        {
            accountDTO.setEmail(account.getEmail());
        }

        if (account.getPassword() != null)
        {
            accountDTO.setPassword(account.getPassword());
        }

        if (account.getRole() != null)
        {
            accountDTO.setRole(account.getRole());
        }

        if (account.getCreatedAt() != null)
        {
            accountDTO.setCreatedAt(account.getCreatedAt());
        }

        if (account.getUpdatedAt() != null)
        {
            accountDTO.setUpdatedAt(account.getUpdatedAt());
        }

        return accountDTO;
    }

    @Override
    public Account AccountDTOToAccount(AccountDTO accountDTO)
    {
        if (accountDTO == null)
        {
            return null;
        }

        Account account = new Account();

        if (accountDTO.getAccountId() != null)
        {
            account.setAccountId(accountDTO.getAccountId());
        }

        if (accountDTO.getUsername() != null)
        {
            account.setUsername(accountDTO.getUsername());
        }

        if (accountDTO.getPassword() != null)
        {
            account.setPassword(accountDTO.getPassword());
        }

        if (accountDTO.getEmail() != null)
        {
            account.setEmail(accountDTO.getEmail());
        }

        if (accountDTO.getRole() != null)
        {
            account.setRole(accountDTO.getRole());
        }

        if (accountDTO.getCreatedAt() != null)
        {
            account.setCreatedAt(accountDTO.getCreatedAt());
        }

        if (accountDTO.getUpdatedAt() != null)
        {
            account.setUpdatedAt(account.getUpdatedAt());
        }

        return account;
    }
}
