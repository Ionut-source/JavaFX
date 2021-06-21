package ro.ctrln.javafx.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import ro.ctrln.javafx.shapes.ShapesUtils;

import java.awt.*;
import java.net.URI;
import java.util.Arrays;

public class JavaFXHyperlink extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Accordion accordion = new Accordion();

        TitledPane titledPaneOne = new TitledPane("Cursuri", new Label("Arata cursurile disponibile"));
        TitledPane titledPaneTwo = new TitledPane("Seminarii", new Label("Arata toate seminarile disponibile"));

        Accordion labAccordion = new Accordion();

        Hyperlink javaIntro = new Hyperlink("Introducere in Java");
        Hyperlink javaCode = new Hyperlink("Gestionarea codului sursa");
        Hyperlink javaClasses = new Hyperlink("Clase, obiecte si variabile");

        javaIntro.setOnAction(event -> ControlsUtils.browseCourse ("Deschid introducere in Java", "https://ctrln.ro/courses/java-developer/lessons/java-developer-lectia-1"));

        javaCode.setOnAction(event -> ControlsUtils.browseCourse ("Deschid Gestionarea codului sursa", "https://ctrln.ro/courses/java-developer/lessons/java-developer-lectia-2"));

        javaClasses.setOnAction(event -> ControlsUtils.browseCourse ("Deschid Clase, obiecte si variabile", "https://ctrln.ro/courses/java-developer/lessons/java-developer-lectia-3"));

        labAccordion.getPanes().add(new TitledPane("Lab 1", javaIntro));
        labAccordion.getPanes().add(new TitledPane("Lab 2", javaCode));
        labAccordion.getPanes().add(new TitledPane("Lab 3", javaClasses));

        TitledPane titledPaneThree = new TitledPane("Laboratoare" ,  labAccordion);

        accordion.getPanes().addAll(Arrays.asList(titledPaneOne,titledPaneTwo,titledPaneThree));

        StackPane root = new StackPane(accordion);

        Scene scene = new Scene(root, 500,500);

        ShapesUtils.showPrimaryStage(primaryStage,scene,"JavaFX Hyperlink");
    }
}
