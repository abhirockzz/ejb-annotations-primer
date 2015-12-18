package ejbap.exceptions;

import javax.ejb.ApplicationException;

@ApplicationException(rollback = true)
public class UpdateException extends RuntimeException{
    //details ommitted
}
