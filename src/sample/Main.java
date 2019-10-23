package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;
import java.util.StringJoiner;

public class Main extends Application {
    private final int STARTING_WIDTH = 600;
    private final int STARTING_HEIGHT = 400;
    private final int MIN_WIDTH = 400;
    private final int MIN_HEIGHT = 400;

    @FXML
    Tab tabInput;

    @FXML
    Tab tabTable;

    @FXML
    Tab tabChart;

    @FXML
    Tab tabGuide;


    @Override
    public void start(Stage primaryStage) throws Exception{
       // tabInput.setContent(FXMLLoader.load(getClass().getResource("views/input.fxml")));
        //tabTable.setContent(FXMLLoader.load(getClass().getResource("views/table.fxml")));
        //tabChart.setContent(FXMLLoader.load(getClass().getResource("views/chart.fxml")));

        Parent root = FXMLLoader.load(getClass().getResource("views/main.fxml"));

        primaryStage.setTitle("Справочник игр");
        primaryStage.setScene(new Scene(root, STARTING_WIDTH, STARTING_HEIGHT));
        primaryStage.setMinWidth(MIN_WIDTH);
        primaryStage.setMinHeight(MIN_HEIGHT);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
