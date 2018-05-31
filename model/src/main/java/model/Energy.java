package model;

import model.Permeability;
import model.Sprite;

public class Energy extends MotionlessElement{
    private static final Sprite SPRITE = new Sprite('X', "crystal_ball.png");
    
    Energy() {
        super(SPRITE, Permeability.PENETRABLE);
    }
}
