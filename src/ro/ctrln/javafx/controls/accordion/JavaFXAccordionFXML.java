package ro.ctrln.javafx.controls.accordion;

import com.sun.org.apache.xml.internal.resolver.readers.SAXParserHandler;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ro.ctrln.javafx.shapes.ShapesUtils;

public class JavaFXAccordionFXML extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("JavaFXAccordion.fxml"));

        Scene scene = new Scene(root, 600, 500);

        ShapesUtils.showPrimaryStage(primaryStage, scene, "JavaFX Accordion with Scene Builder");
    }
}
