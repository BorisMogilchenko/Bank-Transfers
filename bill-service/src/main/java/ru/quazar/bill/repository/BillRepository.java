package ru.quazar.bill.repository;

import ru.quazar.bill.entity.Bill;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 *
 * @version $Id: FileGetter.java,v 1.0 2021-01-15 21:30:43 Exp $
 * @author  <A HREF="mailto:boris.mogilchenko@yandex.ru">Boris Mogilchenko</A>
 *
 */

public interface BillRepository extends CrudRepository<Bill, Long> {

    List<Bill> getBillsByAccountId(Long accountId);
}
