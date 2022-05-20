package main;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class MainWindowController {//This is where the functionality is built
    @FXML private Pane titlePane;
    @FXML private ImageView btnHide, btnClose;
    @FXML private Label lblResult;
    //@FXML is used to call the components in FXML file
    private double x, y;
    private double num1 = 0;
    private String Operator ="+";//Default operator since it cannot be none, and it cannot also be a non operator
    public void init(Stage stage){//To initialize the form
        titlePane.setOnMousePressed(mouseEvent -> {//Clickable form
            x = mouseEvent.getSceneX();
            y = mouseEvent.getSceneY();
        });
        titlePane.setOnMouseDragged(mouseEvent -> {//Draggable form
            stage.setX(mouseEvent.getScreenX()-x);
            stage.setY(mouseEvent.getScreenY()-y);
        });


        btnClose.setOnMouseClicked(mouseEvent -> stage.close());
        btnHide.setOnMouseClicked(mouseEvent -> stage.setIconified(true));
    }

    @FXML
    void onNumberClicked(MouseEvent event) {
        int value = Integer.parseInt(((Pane)event.getSource()).getId().replace("btn",""));//This is to get the value of the calculator which is set by its ID.
        lblResult.setText(Double.parseDouble(lblResult.getText())==0?String.valueOf((double)value):String.valueOf(Double.parseDouble(lblResult.getText())*10+value));
        //^ This code is to set the lblResult as the value clicked and is multiplied by *10 since it is set to 0.0 so it will be set on the first whole number
    }

    @FXML
    void onSymbolClicked(MouseEvent event) {
        String symbol = ((Pane)event.getSource()).getId().replace("btn","");//Same logic as the NumberClicked
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
        else if (symbol.equals("Clr")){//Clear button
            lblResult.setText(String.valueOf(0.0));
            Operator = ".";
        }
        else {
            switch (symbol){//Precautionary if ever the first ID is misread so that it will still go to the if statement
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
