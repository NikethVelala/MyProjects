package com.niketh.user.repository;

import com.niketh.user.entity.User1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User1,Long> {
    User1 findByUserId(Long userId);
}
