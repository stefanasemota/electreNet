package ch.albertlegrand.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 30.03.12
 * Time: 20:57
 * To change this template use File | Settings | File Templates.
 */
@WebService(name = "eanSearcher")
@SOAPBinding(style = SOAPBinding.Style.RPC, use = SOAPBinding.Use.LITERAL)
public interface AlbertSearchService {
    @WebMethod(operationName = "searchBookEan", action = "searchEan")
    @WebResult(name = "bookEanItem")
    public String searchBookEan(@WebParam(name = "bookEan") String bookean);

    public AlbertSearchTO searchBookTitle(@WebParam(name = "bookTitle") String booktitle);

    public String webserviceVersion();
}
