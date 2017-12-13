package patterns.decorator;

public class RequestHandler extends Handler {
    @Override
    public void handle() {
        System.out.println("Request processing success.");
    }
}
