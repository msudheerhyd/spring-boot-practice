package com.zosh.service;

import com.zosh.model.Product;
import com.zosh.model.User;
import com.zosh.model.WishList;

public interface WishListService {
    WishList createWishList(User user);
    WishList getWishListByUserId(User user);

    WishList addProducttoWishList(User user, Product product);
//    WishList addProducttoWishList(User user, Product product);

}
