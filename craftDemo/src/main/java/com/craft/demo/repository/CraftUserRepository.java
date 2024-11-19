package com.craft.demo.repository;

import com.craft.demo.entity.CraftUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CraftUserRepository extends JpaRepository<CraftUser, Integer> {
}
