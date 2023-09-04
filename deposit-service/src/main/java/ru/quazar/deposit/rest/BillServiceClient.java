package ru.quazar.deposit.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 *
 * @version $Id: FileGetter.java,v 1.0 2021-01-15 21:30:43 Exp $
 * @author  <A HREF="mailto:boris.mogilchenko@yandex.ru">Boris Mogilchenko</A>
 *
 */

@FeignClient(name = "bill-service")
public interface BillServiceClient {

    @RequestMapping(value = "bills/{billId}", method = RequestMethod.GET)
    BillResponseDTO getBillById(@PathVariable("billId") Long billId);

    @RequestMapping(value = "bills/{billId}", method = RequestMethod.PUT)
    void update(@PathVariable("billId") Long billId, BillRequestDTO billRequestDTO);

    @RequestMapping(value = "bills/account/{accountId}", method = RequestMethod.GET)
    List<BillResponseDTO> getBillsByAccountId(@PathVariable("accountId") Long accountId);
}
