package controller;

import controller.IOrderPerformer;

public interface IController {
    void play() throws InterruptedException;
    IOrderPerformer getOrderPeformer();
}