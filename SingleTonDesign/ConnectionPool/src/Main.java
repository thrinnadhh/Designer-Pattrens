//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    ConnectionPool connectionPool = ConnectionPoolImpl.getInstance(5);
    connectionPool.initializePool();
    System.out.println("Available connections: "+connectionPool.getAvailableConnectionsCount());
    DatabaseConnection connection = connectionPool.getConnection();
    System.out.println("Available connections: "+connectionPool.getAvailableConnectionsCount());
    connectionPool.releaseConnection(connection);
    System.out.println("Available connections: "+connectionPool.getAvailableConnectionsCount());
    }
}