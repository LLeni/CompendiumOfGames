package sample.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringJoiner;

public class InputController {
    @FXML
    TextField name;
    @FXML
    TextField genre;
    @FXML
    TextField dev;
    @FXML
    TextField year;
    @FXML
    TextField platform;

    @FXML
    Button btnAddGame;


    public void addGame(){
        if(false){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ошибка");
            alert.setHeaderText("Вы не ввели данные во всех полях");
            alert.setContentText("Для продолжения нажмите кнопку 'ОК'");
            alert.show();
        } else{
            try(BufferedWriter bw = new BufferedWriter(new FileWriter("games.txt", true))){
                StringJoiner joiner = new StringJoiner("|");
                String game = joiner.add(name.getText()).add(genre.getText()).add(year.getText()).add(platform.getText()).toString();
                bw.write(game);
                bw.newLine();
                bw.flush();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

    public void initialize(){
    }
}
