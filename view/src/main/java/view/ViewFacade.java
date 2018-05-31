package view;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import controller.IOrderPerformer;
import view.IView;
import model.UserOrder;
import model.ILevel;
import model.IMotionElement;
import showboard.BoardFrame;
import model.Level;
/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade implements IView, Runnable, KeyListener {
	private static final int levelView   = 10;
	private static final int squareSize = 50;
	private Rectangle closeView;
	private ILevel level;
	private IMotionElement lorann;
	private int view;
	private IOrderPerformer orderPerformer;
	
    /**
     * Instantiates a new view facade.
     */
    public ViewFacade(final ILevel level, final IMotionElement lorann) throws IOException {
        this.setView(levelView);
        this.setLevel(level);
        this.setLorann(lorann);
        this.getLorann().getSprite().loadImage();
        SwingUtilities.invokeLater(this);
    }
    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
    public final void run() {
        final BoardFrame boardFrame = new BoardFrame("Close view");
        boardFrame.setDisplayFrame(this.closeView);
        boardFrame.setSize(this.closeView.width * squareSize, this.closeView.height * squareSize);
        boardFrame.setHeightLooped(true);
        boardFrame.addKeyListener(this);
        boardFrame.setFocusable(true);
        boardFrame.setFocusTraversalKeysEnabled(false);
        boardFrame.addSquare(this.level.getInTheLevelXY(x, y), x, y);
        boardFrame.addPawn(this.getLorann());
        this.getLevel().getObservable().addObserver(boardFrame.getObserver());
        boardFrame.setVisible(true);
    }
    
    public final void show() {
    	System.out.print(this.getLorann().getSprite().getDBImage());
    	System.out.print(this.getLevel().getInTheLevelXY(x, y).getSprite().getDBImage());
    	System.out.print("\n");
    }
    
    private static UserOrder keyCodeToUserOrder(final int keyCode) {
        UserOrder userOrder;
        switch (keyCode) {
	        case KeyEvent.VK_UP:
	            userOrder = UserOrder.UP;
	            break;
	        case KeyEvent.VK_DOWN:
	            userOrder = UserOrder.DOWN;
	            break;
            case KeyEvent.VK_LEFT:
                userOrder = UserOrder.LEFT;
                break;
            case KeyEvent.VK_RIGHT:
                userOrder = UserOrder.RIGHT;
                break;
            default:
                userOrder = UserOrder.NOP;
                break;
        }
        return userOrder;
    }
    
    @Override
    public void keyTyped(final KeyEvent keyEvent) {
        // Nop
    }
    
    @Override
    public final void keyPressed(final KeyEvent keyEvent) {
        try {
            this.getOrderPerformer().orderPerform(keyCodeToUserOrder(keyEvent.getKeyCode()));
        } catch (final IOException exception) {
            exception.printStackTrace();
        }
    }
    
    @Override
    public void keyReleased(final KeyEvent keyEvent) {
        // Nop
    }
    
    private ILevel getLevel() {
        return this.level;
    }
    
    private void setLevel (ILevel level) {
    	this.level = level;
    }
    
    private IMotionElement getLorann() {
        return this.lorann;
    }
    
    private void setLorann(final IMotionElement lorann) {
        this.lorann = lorann;
    }
    
    private int getView() {
        return this.view;
    }
    
    private void setView(final int view) {
        this.view = view;
    }
    
    private Rectangle getCloseView() {
        return this.closeView;
    }
    
    private void setCloseView(final Rectangle closeView) {
        this.closeView = closeView;
    }
    
    private IOrderPerformer getOrderPerformer() {
        return this.orderPerformer;
    }
    
    public final void setOrderPerformer(final IOrderPerformer orderPerformer) {
        this.orderPerformer = orderPerformer;
    }
}
