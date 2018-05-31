package model;

import model.Permeability;
import model.Sprite;

public class VWall  extends MotionlessElement {
    private static final Sprite SPRITE = new Sprite('X', "vertical_bone.png");
    
    VWall() {
        super(SPRITE, Permeability.BLOCKING);
    }
}
