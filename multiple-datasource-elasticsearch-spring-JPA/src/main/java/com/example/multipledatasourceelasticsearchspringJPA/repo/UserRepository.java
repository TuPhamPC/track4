package com.example.multipledatasourceelasticsearchspringJPA.repo;

import com.example.multipledatasourceelasticsearchspringJPA.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

