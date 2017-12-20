package patterns.flyweight;

public class Test {
    public static void main(String[] args) {
        DBConnectionFactory.init(5);

        for (int i = 0; i < 10; i++) {
            DBConnection conn = DBConnectionFactory.getDBConnection();
            if (conn != null) {
                DBClientThread thread = new DBClientThread(conn);
                thread.start();
            } else {
                System.out.println("Can not get a db conn.");
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
