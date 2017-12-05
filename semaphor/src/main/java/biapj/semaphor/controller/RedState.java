/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biapj.semaphor.controller;

import javafx.scene.paint.Color;

/**
 *
 * @author danecek
 */
public class RedState extends State {

    public static RedState instance = new RedState(Color.RED);

    private RedState(Color... colors) {
        super(colors);
    }

    @Override
    State nextState() {
        return RedYellowState.instance;

    }

}
