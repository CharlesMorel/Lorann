package model;

import model.Permeability;
import model.Sprite;

public class HWall  extends MotionlessElement {
    private static final Sprite SPRITE = new Sprite('X', "horizontal_bone.png");
    
    HWall() {
        super(SPRITE, Permeability.BLOCKING);
    }
}
