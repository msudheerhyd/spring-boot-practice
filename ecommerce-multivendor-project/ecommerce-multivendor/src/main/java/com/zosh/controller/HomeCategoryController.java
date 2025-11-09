package com.zosh.controller;

import com.zosh.model.Home;
import com.zosh.model.HomeCategory;
import com.zosh.service.HomeCategoryService;
import com.zosh.service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class HomeCategoryController {
    private final HomeCategoryService homecategoryService;
    private final HomeService homeService;

    @PostMapping("home/categories")
    public ResponseEntity<Home> createHomeCategories(
            @RequestBody List<HomeCategory> homeCategories
    ) {
        List<HomeCategory> categories = homecategoryService.createCategories(homeCategories);
        Home home = homeService.createHomePageData(categories);
        return new ResponseEntity<>(home, HttpStatus.ACCEPTED);

    }

    @GetMapping("/admin/home-category")
    public ResponseEntity<List<HomeCategory>> getHomeCategory(
            ) throws Exception{

        List<HomeCategory> categories = homecategoryService.getAllHomeCategories();
        return ResponseEntity.ok(categories);
    }

    @PatchMapping("/admin/home-category'{id}")
    public ResponseEntity<HomeCategory> updateHomeCategory(
            @PathVariable Long id,
            @RequestBody HomeCategory homeCategory) throws Exception {

        HomeCategory updatedCategory=homecategoryService.updateHomeCategory(homeCategory, id);
        return ResponseEntity.ok(updatedCategory);
    }

}
