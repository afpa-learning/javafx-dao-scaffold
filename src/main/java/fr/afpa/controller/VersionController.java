package fr.afpa.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class VersionController {

    @FXML
    private Label jdkVersion;
    @FXML
    private Label javafxVersion;

    @FXML
    private void initialize() {
        jdkVersion.setText(System.getProperty("java.version"));
        javafxVersion.setText(System.getProperty("javafx.runtime.version"));
    }
}
