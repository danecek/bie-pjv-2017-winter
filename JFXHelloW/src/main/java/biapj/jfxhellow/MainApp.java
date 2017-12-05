package biapj.jfxhellow;

import java.util.Date;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainApp extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane root = new BorderPane();//FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml"));
        root.setCenter(new Circle(10));
        Button btn = new Button("Click");
        final Text t;
        root.setTop(t = new Text());
        root.setBottom(btn);
        
        btn.setOnAction(
                //       new MyButtonHandle()

                new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                t.setText(new Date().toString());
                
            }
        }
        );
        
        Scene scene = new Scene(root, 800, 600);
        scene.getStylesheets().add("/styles/Styles.css");        
        stage.setTitle("JavaFX and Maven");
        stage.setScene(scene);
        stage.centerOnScreen();
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
