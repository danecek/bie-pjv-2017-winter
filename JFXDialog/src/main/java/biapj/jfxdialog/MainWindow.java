/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biapj.jfxdialog;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class MainWindow extends BorderPane {

    Text name;
    public MainWindow() {
        HBox buttonBar = new HBox();
        setBottom(buttonBar);
        setCenter( name = new Text());
        buttonBar.setPadding(new Insets(5));
        buttonBar.setSpacing(5);
        Button open = new Button("Open");
        open.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new MyDialog(MainWindow.this).execute();
            }
        });
        buttonBar.getChildren().add(open);

    }

    void setNewName(String newName){
        name.setText(newName);
    }

}
