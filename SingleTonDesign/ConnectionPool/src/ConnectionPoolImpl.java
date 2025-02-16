import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class ConnectionPoolImpl implements ConnectionPool {
    private static volatile ConnectionPoolImpl instance;
    private static ArrayList<DatabaseConnection> availableConnections;
    private static ArrayList<DatabaseConnection> usedConnections;
//    private static Semaphore semaphore;
    private static int maxConnections;


    private ConnectionPoolImpl(){
        availableConnections = new ArrayList<>();
        usedConnections = new ArrayList<>();
    }

    @Override
    public void initializePool() {
        for(int i=0;i<maxConnections;i++){
            availableConnections.add(new DatabaseConnection());
        }

    }

    @Override
    public DatabaseConnection getConnection() {
        if(availableConnections.size()==0){
            return null;
        }
        DatabaseConnection databaseConnection = availableConnections.remove(0);
        usedConnections.add(databaseConnection);

        return databaseConnection;
    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {
        if(usedConnections.size()==0){
            return;
        }
        usedConnections.remove(connection);
        availableConnections.add(connection);

    }

    @Override
    public int getAvailableConnectionsCount() {
        return availableConnections.size();
    }

    @Override
    public int getTotalConnectionsCount() {
        return maxConnections;
    }
    public static ConnectionPoolImpl getInstance(int maxConnections){
        if(instance == null){
            synchronized (ConnectionPoolImpl.class){
                if(instance == null){
                    instance = new ConnectionPoolImpl();
                    ConnectionPoolImpl.maxConnections = maxConnections;
                }
            }
        }
        return instance;
    }
    public static void resetInstance(){
        instance = null;
    }
}
