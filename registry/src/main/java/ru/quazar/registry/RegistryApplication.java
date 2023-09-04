package ru.quazar.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 * @version $Id: FileGetter.java,v 1.0 2021-01-15 21:30:43 Exp $
 * @author  <A HREF="mailto:boris.mogilchenko@yandex.ru">Boris Mogilchenko</A>
 *
 */

@SpringBootApplication
@EnableEurekaServer
public class RegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistryApplication.class, args);
    }
}
