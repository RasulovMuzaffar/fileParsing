/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author Muzaffar
 */
public class FXMLDocumentController implements Initializable {

    String filePath;

    @FXML
    private TextField fileOpenPath;

    @FXML
    private TextField fromByte;

    @FXML
    private TextField toByte;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println(fromByte.getText() + toByte.getText());

        try (FileInputStream fin = new FileInputStream(filePath);
                FileOutputStream fos = new FileOutputStream("C://Users//Музаффар//Desktop//newFile.txt")) {
            System.out.println("Размер файла: " + fin.available() + " байт(а)");

//            int i = -1;
//            while ((i = fin.read()) != -1) {
//
//                System.out.print((char) i);
//            }
            byte[] buffer = new byte[fin.available()];

            fin.read(buffer, 2, 3);
            fos.write(buffer, 2, 3);

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    @FXML
    private void handleButtonActionOpen(ActionEvent event
    ) {
        Stage stage = new Stage();

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open File.");
//        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
//        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("All Images", "*.*"),
//                new FileChooser.ExtensionFilter("TXT", "*.txt"),
//                new FileChooser.ExtensionFilter("BIN", "*.bin"),
//                new FileChooser.ExtensionFilter("PDF", "*.pdf"),
//                new FileChooser.ExtensionFilter("DOC", "*.doc"));
        File file = fileChooser.showOpenDialog(stage);
        System.out.println(file);
        fileOpenPath.setText("" + file);
        filePath = "" + file;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb
    ) {
        // TODO
    }

}
