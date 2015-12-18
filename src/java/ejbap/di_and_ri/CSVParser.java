package ejbap.di_and_ri;

import javax.ejb.Stateless;

@Stateless(name = "CSVParserBean")
public class CSVParser implements Parser{

    @Override
    public String parse(String file) {
        return ""; //dummy
    }
}
