package biapj.semaphor;

import biapj.semaphor.controller.SemController;
import biapj.semaphor.view.Semaphor;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        final SemController sc = new SemController();
        Button next = new Button("Next");
        Parent root = new TitledPane("Semaphor",
                new VBox(new Semaphor(30,
                        Color.RED, Color.YELLOW, Color.GREEN),
                        new HBox(next)));
        
        next.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                sc.next();
            }
        });

        Scene scene = new Scene(root);
        
        

        stage.setTitle("JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
