package main;

import java.sql.SQLException;
import model.IModel;
import controller.IController;
import controller.ControllerFacade;
import model.ModelFacade;
import view.ViewFacade;

public abstract class Main {
    private static final int startX;
    private static final int startY;

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) throws IOException, InterruptedException {
    	final ModelFacade model = new ModelFacade(resultSet, startX, startY);
    	final ViewFacade view = new ViewFacade(model.getLevel(), model.getLorann());
        final ControllerFacade controller = new ControllerFacade(view, model);
        view.setOrderPerformer(controller.getOrderPeformer());
        
        try {
            controller.start();
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }
    }

}
