package ejbap.di_and_ri;

import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.ejb.Stateless;
import javax.enterprise.concurrent.ManagedExecutorService;
import javax.sql.DataSource;

@Stateless
@Resources({
@Resource(lookup="java:comp/DefaultManagedExecutorService", 
        type = ManagedExecutorService.class),
@Resource(lookup = "java:comp/DefaultDataSource" , 
        type = DataSource.class)
})
public class MultipleResources {
    
}
