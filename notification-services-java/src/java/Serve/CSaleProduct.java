/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serve;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.jws.WebParam;

/**
 *
 * @author Codevist
 */
public class CSaleProduct {

        public int  ProductId ;
       public int  ProductCategory ;
       public String ProductDescription;
       public double BasePrice;
       public double BaseUnitPrice;
       public int Unit; 

       
}
 class Product {

       public List<CSaleProduct>  CSaleProduct;


       
}
