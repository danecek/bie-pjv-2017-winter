/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biapj.jfxdialog;

import java.util.Optional;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 *
 * @author danecek
 */
public class MyDialog extends Dialog<ButtonType> implements ChangeListener<String> {

    TextField nameField;
    MainWindow mw;
    Text errorText;

    public MyDialog(MainWindow mw) {
        this.mw = mw;
        nameField = new TextField();
        errorText = new Text();
        errorText.setStyle("-fx-fill:red");
        getDialogPane().getButtonTypes().addAll(ButtonType.CANCEL, ButtonType.OK);
        getDialogPane().setContent(new VBox(createContent(), errorText));
        nameField.textProperty().addListener(this);
        changed(null, null, nameField.getText());
    }

    private Node createContent() {
        HBox content = new HBox(new Label("Name:"), nameField);
        return content;
    }

    public void execute() {
        Optional<ButtonType> o = showAndWait();
        if (o.get() == ButtonType.OK) {
            mw.setNewName(nameField.getText());
        }
    }

    @Override
    public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
        if (newValue.isEmpty()) {
            errorText.setText("must be nonempty");
        } else {
            errorText.setText("");
        }
    }
}
