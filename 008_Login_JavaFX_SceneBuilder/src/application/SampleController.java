package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SampleController {
	
	@FXML
    private Button btnLogin;

    @FXML
    private TextField txtUsuario;

    @FXML
    private TextField txtPassword;
    
    @FXML
    void login(ActionEvent event) {
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setTitle("Información");
    	alert.setHeaderText(null);
    	
    	String password = "123456";
    	
    	//Comprobamos si coinciden los datos del login
    	if(txtPassword.getText().equals(password)) {
    		//Si coincide, nos muestra el siguiente mensaje
    		alert.setContentText("Ha iniciado sesión correctamente");
    	}else {
    		//Si no hemos escrito bien nuestra credenciales peta
    		alert.setContentText("Contraseña incorrecta");
    		System.out.println(password + " " + txtPassword.getText() + " ");
    	}
    	
    	alert.showAndWait();
    	
    	
    }
	
}
