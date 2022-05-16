package main;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class MainWindowController {
    @FXML private Pane titlePane;
    @FXML private ImageView btnHide, btnClose;
    @FXML private Label lblResult;

    private double x, y;
    private double num1 = 0;
    private String Operator ="+";
    public void init(Stage stage){
        titlePane.setOnMousePressed(mouseEvent -> {
            x = mouseEvent.getSceneX();
            y = mouseEvent.getSceneY();
        });
        titlePane.setOnMouseDragged(mouseEvent -> {
            stage.setX(mouseEvent.getScreenX()-x);
            stage.setY(mouseEvent.getScreenY()-y);
        });


        btnClose.setOnMouseClicked(mouseEvent -> stage.close());
        btnHide.setOnMouseClicked(mouseEvent -> stage.setIconified(true));
    }

    @FXML
    void onNumberClicked(MouseEvent event) {
        int value = Integer.parseInt(((Pane)event.getSource()).getId().replace("btn",""));
        lblResult.setText(Double.parseDouble(lblResult.getText())==0?String.valueOf((double)value):String.valueOf(Double.parseDouble(lblResult.getText())*10+value));
    }

    @FXML
    void onSymbolClicked(MouseEvent event) {
        String symbol = ((Pane)event.getSource()).getId().replace("btn","");
        if (symbol.equals("Equal")){
            double num2 = Double.parseDouble(lblResult.getText());
            switch (Operator){
                case "+" -> lblResult.setText((num1 + num2) + "");
                case "-" -> lblResult.setText((num1 - num2) + "");
                case "*" -> lblResult.setText((num1 * num2) + "");
                case "/" -> lblResult.setText((num1 / num2) + "");
            }
            Operator = ".";
        }
        else if (symbol.equals("Clr")){
            lblResult.setText(String.valueOf(0.0));
            Operator = ".";
        }
        else {
            switch (symbol){
                case "Add" -> Operator="+";
                case "Sub" -> Operator="-";
                case "Mul" -> Operator="*";
                case "Div" -> Operator="/";
            }
            num1 = Double.parseDouble(lblResult.getText());
            lblResult.setText(String.valueOf(0.0));
        }
    }
}
