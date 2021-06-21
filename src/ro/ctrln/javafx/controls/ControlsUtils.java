package ro.ctrln.javafx.controls;

import java.awt.*;
import java.net.URI;

public class ControlsUtils {

    public static void browseCourse(String message, String link) {
        System.out.println(message);
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().browse(URI.create(link));
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
