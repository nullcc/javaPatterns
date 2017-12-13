package patterns.chainOfResponsibility;

public class BranchManager extends Handler {
    @Override
    protected Level getHanlerLevel() {
        return new Level(1);
    }

    @Override
    protected Response makeResponse(Request request) {
        return new Response("BranchManager: OK");
    }
}
