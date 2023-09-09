package com.metalface.application.managers;

import com.metalface.application.dto.AccountDTO;
import com.metalface.application.mapping.AccountsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class DefaultAccountsManager implements AccountsManager {

    @Autowired
    private AccountsMapper accountsMapper;

    @Override
    public AccountDTO createAccount(AccountDTO account) {
        return null;
    }

    @Override
    public AccountDTO fetchAccount(UUID accountId) {
        return null;
    }

    @Override
    public Page<AccountDTO> fetchManyAccounts(Pageable page) {
        return null;
    }

    @Override
    public AccountDTO updateAccount(UUID accountId, AccountDTO account) {
        return null;
    }

    @Override
    public void deleteAccount(UUID accountId) {

    }


}
