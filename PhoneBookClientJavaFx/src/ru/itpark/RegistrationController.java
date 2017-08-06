package ru.itpark;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

public class RegistrationController {
    @FXML
    private TextField textName;

    @FXML
    private TextField textLogin;

    @FXML
    private TextField textPassword;

    @FXML
    private Button buttonRegistration;

    @FXML
    private void initialize() {
        List<HttpMessageConverter<?>> converters = Collections.singletonList(
                new MappingJackson2HttpMessageConverter());
        RestTemplate template = new RestTemplate(converters);
        buttonRegistration.setOnAction(event ->{
            UserRegistrationDto request =
                    new UserRegistrationDto(
                            textName.getText(),
                    textLogin.getText(),
                    textPassword.getText());
            template.postForEntity("http://localhost:8080/users",
                    request, Object.class);
        });
    }
}
