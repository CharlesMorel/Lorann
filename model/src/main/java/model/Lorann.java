package model;

import java.io.IOException;
import contract.ILevel;
import model.Permeability;
import model.Sprite;

public class Lorann {
	private static final Sprite spriteUp = new Sprite((Character) null, "lorann_u.png");
	private static final Sprite spriteDown = new Sprite((Character) null, "lorann_b.png");
	private static final Sprite spriteLeft = new Sprite((Character) null, "lorann_l.png");
	private static final Sprite spriteRight = new Sprite((Character) null, "lorann_r.png");

	public Lorann(final int x, final int y, final ILevel level) throws IOExecption{
		super();
		spriteUp.loadImage();
		spriteDown.loadImage();
		spriteLeft.loadImage();
		spriteRight.loadImage();
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
