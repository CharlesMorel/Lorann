package model;

import java.util.Observable;
import model.IElement;

public interface ILevel {
    int getWidth();
    int getHeight();
    IElement getInTheLevelXY(int x, int y);
    void setMotionElementHasChanged();
    Observable getObservable();
}