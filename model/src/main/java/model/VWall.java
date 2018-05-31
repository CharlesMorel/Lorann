package model;

import model.Permeability;
import model.Sprite;

public class VWall {
    private static final Sprite SPRITE = new Sprite('X', "vertical_bone.png");
    
    VWall() {
        super(SPRITE, Permeability.BLOCKING);
    }
}
