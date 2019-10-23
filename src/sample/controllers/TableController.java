package sample.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.Game;

public class TableController {
    private ObservableList<Game> GamesData = FXCollections.observableArrayList();

    @FXML
    private TableView<Game> tableGames;

    @FXML
    private TableColumn<Game, Integer> nameColumn;

    @FXML
    private TableColumn<Game, String> genreColumn;

    @FXML
    private TableColumn<Game, String> devColumn;

    @FXML
    private TableColumn<Game, String> yearColumn;

    @FXML
    private TableColumn<Game, String> platformColumn;

    // инициализируем форму данными
    @FXML
    private void initialize() {
        initData();

        // устанавливаем тип и значение которое должно хранится в колонке
        nameColumn.setCellValueFactory(new PropertyValueFactory<Game, Integer>("name"));
        genreColumn.setCellValueFactory(new PropertyValueFactory<Game, String>("genre"));
        devColumn.setCellValueFactory(new PropertyValueFactory<Game, String>("dev"));
        yearColumn.setCellValueFactory(new PropertyValueFactory<Game, String>("year"));
        platformColumn.setCellValueFactory(new PropertyValueFactory<Game, String>("platform"));

        // заполняем таблицу данными
        tableGames.setItems(GamesData);
    }

    // подготавливаем данные для таблицы
    // вы можете получать их с базы данных
    private void initData() {
        GamesData.add(new Game("Doom 1", "FPS", "Id Software", "1992", "PC"));
    }

}
