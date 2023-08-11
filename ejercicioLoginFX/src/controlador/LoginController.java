/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Cristian
 */
public class LoginController implements Initializable {

    @FXML
    private PasswordField txtPasword;
    @FXML
    private Button btnRegistrar;
    @FXML
    private TextField txtUsuario;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void registrar(ActionEvent event) {
        
        String usuario = txtUsuario.getText();
        String pass = txtPasword.getText();
        
        if (usuario.equals("alumno@ulp.edu.ar") && pass.equals("12345678")) {
            
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setTitle("Login");
            alert.setContentText("Bienvenido");
            alert.showAndWait();

        }else {
            
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Usuario y/o contraseña imcorrecto");
            alert.showAndWait();

        }
    }
    
}
