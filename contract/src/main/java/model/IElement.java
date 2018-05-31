package model;

import java.awt.Image;
import model.Permeability;
import model.Sprite;
import showboard.ISquare;

public interface IElement extends ISquare{
	Sprite getSprite();
	Permeability getPermeability();
	
	@Override
	Image getImage();
}