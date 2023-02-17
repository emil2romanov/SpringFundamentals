package com.softuni.examprep.domain.model.binding;

import com.softuni.examprep.validations.checkUserExistence.ValidateLoginForm;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@ValidateLoginForm
public class UserLoginModel {
    private String username;
    private String password;
}
