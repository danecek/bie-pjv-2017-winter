/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biapj.semaphor.controller;

import java.util.Observable;
import java.util.logging.Logger;

/**
 *
 * @author danecek
 */
public class SemController extends Observable {
    
    State state;
    private static final Logger LOG = Logger.getLogger(SemController.class.getName());
    
    public void reset() {
        state = RedState.instance;        
    }
    
    public void next() {
        state = state.nextState();
        LOG.info(state.toString());
    }

    public SemController() {
        reset();
    }
    
    
}
