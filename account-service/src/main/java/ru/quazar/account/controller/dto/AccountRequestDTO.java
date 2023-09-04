package ru.quazar.account.controller.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;

/**
 *
 * @version $Id: FileGetter.java,v 1.0 2021-01-15 21:30:43 Exp $
 * @author  <A HREF="mailto:boris.mogilchenko@yandex.ru">Boris Mogilchenko</A>
 *
 */

@Getter
@NoArgsConstructor
public class AccountRequestDTO {

    private String name;

    private String email;

    private String phone;

    private List<Long> bills;

    private OffsetDateTime creationDate;
}
