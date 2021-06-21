package ro.ctrln.javafx.shapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Cylinder;
import javafx.stage.Stage;

public class Cylinder3D extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(150);
        cylinder.setRadius(50);

        cylinder.setTranslateX(100);
        cylinder.setTranslateY(100);
        cylinder.setTranslateZ(20);

        VBox root = new VBox(cylinder);

        Scene scene = new Scene(root,500,500);

        scene.setCamera(ShapesUtils.setPerspectiveCamera(0,0,-50));

        ShapesUtils.showPrimaryStage(primaryStage, scene, "Learning about JavaFX Shapes - Cylinder");

    }
}
