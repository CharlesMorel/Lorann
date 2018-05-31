package model;

import java.awt.Image;
import model.IElement;

public abstract class Element implements IElement{
	private Sprite sprite;
	private Permeability permeability;
	
    public Element(final Sprite sprite, final Permeability permeability) {
        this.setSprite(sprite);
        this.setPermeability(permeability);
    }

    @Override
	public Sprite getSprite() {
		return sprite;
	}

	protected void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}

	@Override
	public Permeability getPermeability() {
		return permeability;
	}

	
	private void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}
	
    @Override
    public final Image getImage() {
        return this.getSprite().getImage();
    }
    
    
}
