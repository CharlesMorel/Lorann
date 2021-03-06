package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import model.Example;
import controller.IController;
import model.IModel;
import view.IView;
import controller.IOrderPerformer;

/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ControllerFacade implements IController {
    private UserOrder stackOrder;

    /** The view. */
    private final IView  view;

    /** The model. */
    private final IModel model;

    /**
     * Instantiates a new controller facade.
     *
     * @param view
     *            the view
     * @param model
     *            the model
     */
    public ControllerFacade(final IView view, final IModel model) {
        super();
        this.view = view;
        this.model = model;
    }
    
    @Override
    public final void orderPerform(final UserOrder userOrder) throws IOException {
        this.setStackOrder(userOrder);
    }

    /**
     * Start.
     *
     * @throws SQLException
     *             the SQL exception
     */
    public void start() throws SQLException {
        this.getView().displayMessage(this.getModel().getExampleById(1).toString());

        this.getView().displayMessage(this.getModel().getExampleByName("Example 2").toString());

        final List<Example> examples = this.getModel().getAllExamples();
        final StringBuilder message = new StringBuilder();
        for (final Example example : examples) {
            message.append(example);
            message.append('\n');
        }
        this.getView().displayMessage(message.toString());
    }

    /**
     * Gets the view.
     *
     * @return the view
     */
    public IView getView() {
        return this.view;
    }
    
    private void setView(final IView view) {
        this.view = view;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    public IModel getModel() {
        return this.model;
    }
    
    private void setModel(final IModel model) {
        this.model = model;
    }
    
    private UserOrder getStackOrder() {
        return this.stackOrder;
    }
    
    private void setStackOrder(final UserOrder stackOrder) {
        this.stackOrder = stackOrder;
    }
    
    private void clearStackOrder() {
        this.stackOrder = UserOrder.NOP;
    }
    
    @Override
    public IOrderPerformer getOrderPeformer() {
        return this;
    }

	@Override
	public void play() throws InterruptedException {
		// TODO Auto-generated method stub
		
	}
}
