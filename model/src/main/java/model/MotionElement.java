package model;

import java.awt.Point;
import model.Element;
import model.Permeability;
import model.Sprite;
import showboard.IBoard;

abstract class MotionElement extends Element implements IMotionElement {
	private Point position;
	private boolean isAlive = true;
	private ILevel level;
	private IBoard board;
	
	public MotionElement(final Sprite sprite, final ILevel level, final Permeability permeability) {
		super(sprite, permeability);
		this.setLevel(level);
		this.position = new Point();
	}
	
	public MotionElement(final int x, final int y, final Sprite sprite, final ILevel level, final Permeability permeability) {
		this(sprite, level, permeability);
		this.setX(x);
		this.setY(y);
	}
	
    @Override
    public void moveUp() {
        this.setY(this.getY() - 32);
        this.setHasMoved();
    }
    
    @Override
    public void moveDown() {
        this.setY(this.getY() + 32);
        this.setHasMoved();
    }
    
    @Override
    public void moveLeft() {
        this.setX(this.getX() - 32);
        this.setHasMoved();
    }
    
    @Override
    public void moveRight() {
        this.setX(this.getX() + 32);
        this.setHasMoved();
    }
    
    @Override
    public void doNothing() {
        this.setHasMoved();
    }
    
    private void setHasMoved() {
        this.getLevel().setMotionElementHasChanged();
    }
    
    @Override
    public final int getX() {
        return this.getPosition().x;
    }
    
    public final void setX(final int x) {
        this.getPosition().x = x;
    }
    
    @Override
    public final int getY() {
        return this.getPosition().y;
    }
    
    public final void setY(final int y) {
        this.getPosition().y = y;
    }
    
    public ILevel getRoad() {
        return this.level;
    }
    
    private void setLevel(final ILevel level) {
        this.level = level;
    }
    
    @Override
    public Boolean getIsAlive() {
        return this.isAlive;
    }
    
    protected void die() {
        this.isAlive = false;
        this.setHasMoved();
    }
    
    @Override
    public Point getPosition() {
        return this.position;
    }
    
    public void setPosition(final Point position) {
        this.position = position;
    }
    
    protected IBoard getBoard() {
        return this.board;
    }
}
