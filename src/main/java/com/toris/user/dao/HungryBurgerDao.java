package com.toris.user.dao;

import com.toris.user.model.entity.hungryburger.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HungryBurgerDao extends JpaRepository<User, Integer> {
}
