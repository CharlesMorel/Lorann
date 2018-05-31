package model;

import model.Permeability;
import model.Sprite;

public class Energy {
    private static final Sprite SPRITE = new Sprite('X', "crystal_ball.png");
    
    Energy() {
        super(SPRITE, Permeability.PENETRABLE);
    }
}
