package com.metalface.application.mapping;

import com.metalface.application.dto.AccountDTO;
import com.metalface.application.models.Account;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountsMapper {
    AccountDTO AccountToAccountDTO(Account account);

    Account AccountDTOToAccount(AccountDTO accountDTO);

}
