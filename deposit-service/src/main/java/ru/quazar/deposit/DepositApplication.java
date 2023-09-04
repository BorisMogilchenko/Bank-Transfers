package ru.quazar.deposit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *
 * @version $Id: FileGetter.java,v 1.0 2021-01-15 21:30:43 Exp $
 * @author  <A HREF="mailto:boris.mogilchenko@yandex.ru">Boris Mogilchenko</A>
 *
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class DepositApplication {

    public static void main(String[] args) {
        SpringApplication.run(DepositApplication.class, args);
    }
}
