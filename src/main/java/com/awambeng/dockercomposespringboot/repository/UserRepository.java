package com.awambeng.dockercomposespringboot.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.awambeng.dockercomposespringboot.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
