package com.konruksiam.CrudApi.repository;

import com.konruksiam.CrudApi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {



}
