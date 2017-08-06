package ru.itpark;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField textLogin;

    @FXML
    private TextField textPassword;

    @FXML
    private Button buttonLogin;

    @FXML
    private Button buttonRegistration;

    @FXML
    public void initialize() {
        RestTemplate template = new RestTemplate();

        buttonLogin.setOnAction(event -> {
            String login = textLogin.getText();
            String password = textPassword.getText();
            HttpHeaders headers = new HttpHeaders();
            headers.add("login", login);
            headers.add("password", password);

            HttpEntity<Object> httpEntity = new HttpEntity<>(headers);

            ResponseEntity response = template.postForEntity("http://localhost:8080/login", httpEntity, ResponseEntity.class);
            System.out.println(response.getHeaders().get("Auth-Token"));
        });

        buttonRegistration.setOnAction(event -> {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("registration.fxml"));
            try {
                Parent root = fxmlLoader.load();
                Stage currentStage = (Stage)buttonRegistration.getScene().getWindow();
                currentStage.setScene(new Scene(root));

            } catch (IOException e) {
                throw new IllegalArgumentException(e);
            }
        });
    }

}
