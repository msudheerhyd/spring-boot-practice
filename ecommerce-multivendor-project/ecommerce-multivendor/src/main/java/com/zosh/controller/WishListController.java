package com.zosh.controller;

import com.zosh.exceptions.ProductException;
import com.zosh.model.Product;
import com.zosh.model.User;
import com.zosh.model.WishList;
import com.zosh.service.ProductService;
import com.zosh.service.UserService;
import com.zosh.service.WishListService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/wishList")
public class WishListController {

    private final WishListService wishListService;
    private final UserService userService;
    private final ProductService productService;

    public ResponseEntity<WishList> getWishListByUserId(
            @RequestHeader("Authorization") String jwt) throws Exception {

        User user = userService.findUserByJwtToken(jwt);
        WishList wishList = wishListService.getWishListByUserId(user);
        return ResponseEntity.ok(wishList);
    }

    @PostMapping("/add-product/{productId}")
    public ResponseEntity<WishList> addProductToWishList(
            @PathVariable Long productId,
            @RequestHeader("Authorizqtion") String jwt) throws Exception {
        Product product = productService.findProductById(productId);
        User user = userService.findUserByJwtToken(jwt);
        WishList updatedWishList = wishListService.addProducttoWishList(
                user,
                product
        );
        return ResponseEntity.ok(updatedWishList);

    }

}
