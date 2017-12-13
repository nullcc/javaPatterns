package patterns.chainOfResponsibility;

public class GeneralManager extends Handler {
    @Override
    protected Level getHanlerLevel() {
        return new Level(3);
    }

    @Override
    protected Response makeResponse(Request request) {
        return new Response("GeneralManager: OK");
    }
}
