package ru.quazar.deposit.repository;

import ru.quazar.deposit.entity.Deposit;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 *
 * @version $Id: FileGetter.java,v 1.0 2021-01-15 21:30:43 Exp $
 * @author  <A HREF="mailto:boris.mogilchenko@yandex.ru">Boris Mogilchenko</A>
 *
 */

public interface DepositRepository extends CrudRepository<Deposit, Long> {

    List<Deposit> findDepositsByEmail(String email);
}
