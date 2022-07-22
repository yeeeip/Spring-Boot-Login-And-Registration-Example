package com.nuzhd.service.impl;

import com.nuzhd.model.MyUser;
import com.nuzhd.model.Role;
import com.nuzhd.repo.UserRepository;
import com.nuzhd.service.UserService;
import com.nuzhd.web.dto.MyUserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public MyUser findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<MyUser> findAll() {
        return userRepository.findAll();
    }

    @Override
    public MyUser save(MyUserRegistrationDto registrationDto) {
        MyUser user = new MyUser(registrationDto.getFirstName(),
                registrationDto.getLastName(), registrationDto.getEmail(),
                passwordEncoder.encode(registrationDto.getPassword()), List.of(new Role("ROLE_USER")));

        return userRepository.save(user);
    }

    @Override
    public void delete(MyUser user) {
        userRepository.delete(user);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        MyUser user = userRepository.findByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException("Invalid username or password");
        }

        return new User(user.getEmail(), user.getPassword(), mapRolesToAuthorities(user.getRoles()));

    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {

        return roles.stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toList());

    }
}
