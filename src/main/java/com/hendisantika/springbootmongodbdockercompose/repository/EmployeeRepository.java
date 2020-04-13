package com.hendisantika.springbootmongodbdockercompose.repository;

import com.hendisantika.springbootmongodbdockercompose.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-mongodb-docker-compose
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 13/04/20
 * Time: 16.36
 */
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {
}
