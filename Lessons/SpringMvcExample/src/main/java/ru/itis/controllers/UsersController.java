package ru.itis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.dao.UsersDao;
import ru.itis.models.User;
import ru.itis.repository.UsersRepository;

import java.util.List;

// аннотация Controller означает, что мы можем
// в данном классе обрабатывать http-запросы
@Controller
public class UsersController {

//    @Autowired
//    @Qualifier("usersDaoJdbc")
//    private UsersDao usersDao;

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping(value = "/hello")
    public String getHomePage(@ModelAttribute("model")ModelMap model) {
        List<User> users = usersRepository.findAll();
        model.addAttribute("usersList", users);
        return "index";
    }

    @PostMapping(value = "/addUser")
    public String addUser(@ModelAttribute("model")ModelMap model,
                          @ModelAttribute("user") User user) {
        usersRepository.save(user);
        return "redirect:/hello";
    }
}
