package model;

public class MotionlessElementFactory {
    private static final Energy energy = new Energy();
    private static final HWall hWall = new HWall();
    private static final VWall vWall = new VWall();
    private static final InputDoor inputDoor = new InputDoor();
    private static final Money money = new Money();
    private static final OutputDoor ouputDoor = new OutputDoor();
    private static final Pilar pilar = new Pilar();
    
    
    private static MotionlessElement[] motionlessElements  = {
	    energy,
	    hWall,
	    vWall,
	    inputDoor,
	    money,
	    ouputDoor,
	    pilar, };
    
    public static MotionlessElement createEnergy() {
        return energy;
    }
    
    public static MotionlessElement createHWall() {
        return hWall;
    }
    
    public static MotionlessElement createVWall() {
        return vWall;
    }
    
    public static MotionlessElement createInputDoor() {
        return inputDoor;
    }
    
    public static MotionlessElement createMoney() {
        return money;
    }
    
    
    public static MotionlessElement createOuputDoor() {
        return ouputDoor;
    }
    
    public static MotionlessElement createPilar() {
        return pilar;
    }
    
}
