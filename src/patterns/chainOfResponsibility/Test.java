package patterns.chainOfResponsibility;

public class Test {
    public static void main(String[] args) {
        Handler branchManager = new BranchManager();
        Handler director = new Director();
        Handler generalManager = new GeneralManager();

        branchManager.setNextHandler(director);
        director.setNextHandler(generalManager);

        Request request1 = new Request(new Level(1));
        Response response1 = branchManager.handleMessage(request1);
        System.out.println(response1.getContent());

        Request request2 = new Request(new Level(2));
        Response response2 = branchManager.handleMessage(request2);
        System.out.println(response2.getContent());

        Request request3 = new Request(new Level(3));
        Response response3 = branchManager.handleMessage(request3);
        System.out.println(response3.getContent());

    }
}
