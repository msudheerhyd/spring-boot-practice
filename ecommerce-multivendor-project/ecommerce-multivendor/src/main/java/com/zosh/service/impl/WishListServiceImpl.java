package com.zosh.service.impl;

import com.zosh.model.Product;
import com.zosh.model.User;
import com.zosh.model.WishList;
import com.zosh.repository.WishListRepository;
import com.zosh.service.WishListService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WishListServiceImpl implements WishListService {

    private final WishListRepository wishListRepository;

    @Override
    public WishList createWishList(User user) {
        WishList wishList = new WishList();
        wishList.setUser(user);
        return wishListRepository.save(wishList);
    }

    @Override
    public WishList getWishListByUserId(User user) {
        WishList wishList = wishListRepository.findByUserId(user.getId());
        if(wishList==null) {
            wishList=createWishList(user);
        }
        return wishList;
    }

    @Override
    public WishList addProducttoWishList(User user, Product product) {
        WishList wishList=getWishListByUserId(user);

        if(wishList.getProducts().contains(product)) {
            wishList.getProducts().remove(product);
        }
//        else wishList.getProducts().add(product);

        return wishListRepository.save(wishList);
    }
}
