package com.nuzhd.repo;

import com.nuzhd.model.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<MyUser, Long> {

    MyUser findByEmail(String email);

}
