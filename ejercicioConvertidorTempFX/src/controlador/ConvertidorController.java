/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Cristian
 */
public class ConvertidorController implements Initializable {

    @FXML
    private TextField txtCelsius;
    @FXML
    private TextField txtFarenheit;
    @FXML
    private Button btnConvertir;
    @FXML
    private Button btnSalir;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void convertir(ActionEvent event) {

        try {

            int celsius = Integer.parseInt(txtCelsius.getText());

            txtFarenheit.setText(celsius * 9 / 5 + 32 + " grados");

        } catch (NumberFormatException e) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Ingrese numeros");
            alert.showAndWait();

        }

    }

    @FXML
    private void salir(ActionEvent event) {
        
        Platform.exit();
    }

}
