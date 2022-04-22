package com.druwa.menu.services;

import com.druwa.menu.entity.CafeMenu;
import com.druwa.menu.model.CafeMenuResponse;
import com.druwa.menu.repositories.CafeMenuRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CafeMenuService {

    CafeMenuRepository cafeMenuRepository;

    public CafeMenuService(CafeMenuRepository cafeMenuRepository) {
        this.cafeMenuRepository = cafeMenuRepository;
    }

    public List<CafeMenuResponse> getCafeMenuList() {
        List<CafeMenu> originMenuList = cafeMenuRepository.findAllBySaleYn("Y");
        List<CafeMenuResponse> cafeMenuList = new ArrayList<>();
        for (CafeMenu cafeMenu : originMenuList) {
            CafeMenuResponse cafeMenuResponse = new CafeMenuResponse();
            cafeMenuResponse.setMenuName(cafeMenu.getMenuName());
            cafeMenuResponse.setMenuCost(cafeMenu.getMenuCost());
            cafeMenuList.add(cafeMenuResponse);
        }
        return cafeMenuList;
    }

}
