package task1.Exception;

public class CatNotFoundException extends  RuntimeException{
    public CatNotFoundException(String message) {
        super(message);
    }
}
