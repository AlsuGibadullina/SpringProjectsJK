package com.example.demo.service;
import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService { // В сервисах реализуется бизнес логика


    private UserRepository userRepository;

    @Autowired //Внедряет зависимости (Создает бин и кладет его туда)
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Iterable<User> getAll() {
        return userRepository.findAll();
    }

    public User save(User user){
        return userRepository.save(user);
    }
}
