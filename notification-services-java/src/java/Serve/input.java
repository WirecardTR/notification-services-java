/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serve;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author yunus
 */
public class input {
   
public UUID OrderObjectId;
public String GSM;
public String MPAY;
public String SMSContent;
public double TotalPrice;
public  double TotalUnitPrice;
public   int State;
public  int StatusCode;
public   int ErrorCode;
public  int ErrorMessage;
public    Date PaymentDateTime; 
public  int GsmOperator;
public int GsmType;
public UUID SubscriberId;
public List<Product>  Product;
public  int  OrderChannelId;
public  int  PaymentTypeId;
public   int  PaymentCategoryId;
public  String  Pin; 

}
