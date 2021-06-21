package ro.ctrln.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Arrays;

public class JavaFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button buttonOne = new Button("Hello Bittnet!!!");
        buttonOne.setOnAction(e -> System.out.println("Hello from Bittnet about JavaFX!"));

        Button buttonTwo = new Button("Hello Bittnet again!!!");
        buttonTwo.setOnAction(e -> primaryStage.hide());

        //StackPane root = new StackPane();
        //HBox root = new HBox();
        VBox root = new VBox();
        root.setSpacing(30);
        root.setAlignment(Pos.TOP_CENTER);
        root.getChildren().addAll(Arrays.asList(buttonOne, buttonTwo));
        root.setStyle("-fx-border-width: 7; -fx-border-color:orange");

        Scene scene = new Scene(root, 500, 500);
        primaryStage.setTitle("Learning about JavaFx");
        primaryStage.setScene(scene);
        primaryStage.setFullScreen(false);
        primaryStage.initStyle(StageStyle.DECORATED);

        primaryStage.setOnCloseRequest(event -> System.out.println("Inchidere fereastra"));
        primaryStage.setOnHiding(event -> System.out.println("Ascundere fereastra"));
        primaryStage.setOnHidden(event -> System.out.println("Fereastra ascunsa"));
        primaryStage.setOnShowing(event -> System.out.println("Afisare fereastra"));
        primaryStage.setOnShown(event -> System.out.println("Fereastra afisata"));

        primaryStage.show();
    }
}
