package com.vittorhonorato.integracao.Integracao.repository;

import com.vittorhonorato.integracao.Integracao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
