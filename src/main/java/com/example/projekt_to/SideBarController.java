package com.example.projekt_to;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SideBarController implements Initializable {

    @FXML
    private BorderPane mainBP;
    @FXML
    private AnchorPane content;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void goToHome(MouseEvent mouseEvent) {
        mainBP.setCenter(content);
    }

    public void goToDatabase(MouseEvent mouseEvent) {
        loadPage("database-page");
    }

    public void goToTable(MouseEvent mouseEvent) {
        loadPage("table-page");
    }

    public void goToOperation(MouseEvent mouseEvent) {
        loadPage("operation-page");
    }

    public void goToProcedure(MouseEvent mouseEvent) {
        loadPage("procedure-page");
    }

    private void loadPage(String page){
    Parent root = null;

        try {
            root = FXMLLoader.load(getClass().getResource(page + ".fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        mainBP.setCenter(root);
    }
}