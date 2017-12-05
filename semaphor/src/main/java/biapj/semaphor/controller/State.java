/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biapj.semaphor.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableSet;
import javafx.scene.paint.Color;

public abstract class State {
   
    ObservableSet<Color> state;

    public State(Color ... colors) {
        state = FXCollections.observableSet(colors);
    }
    
    abstract State nextState();

    @Override
    public String toString() {
        return state.toString();
    }
    
}
