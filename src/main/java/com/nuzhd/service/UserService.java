package com.nuzhd.service;

import com.nuzhd.model.MyUser;
import com.nuzhd.web.dto.MyUserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    MyUser findById(Long id);

    List<MyUser> findAll();

    MyUser save(MyUserRegistrationDto registrationDto);

    void delete(MyUser user);

    void deleteById(Long id);

}
