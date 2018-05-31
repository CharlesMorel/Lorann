package model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Sprite {
	private Image image;
    private String imageName;
    private char DBImage;
    private boolean isImageLoaded;
    
    public Sprite(final char character, final String imageName) {
        this.setDBImage(character);
        this.setImageName(imageName);
    }
    
    public Sprite(final char character) {
        this(character, "noimage.png");
    }
    
    public final void loadImage() throws IOException{
    	this.setImage(ImageIO.read(new File("E:\\Exia\\Projet\\Projet 5\\sprite\\"+this.getImageName())));
    }

	public final Image getImage() {
		return this.image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public final String getImageName() {
		return this.imageName;
	}

	public void setImageName(final String imageName) {
		this.imageName = imageName;
	}

	public final char getDBImage() {
		return this.DBImage;
	}

	public void setDBImage(final char dBImage) {
		this.DBImage = dBImage;
	}

	public boolean getIsImageLoaded() {
		return isImageLoaded;
	}

	public void setIsImageLoaded(boolean imageLoaded) {
		this.isImageLoaded = imageLoaded;
	}
    
    
}
