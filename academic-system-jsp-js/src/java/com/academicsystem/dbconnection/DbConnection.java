package com.academicsystem.dbconnection;

import java.sql.SQLException;
import java.sql.*;

import static com.academicsystem.util.EnvironmentConstants.*;
import com.academicsystem.util.PathResources;


/**
 *Class by Database connection with singleton pattern
 * @author cristhiandgz
 */
public class DbConnection {
    
    private static Connection connection = null;    

    private DbConnection() {}
    
    public static Connection getConnection()
    {
        ClassLoader classLoader = DbConnection.class.getClassLoader();
        PathResources resource = new PathResources(classLoader);
        
        try {
            if (connection == null) {
                Class.forName("org.sqlite.JDBC");
                connection = DriverManager
                        .getConnection(SQLITE_HOST + resource.generatePath(DB_NAME)+ DB_NAME);           
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        
        return connection;
    }  
    
}
