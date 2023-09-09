package com.metalface.application.managers;

import com.metalface.application.dto.AccountDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public interface AccountsManager {
    public AccountDTO createAccount(AccountDTO account);

    public AccountDTO fetchAccount(UUID accountId);

    public Page<AccountDTO> fetchManyAccounts(Pageable page);

    public AccountDTO updateAccount(UUID accountId, AccountDTO account);

    public void deleteAccount(UUID accountId);

}
