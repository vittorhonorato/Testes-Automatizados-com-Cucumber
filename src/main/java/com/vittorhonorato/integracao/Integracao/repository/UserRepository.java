package com.vittorhonorato.integracao.Integracao.repository;

import com.vittorhonorato.integracao.Integracao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
