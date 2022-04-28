package uaslp.objetos.list.exception;

public class NotNullValuesAllowedException extends RuntimeException{
    public NotNullValuesAllowedException(){
        super("Null values are not allowed");
    }
}