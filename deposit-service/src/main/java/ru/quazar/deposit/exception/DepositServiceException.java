package ru.quazar.deposit.exception;

/**
 *
 * @version $Id: FileGetter.java,v 1.0 2021-01-15 21:30:43 Exp $
 * @author  <A HREF="mailto:boris.mogilchenko@yandex.ru">Boris Mogilchenko</A>
 *
 */

public class DepositServiceException extends RuntimeException {

    public DepositServiceException(String message) {
        super(message);
    }
}
