package model;

import java.sql.SQLException;
import java.util.List;
import model.dao.ExampleDAO;
import java.io.IOException;
import model.IMotionElement;
import model.Lorann;

public final class ModelFacade implements IModel {
	private ILevel level;
	private IMotionElement lorann;

    /**
     * Instantiates a new model facade.
     */
    public ModelFacade(final String resultSet, final int lorannStartX, final int lorannStartY) throws IOException {
    	this.setLevel(new Level(resultSet));
    	this.setLorann(new Lorann(lorannStartX, lorannStartY, this.getLevel()))
    }
    
    @Override
    public final ILevel getLevel() {
        return this.level;
    }
    
    private void setLevel(final ILevel level) {
        this.level = level;
    }
    
    @Override
    public final IMotionElement getLorann() {
        return this.lorann;
    }
    
    private void setLorann(final IMotionElement lorann) {
        this.lorann = lorann;
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleById(int)
     */
    @Override
    public Example getExampleById(final int id) throws SQLException {
        return ExampleDAO.getExampleById(id);
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleByName(java.lang.String)
     */
    @Override
    public Example getExampleByName(final String name) throws SQLException {
        return ExampleDAO.getExampleByName(name);
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getAllExamples()
     */
    @Override
    public List<Example> getAllExamples() throws SQLException {
        return ExampleDAO.getAllExamples();
    }

}
