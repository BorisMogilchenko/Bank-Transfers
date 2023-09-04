package ru.quazar.deposit.rest;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

/**
 *
 * @version $Id: FileGetter.java,v 1.0 2021-01-15 21:30:43 Exp $
 * @author  <A HREF="mailto:boris.mogilchenko@yandex.ru">Boris Mogilchenko</A>
 *
 */

@Getter
@Setter
public class BillRequestDTO {

    private Long accountId;

    private BigDecimal amount;

    private Boolean isDefault;

    private OffsetDateTime creationDate;

    private Boolean overdraftEnabled;
}
