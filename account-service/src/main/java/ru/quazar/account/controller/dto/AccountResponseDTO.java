package ru.quazar.account.controller.dto;

import ru.quazar.account.entity.Account;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.OffsetDateTime;
import java.util.List;

/**
 *
 * @version $Id: FileGetter.java,v 1.0 2021-01-15 21:30:43 Exp $
 * @author  <A HREF="mailto:boris.mogilchenko@yandex.ru">Boris Mogilchenko</A>
 *
 */

@Getter
@AllArgsConstructor
public class AccountResponseDTO {

    private Long accountId;

    private String name;

    private String email;

    private List<Long> bills;

    private String phone;

    private OffsetDateTime creationDate;

    public AccountResponseDTO(Account account) {
        accountId = account.getAccountId();
        name = account.getName();
        email = account.getEmail();
        phone = account.getPhone();
        bills = account.getBills();
        creationDate = account.getCreationDate();
    }
}
