package patterns.flyweight;

import java.util.Vector;

public class DBConnectionFactory {
    private static Vector<DBConnection> pool = new Vector<DBConnection>();
    private static Vector<Integer> connectionStates = new Vector<Integer>();

    public static void init(int n) {
        for(int i = 0; i < n; i++) {
            DBConnection conn = new DBConnection(i);
            pool.add(conn);
            connectionStates.add(0);
        }
    }

    public static DBConnection getDBConnection() {
        for(int i = 0; i < pool.size(); i++) {
            if (connectionStates.get(i).equals(0)) {
                connectionStates.set(i, 1);
                return pool.get(i);
            }
        }
        return null;
    }

    public static void releaseDBConnection(DBConnection conn) {
        int index = pool.indexOf(conn);
        connectionStates.set(index, 0);
    }
}
