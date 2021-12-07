package com.example.demo.repository;

import com.example.demo.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> { // в репозитории пишем интерфейс, который наследуется от другого интерфейса
    Iterable<User> getUserByFirstNameEquals(String firstName);                   // Который предоставляет data jpa, в репозитории объявляем метод с обязательным возвращаемым типом
}
}
