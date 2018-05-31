package model;

import java.io.IOException;
import java.util.Observable;
import contract.IElement;
import contract.ILevel;
import model.MotionlessElement;

public class Level extends Observable implements ILevel{
    private int width;
    private int height;
    private IElement[][] inTheLevel;
    
    Level(String ResultSet) throws IOException{
    	super();
    }
    
    @Override
    public final int getWidth() {
    	return this.width;
    }
    
    private void setWidth(final int width) {
    	this.width = width;
    }
    
    @Override
    public final int getHeight() {
    	return this.height;
    }
    
    private void setHeight(final int height) {
    	this.height = height;
    }
    
    @Override
    public final IElement getInTheLevelXY(final int x, final int y) {
        return this.inTheLevel[x][y];
    }
    
    private void setInTheLevelXY(final IElement element, final int x, final int y) {
        this.inTheLevel[x][y] = element;
    }
    
    @Override
    public final void setMotionElementHasChanged() {
        this.setChanged();
        this.notifyObservers();
    }
    
    @Override
    public Observable getObservable() {
        return this;
    }
}
