package ru.quazar.account.repository;

import ru.quazar.account.entity.Account;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @version $Id: FileGetter.java,v 1.0 2021-01-15 21:30:43 Exp $
 * @author  <A HREF="mailto:boris.mogilchenko@yandex.ru">Boris Mogilchenko</A>
 *
 */

public interface AccountRepository extends CrudRepository<Account, Long> {
}
