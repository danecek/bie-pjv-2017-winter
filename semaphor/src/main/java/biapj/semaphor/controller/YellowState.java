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
public class YellowState extends State {

    public static  YellowState instance = new YellowState(Color.YELLOW);

    private YellowState(Color... colors) {
        super(colors);
    }

    @Override
    State nextState() {
       return RedState.instance;
    }

}
