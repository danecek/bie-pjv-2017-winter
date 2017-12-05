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
public class RedYellowState extends State {

    public static  RedYellowState instance = new RedYellowState(Color.RED, Color.YELLOW);

    private RedYellowState(Color... colors) {
        super(colors);
    }

    @Override
    State nextState() {
       return GreenState.instance;
    }

}
