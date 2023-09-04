package ru.quazar.notification.service;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 *
 * @version $Id: FileGetter.java,v 1.0 2021-01-15 21:30:43 Exp $
 * @author  <A HREF="mailto:boris.mogilchenko@yandex.ru">Boris Mogilchenko</A>
 *
 */

@Getter
@Setter
public class DepositResponseDTO {

    private BigDecimal amount;

    private String mail;
}
