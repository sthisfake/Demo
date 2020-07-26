package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerLogin {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXTextField loginUsername;

    @FXML
    private JFXPasswordField loginPassword;

    @FXML
    private JFXButton loginButton;

    @FXML
    void initialize() {

        loginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("clicked login");
            }
        });


    }


}
