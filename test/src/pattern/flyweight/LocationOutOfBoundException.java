package pattern.flyweight;

public class LocationOutOfBoundException extends Exception {

    public LocationOutOfBoundException(){}
    public LocationOutOfBoundException(String msg){
        super(msg);
    }
    public LocationOutOfBoundException(String msg,Throwable e){
        super(msg,e);
    }

}
