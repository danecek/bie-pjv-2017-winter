/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biapj.semaphor.view;

import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author danecek
 */
public class Semaphor extends VBox {

    public Semaphor(double radius, Color... lights) {
        
        for (Color c : lights) {
            getChildren().add(new Light(c, radius));
        }

    }

}
