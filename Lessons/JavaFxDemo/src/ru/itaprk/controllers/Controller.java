package ru.itaprk.controllers;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Controller {

    @FXML
    WebView htmlPage;

    @FXML
    TextArea rawHtmlTextArea;

    @FXML
    public void initialize() {
        WebEngine webEngine = htmlPage.getEngine();
        rawHtmlTextArea.setOnKeyTyped(event -> {
            String content = rawHtmlTextArea.getText();
            webEngine.loadContent(content);
            rawHtmlTextArea.getCaretPosition();
        });
    }
}
