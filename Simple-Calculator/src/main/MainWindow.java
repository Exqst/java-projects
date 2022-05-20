package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainWindow extends Application {
    @Override
    public void start(Stage stage) throws Exception {//Starts the program or the form
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainWindowUI.fxml"));//Loads the FXML file
        Scene scene = new Scene(loader.load());//Loads the Scene
        scene.setFill(Color.TRANSPARENT);
        stage.setScene(scene);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setResizable(false);
        stage.setTitle("Calculator");
        stage.getIcons().add(new Image(getClass().getResourceAsStream("/icon.png")));
        ((MainWindowController)loader.getController()).init(stage);
        stage.show();
    }

    public void run(){ launch();}
}
