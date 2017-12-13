package patterns.decorator;

public class Test {
    public static void main(String[] args) {
        Handler requestHandler = new RequestHandler();

        System.out.println("------ Has no decorator ------");
        requestHandler.handle();

        System.out.println();
        System.out.println("------ Add a log decorator ------");
        requestHandler = new LogDecorator(requestHandler);
        requestHandler.handle();

        System.out.println();
        System.out.println("------ Add a blacklist decorator ------");
        requestHandler = new BlacklistDecorator(requestHandler);
        requestHandler.handle();

    }
}
