package model.element.motionless;

import contract.model.Permeability;
import model.element.Sprite;

public class Purse extends MotionlessElement {
	   /** The Constant SPRITE. */
 private static final Sprite SPRITE = new Sprite('$', "purse.png");

	 /**
	  * Instantiates a new purse.
	  */
	 Purse() {
	     super(SPRITE, Permeability.PENETRABLE);
	 }
}
