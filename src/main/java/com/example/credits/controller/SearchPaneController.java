package com.example.credits.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SearchPaneController {

    @FXML
    private TextField ammountTextField;

    @FXML
    private TextField bankTextField;

    @FXML
    private TextField clientNameTextField;

    @FXML
    private TextField marginTextField;


    public Button getSearchButton() {
        return searchButton;
    }

    @FXML
    private Button searchButton;

    public TextField getAmmountTextField() {
        return ammountTextField;
    }

    public TextField getBankTextField() {
        return bankTextField;
    }

    public TextField getClientNameTextField() {
        return clientNameTextField;
    }

    public TextField getMarginTextField() {
        return marginTextField;
    }

    public void initialize(){
        System.out.println("SearchControllerStarted");
    }

}
