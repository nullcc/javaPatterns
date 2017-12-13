package patterns.chainOfResponsibility;

public class Director extends Handler {
    @Override
    protected Level getHanlerLevel() {
        return new Level(2);
    }

    @Override
    protected Response makeResponse(Request request) {
        return new Response("Director: OK");
    }
}
