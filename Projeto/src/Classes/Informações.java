
package Classes;

/**
 * 
 * @author Luiz
 * Esta é a Classe responsável por converter as informções para fazer as operações necessarias
 * 
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Informações {
    public static boolean isNumeric(String numero){
        try{
          Integer.parseInt(numero);
          return true;
          
        }catch(NumberFormatException nfe){
            nfe.printStackTrace();
            return false;
        }
    }
    //converte a data
    public static Date stringtoDate(String data){
        SimpleDateFormat formatTexto= new SimpleDateFormat("yyyy/MM/dd");
        Date x=null;
        try{
            x=formatTexto.parse(data);
        }catch(ParseException e){
            e.printStackTrace();
        }
        return x;
    }
    
    public static String formatDate(Date Data){
        SimpleDateFormat formatTexto= new SimpleDateFormat("yyyy/MM/dd");
        return formatTexto.format(Data);
    }
    
    public static String objectToString(Object obj){
        String str="";
        if(obj!=null){
            str=obj.toString();
        }
        return str;
    }
    
    public static int objecToInt(Object obj){
        int numInt=Integer.parseInt(objectToString(obj));
        return numInt;
    } 
    
    public static boolean objectToBoolean(Object obj){
        String cadBool=objectToString(obj);
        Boolean bool= new Boolean(cadBool);
        return bool;
    }
    
    public static double objectToDouble(Object obj){
        String str=obj.toString();
        double numDouble=Double.valueOf(str).doubleValue();
        return numDouble;
    }
}
