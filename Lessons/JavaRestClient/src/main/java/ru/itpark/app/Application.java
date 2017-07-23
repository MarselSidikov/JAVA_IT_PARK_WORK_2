package ru.itpark.app;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import ru.itpark.dto.AutoDto;
import ru.itpark.dto.UserDto;
import ru.itpark.menu.MainMenu;
import ru.itpark.rest.RequestUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MainMenu menu = new MainMenu();
        RequestUtils requestUtils = new RequestUtils("http://localhost:8080");
        while (true) {
            menu.show();
            int command = scanner.nextByte();
            switch (command) {
                case 1: {
                    List<UserDto> users = requestUtils.getForList("/users", UserDto[].class);
                    for (UserDto user : users) {
                        System.out.println(user.getId()
                                + " " + user.getName()
                                + " " + user.getAge());
                    }
                    break;
                }
                case 2: {
                    List<AutoDto> autos = requestUtils.getForList("/autos", AutoDto[].class);
                    for (AutoDto auto : autos) {
                        System.out.println(auto.getId()
                                + " " + auto.getColor()
                                + " " + auto.getModel());
                    }
                    break;
                }
                case 3: {
                    System.out.println("Введите идентификатор пользователя:");
                    int userId = scanner.nextInt();
                    List<AutoDto> autoOfUser = requestUtils.getForList("/users/" + userId + "/autos", AutoDto[].class);
                    for (AutoDto auto : autoOfUser) {
                        System.out.println(auto.getId()
                                + " " + auto.getColor()
                                + " " + auto.getModel());
                    }
                    break;
                }
                case 4:
                    System.out.println("Введите данные пользователья: имя, возраст и рост");
                    UserDto newUser = new UserDto();
                    newUser.setName(scanner.next());
                    newUser.setAge(scanner.nextInt());
                    newUser.setHeight(scanner.nextInt());
                    requestUtils.postObject(newUser, "/users");
                    break;
                case 6: return;
            }
        }
    }
}
