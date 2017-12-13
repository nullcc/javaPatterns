package patterns.chainOfResponsibility;

public abstract class Handler {
    private Handler nextHandler;

    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    public final Response handleMessage(Request request) {
        Response response = null;
        if (this.getHanlerLevel().equals(request.getLevel())) {
            response = this.makeResponse(request);
        } else {
            if (this.nextHandler != null) {
                System.out.println("pass to next handler...");
                response = this.nextHandler.handleMessage(request);
            }
        }
        return response;
    }

    protected abstract Level getHanlerLevel();
    protected abstract Response makeResponse(Request request);
}
