package model;

import model.Permeability;
import model.Sprite;

public class InputDoor extends MotionlessElement {
    private static final Sprite SPRITE = new Sprite('X', "gate_open.png");
    
    InputDoor() {
        super(SPRITE, Permeability.PENETRABLE);
    }
}
