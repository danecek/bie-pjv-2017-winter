/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biapj.semaphor.view;

import java.util.Observable;
import java.util.Observer;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author danecek
 */
public class Light extends VBox implements Observer {

    Circle bulb;
    Color c;

    public Light(Color c, double radius) {
        bulb = new Circle(radius);
        this.c = c;
        this.getChildren().add(bulb);
        set(true);
    }

    void set(boolean on) {
        if (on) {
            bulb.fillProperty().set(c);
        } else {
            bulb.fillProperty().set(Color.DARKGRAY);
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
