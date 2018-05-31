package model;

import model.Permeability;
import model.Sprite;

public class Pilar {
    private static final Sprite SPRITE = new Sprite('X', "bone.png");
    
    Pilar() {
        super(SPRITE, Permeability.BLOCKING);
    }
}
