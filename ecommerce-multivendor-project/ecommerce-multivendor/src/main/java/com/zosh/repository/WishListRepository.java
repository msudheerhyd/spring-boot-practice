package com.zosh.repository;

import com.zosh.model.WishList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishListRepository extends JpaRepository<WishList, Long> {

    WishList findByUserId(Long userId);

}
