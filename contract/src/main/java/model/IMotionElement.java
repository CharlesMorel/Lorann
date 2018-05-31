package model;

import java.awt.Point;
import model.IElement;
import showboard.IPawn;

public interface IMotionElement extends IPawn, IElement{
	void moveUp();
	void moveDown();
	void moveLeft();
	void moveRight();
	void doNothing();
	
	@Override
	int getX();
	
	@Override
	int getY();
	
	boolean getIsAlive();
	
	@Override
	Point getPosition();
	
}
