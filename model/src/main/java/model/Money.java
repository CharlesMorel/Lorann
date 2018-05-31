package model;

import model.Permeability;
import model.Sprite;

public class Money {
    private static final Sprite SPRITE = new Sprite('X', "purse.png");
    
    Money() {
        super(SPRITE, Permeability.PENETRABLE);
    }
}