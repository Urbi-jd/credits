package com.example.credits.controller;

import javafx.fxml.FXML;

public class MainController {

    @FXML
    private SearchPaneController searchPaneController;


    public void initialize(){
        searchPaneController.getSearchButton().setOnAction(actionEvent -> {
            System.out.println("Kwota " + searchPaneController.getAmmountTextField().getText());
            System.out.println("Bank " + searchPaneController.getBankTextField().getText());
        });
    }
}
