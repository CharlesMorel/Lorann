package model.element.motionless;

import contract.model.Permeability;
import model.element.Sprite;

public class Bone extends MotionlessElement {
	   /** The Constant SPRITE. */
 private static final Sprite SPRITE = new Sprite('O', "bone.png");

	 /**
	  * Instantiates a new bone.
	  */
	 Bone() {
	     super(SPRITE, Permeability.BLOCKING);
	 }
}