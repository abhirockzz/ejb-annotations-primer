package ejbap.di_and_ri;

import javax.ejb.Stateless;

@Stateless(name = "XMLParserBean")
public class XMLParser implements Parser {

    @Override
    public String parse(String file) {
        return ""; //dummy
    }

}
