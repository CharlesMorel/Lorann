package model;

import model.Permeability;
import model.Sprite;

public class OutputDoor {
    private static final Sprite SPRITE = new Sprite('X', "gate_closed.png");
    
    OutputDoor() {
        super(SPRITE, Permeability.PENETRABLE);
    }
}
