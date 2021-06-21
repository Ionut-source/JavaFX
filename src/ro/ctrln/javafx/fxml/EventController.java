package ro.ctrln.javafx.fxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class EventController {

    @FXML
    private Text changedText;

    @FXML
    protected void changeTextOnPain(ActionEvent event) {
        changedText.setText("Text modificat de buton!");

    }
}
