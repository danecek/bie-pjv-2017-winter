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
public class GreenState extends State {

    public static GreenState instance = new GreenState(Color.RED);

    private GreenState(Color... colors) {
        super(colors);
    }

    @Override
    State nextState() {
        return YellowState.instance;

    }

}
