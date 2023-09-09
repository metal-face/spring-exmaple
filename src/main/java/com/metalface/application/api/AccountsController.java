
package com.metalface.application.api;

import com.metalface.application.dto.AccountDTO;
import com.metalface.application.managers.AccountsManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("accounts")
public class AccountsController {
    @Autowired
    private AccountsManager accountsManager;

    @PostMapping(value = "/", produces = "application/json")
    public AccountDTO createAccount(@RequestBody AccountDTO account) {
        return accountsManager.createAccount(account);
    }

    @GetMapping(value = "/${id}", produces = "application/json")
    public AccountDTO fetchAccount(@PathVariable UUID id) {
        return accountsManager.fetchAccount(id);
    }

    @GetMapping(value = "/", produces = "application/json")
    public Page<AccountDTO> fetchManyAccounts(@RequestParam(name = "page", defaultValue = "0", required = false) Integer page, @RequestParam(name = "size", defaultValue = "10", required = false) Integer size)
    {
        return this.accountsManager.fetchManyAccounts(PageRequest.of(page, size));
    }

    @PatchMapping(value = "/{id}", produces = "application/json")
    public AccountDTO updateAccount(@PathVariable  UUID id, @RequestBody AccountDTO account)
    {
        return this.accountsManager.updateAccount(id, account);
    }

    @DeleteMapping(value = "/{id}", produces = "application/json")
    public void deleteAccount(@PathVariable UUID id)
    {
        this.accountsManager.deleteAccount(id);
    }
}
