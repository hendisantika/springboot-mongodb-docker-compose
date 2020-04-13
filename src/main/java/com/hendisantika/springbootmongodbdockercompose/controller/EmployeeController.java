package com.hendisantika.springbootmongodbdockercompose.controller;

import com.hendisantika.springbootmongodbdockercompose.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-mongodb-docker-compose
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 13/04/20
 * Time: 16.37
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository empRepository;
}
