package sample.controllers;

import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class ChartController {
    @FXML
    CategoryAxis xAxis;
    @FXML
    NumberAxis yAxis;

    @FXML
    BarChart<String,Number> barChart;


    public void initialize(){
        xAxis.setLabel("Жанры");
        yAxis.setLabel("Количество игр");

        XYChart.Series<String, Number> data = new XYChart.Series<>();
        barChart.setTitle("Количество игр в определенном жанре");
        barChart.getData().add(data);

    }
}
