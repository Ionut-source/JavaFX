package ro.ctrln.javafx.controls;

import javafx.scene.control.ProgressBar;

import java.io.File;

public class LoadingComand implements Runnable {

    private final ProgressBar progressBar;
    private final File loadedFile;

    public LoadingComand(ProgressBar progressBar, File loadedFile) {
        this.progressBar = progressBar;
        this.loadedFile = loadedFile;
    }

    @Override
    public void run() {
        int i = 1;
        while (i<=10) {
            try {
                Thread.sleep(1000);
            }catch (Exception ex) {
                ex.printStackTrace();
            }
            progressBar.setProgress(0.1 * i);
            i++;
        }
        if (loadedFile !=null) {
            System.out.println("Am incarcat fsierul: " + loadedFile.getName());
        }

    }
}
