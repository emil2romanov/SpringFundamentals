package com.softuni.battleships.session;

import com.softuni.battleships.models.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
@SessionScope
public class LoggedUser {

    private long id;
    private String fullName;

    public void login(User user) {
        this.id = user.getId();
        this.fullName = user.getFullName();
    }

    public void logout() {
        this.id = 0;
        this.fullName = null;
    }
}
