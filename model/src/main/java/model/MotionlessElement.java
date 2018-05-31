package model;

import model.Element;
import model.Permeability;
import model.Sprite;

abstract public class MotionlessElement extends Element{
	
	MotionlessElement(final Sprite sprite, final Permeability permeability){
		super(sprite, permeability);
	}
}
