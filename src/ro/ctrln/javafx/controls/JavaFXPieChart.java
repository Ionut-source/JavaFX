package ro.ctrln.javafx.controls;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import ro.ctrln.javafx.shapes.ShapesUtils;

public class JavaFXPieChart extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        PieChart pieChart = new PieChart();

        PieChart.Data java = new PieChart.Data("Java", 523);
        PieChart.Data python = new PieChart.Data("Python", 103);
        PieChart.Data kotlin = new PieChart.Data("Kotlin", 57);
        PieChart.Data cSharp = new PieChart.Data("CSharp", 87);
        PieChart.Data pascal = new PieChart.Data("Pascal", 155);

        pieChart.getData().addAll(java, pascal,python,kotlin,cSharp);

        VBox vBox = new VBox(pieChart);
        vBox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vBox, 500, 500);
        ShapesUtils.showPrimaryStage(primaryStage, scene, "JavaFX Pie Chart");

    }
}
