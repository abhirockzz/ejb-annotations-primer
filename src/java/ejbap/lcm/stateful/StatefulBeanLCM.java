package ejbap.lcm.stateful;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.PrePassivate;
import javax.ejb.Stateful;
import java.sql.Connection;
import java.sql.SQLException;
import javax.ejb.PostActivate;
import javax.ejb.Remove;

@Stateful
public class StatefulBeanLCM {
    
    private Connection conn;
    
    @PostConstruct
    @PostActivate
    public void init(){
        //fetch a DB connection
        conn = getConnection();
    }
    
    @PreDestroy
    @Remove
    @PrePassivate
    public void close(){
        closeConnection();
    }
    
    private Connection getConnection(){
        //dummy method
        return null;
    }
    
    private void closeConnection(){
        try {
            conn.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

}
