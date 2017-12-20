package patterns.flyweight;

public class DBClientThread extends Thread {
    private DBConnection conn;
    public DBClientThread(DBConnection conn) {
        this.conn = conn;
    }
    public void run() {
        System.out.println("Use DBConnection id: " + this.conn.getId());
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        DBConnectionFactory.releaseDBConnection(this.conn);
        this.conn = null;
    }
}
