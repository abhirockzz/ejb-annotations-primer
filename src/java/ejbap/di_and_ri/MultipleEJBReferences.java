package ejbap.di_and_ri;

import javax.ejb.EJB;
import javax.ejb.EJBs;
import javax.ejb.Stateless;
import javax.naming.InitialContext;
import javax.naming.NamingException;

@Stateless
@EJBs({
  @EJB(name = "CSVParserEJB", beanInterface = Parser.class, beanName = "CSVParser"),
  @EJB(name = "XMLParserEJB", beanInterface = Parser.class, beanName = "XMLParser")
})
public class MultipleEJBReferences {
    
    public Parser getXMLParser(){
        try {
            return lookup("java:comp/env/XMLParserEJB");
        } catch (NamingException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public Parser getCSVParser(){
        try {
            return lookup("java:comp/env/CSVParserEJB");
        } catch (NamingException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    private Parser lookup(String jndiName) throws NamingException{
        return (Parser) new InitialContext().lookup(jndiName);
    }
}
