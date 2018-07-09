/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serve;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Codevist
 */
@WebService(serviceName = "NotificationWebService",targetNamespace = "http://cservices.mikro-odeme.com.tr/mapping/generated")
public class NotificationWebService {

   
    @WebMethod(operationName = "ReceiveOrderResult")
    public String ReceiveOrderResult(
              @WebParam(name = "input") input input)
          
            
    {
        return null;
    }
    
    
    
    @WebMethod(operationName = "SubscriptionDeactivation")
    public String SubscriptionDeactivation(
              @WebParam(name = "input") input input
               
    )
          
           
    {
        return null;
    }
}
