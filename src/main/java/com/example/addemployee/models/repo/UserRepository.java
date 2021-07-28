package com.example.addemployee.models.repo;


import com.example.addemployee.models.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Long> {
}
