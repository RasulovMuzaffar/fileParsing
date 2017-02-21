/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author Muzaffar
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    
    @FXML
    private TextField fileOpenPath;
    
    @FXML
    private TextField fromByte;
    
    @FXML
    private TextField toByte;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }

    @FXML
    private void handleButtonActionOpen(ActionEvent event) {
        Stage stage = new Stage();

//        FileChooser fileChooser = new FileChooser();
//        fileChooser.setTitle("Open Resource File.");
//        fileChooser.showOpenDialog(stage);

        FileChooser fileChooser = new FileChooser();
//        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
//        fileChooser.getExtensionFilters().add(extFilter);
        File file = fileChooser.showOpenDialog(stage);
        System.out.println(file);
        fileOpenPath.setText(""+file);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
