package model;

import java.io.IOException;
import model.ILevel;
import model.Permeability;
import model.Sprite;

public class Lorann {
	private static final Sprite spriteUp = new Sprite("lorann_u.png");
	private static final Sprite spriteDown = new Sprite("lorann_b.png");
	private static final Sprite spriteLeft = new Sprite("lorann_l.png");
	private static final Sprite spriteRight = new Sprite("lorann_r.png");

	public Lorann(final int x, final int y, final ILevel level) throws IOExecption{
		super(x, y, level, Permeability.BLOCKING);
		spriteUp.loadImage();
		spriteDown.loadImage();
		spriteLeft.loadImage();
		spriteRight.loadImag();
	}
	
	@Override
	public final void moveUp() {
		super.moveUp();
		this.setSprite(spriteUp);
	}
	
	@Override
	public final void moveDown() {
		super.moveDown();
		this.setSprite(spriteDown);
	}
	
	@Override
	public final void moveLeft() {
		super.moveLeft();
		this.setSprite(spriteLeft);
	}
	
	@Override
	public final void moveRight() {
		super.moveRight();
		this.setSprite(spriteRight);
	}
}
