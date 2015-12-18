package ejbap.di_and_ri;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class XMLParsingService {
    
    @EJB(beanName = "XMLParserBean", beanInterface = Parser.class)
    Parser parser;
    
    public String parse(String file){
        return parser.parse(file);
    }
}
