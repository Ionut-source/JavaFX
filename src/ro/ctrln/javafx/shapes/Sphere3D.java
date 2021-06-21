package ro.ctrln.javafx.shapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;

public class Sphere3D extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        Sphere sphere = new Sphere();
        
        sphere.setRadius(50);
        
        sphere.setTranslateX(100);
        sphere.setTranslateY(150);
        sphere.setTranslateZ(100);

        VBox root = new VBox(sphere);

        Scene scene = new Scene(root, 500, 500);

        scene.setCamera(ShapesUtils.setPerspectiveCamera(20,20,20));

        ShapesUtils.showPrimaryStage(primaryStage, scene, "Learning about JavaFX Shapes - Sphere");
        
    }
}
