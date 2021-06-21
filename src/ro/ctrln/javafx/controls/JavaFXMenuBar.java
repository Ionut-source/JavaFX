package ro.ctrln.javafx.controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import ro.ctrln.javafx.shapes.ShapesUtils;
import java.util.Arrays;

public class JavaFXMenuBar extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        MenuBar menuBar = new MenuBar();

        // Definirea primelor 3 meniuri: Cursuri, Seminarii , Laboratoare
        Menu coursesMenu = new Menu("Cursuri");
        coursesMenu.setGraphic(getImageView("file:calendar.png"));

        Menu seminarsMenu = new Menu("Seminarii");
        seminarsMenu.setGraphic(getImageView("file:world-wide-web.png"));

        Menu labsMenu = new Menu("Laboratoare");
        labsMenu.setGraphic(getImageView("file:play-button.png"));

        // Definirea de MenuItems pt al 3-lea meniu: Laboratoare
        MenuItem labOne = new MenuItem("Lab 1");
        labOne.setGraphic(getImageView("file:calendar.png"));
        labOne.setOnAction(event -> ControlsUtils.browseCourse("Deschid introducere in Java", "https://ctrln.ro/courses/java-developer/lessons/java-developer-lectia-1"));

        MenuItem labTwo = new MenuItem("Lab 2");
        labTwo.setGraphic(getImageView("file:world-wide-web.png"));
        labTwo.setOnAction(event -> ControlsUtils.browseCourse("Deschid Gestionarea codului sursa", "https://ctrln.ro/courses/java-developer/lessons/java-developer-lectia-2"));

        MenuItem labThree = new MenuItem("Lab 3");
        labThree.setGraphic(getImageView("file:play-button.png"));
        labThree.setOnAction(event -> ControlsUtils.browseCourse("Deschid Clase, obiecte si variabile", "https://ctrln.ro/courses/java-developer/lessons/java-developer-lectia-3"));

        // Submeniu pt al 3-lea meniu: Laboratoare
        Menu labsSubmenu = new Menu("Teme");
        labsSubmenu.setGraphic(getImageView("file:home-page.png"));
        labsSubmenu.getItems().add(new MenuItem("Tema 1"));
        labsSubmenu.getItems().add(new MenuItem("Tema 2"));

        labsMenu.getItems().addAll(Arrays.asList(labOne, labTwo, labThree, new SeparatorMenuItem(), labsSubmenu));

        // Meniu care contine RadioMenuItems
        Menu currentLab = new Menu("Lab Activ");
        currentLab.setGraphic(getImageView("file:home-page.png"));

        RadioMenuItem radioMenuItemOne = new RadioMenuItem("Lab1");
        RadioMenuItem radioMenuItemTwo = new RadioMenuItem("Lab2");
        RadioMenuItem radioMenuItemThree = new RadioMenuItem("Lab3");

        ToggleGroup toggleGroup = new ToggleGroup();
        toggleGroup.getToggles().addAll(Arrays.asList(radioMenuItemOne, radioMenuItemTwo, radioMenuItemThree));

        currentLab.getItems().addAll(Arrays.asList(radioMenuItemOne, radioMenuItemTwo, radioMenuItemThree));

        // Meniu custom
        Menu customMenu = new Menu("Custom items");
        customMenu.setGraphic(getImageView("file:calendar.png"));
        CustomMenuItem customMenuItem = new CustomMenuItem();
        Button button = new Button("Apasa");
        button.setOnAction(event -> System.out.println("Buton apasat!"));
        customMenuItem.setContent(button);
        customMenuItem.setHideOnClick(false);

        customMenu.getItems().add(customMenuItem);

        // Toate componentele Menu Bar tebuiesc declarate si setate inainte de aceasta linie de cod
        menuBar.getMenus().addAll(Arrays.asList(coursesMenu, seminarsMenu, labsMenu, currentLab, customMenu));

        VBox root = new VBox(menuBar);
        Scene scene = new Scene(root, 500, 200);

        ShapesUtils.showPrimaryStage(primaryStage, scene, "JavaFX Menu Bar");
    }

    private ImageView getImageView(String file) {
        ImageView imageView = new ImageView(file);
        imageView.setFitWidth(20);
        imageView.setFitHeight(20);
        return imageView;
    }
}
