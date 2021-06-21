package ro.ctrln.javafx.controls;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import ro.ctrln.javafx.shapes.ShapesUtils;

public class JavaFXRadioButtons extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        RadioButton radioButtonOne = new RadioButton("Lab1");
        RadioButton radioButtonTwo = new RadioButton("Lab2");
        RadioButton radioButtonThree = new RadioButton("Lab3");

        Text text = new Text("Nicio optiune");

        ToggleGroup radioButtonToggle = new ToggleGroup();
        radioButtonOne.setToggleGroup(radioButtonToggle);
        radioButtonTwo.setToggleGroup(radioButtonToggle);
        radioButtonThree.setToggleGroup(radioButtonToggle);

        radioButtonOne.setOnAction(e-> text.setText(radioButtonOne.getText()));
        radioButtonTwo.setOnAction(e-> text.setText(radioButtonTwo.getText()));
        radioButtonThree.setOnAction(e-> text.setText(radioButtonThree.getText()));

        VBox vBox = new VBox(radioButtonOne, radioButtonTwo, radioButtonThree, text);
        vBox.setAlignment(Pos.TOP_CENTER);
        vBox.setSpacing(20);
        Scene scene = new Scene(vBox,500,200);

        ShapesUtils.showPrimaryStage(primaryStage,scene,"JavaFX Radio Buttons");

    }
}
