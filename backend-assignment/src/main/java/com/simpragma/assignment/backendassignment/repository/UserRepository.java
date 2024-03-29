package com.simpragma.assignment.backendassignment.repository;

import com.simpragma.assignment.backendassignment.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

  User findByUsernameAndPassword(String username, String password);

}
