package com.softuni.examprep.services;

import com.softuni.examprep.domain.helpers.LoggedUser;
import com.softuni.examprep.domain.model.ShipModel;
import com.softuni.examprep.domain.model.UserModel;
import com.softuni.examprep.domain.model.UserWithShipsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BattleService {
    private final UserService userService;
    private final ShipService shipService;

    @Autowired
    public BattleService(UserService userService, ShipService shipService) {
        this.userService = userService;
        this.shipService = shipService;
    }

    public UserWithShipsModel getUserWithShips(Long id) {
        UserModel userModel = this.userService.findById(id);
        List<ShipModel> allByUserId = this.shipService.findAllByUserId(id);

        return UserWithShipsModel.builder()
                .userModel(userModel)
                .shipModels(allByUserId)
                .build();
    }
}
