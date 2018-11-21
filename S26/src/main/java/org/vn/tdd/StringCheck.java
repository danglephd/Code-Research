/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vn.tdd;

import org.springframework.util.StringUtils;

/**
 *
 * @author danglph
 */
public class StringCheck {
    
    public boolean checkValidString(String str){
//        boolean isValidStr = true;
        
        if(str == null || str.equals("")){
            return false;
        }
        
        if((str.contains("{") && !str.contains("}"))
                || (str.contains("}") && !str.contains("{"))
                ){
            return false;
        }
        if((str.contains("[") && !str.contains("]"))
                || (str.contains("]") && !str.contains("["))
                ){
            return false;
        }
        if((str.contains("(") && !str.contains(")"))
                || (str.contains(")") && !str.contains("("))
                ){
            return false;
        }
        int indexOfSqu = str.indexOf("[");
        if(indexOfSqu > str.indexOf("]")){
            return false;
        }
        int indexOfRou = str.indexOf("(");
        if(indexOfRou > str.indexOf(")")){
            return false;
        }
        int indexOfHok = str.indexOf("{");
        if(indexOfHok > str.indexOf("}")){
            return false;
        }
        int countSquRouHokOpen = StringUtils.countOccurrencesOf(str, "[");// str.split("\\[");
        int countSquRouHokClose = StringUtils.countOccurrencesOf(str, "]");
        if(countSquRouHokClose != countSquRouHokOpen){
            return false;
        }
        countSquRouHokOpen = StringUtils.countOccurrencesOf(str, "(");// str.split("\\[");
        countSquRouHokClose = StringUtils.countOccurrencesOf(str, ")");
        if(countSquRouHokClose != countSquRouHokOpen){
            return false;
        }
        countSquRouHokOpen = StringUtils.countOccurrencesOf(str, "{");// str.split("\\[");
        countSquRouHokClose = StringUtils.countOccurrencesOf(str, "}");
        if(countSquRouHokClose != countSquRouHokOpen){
            return false;
        }
        
        int start = str.indexOf("(");
        int end = str.lastIndexOf(")");
        if(start < 0 || end < 0){
            start = str.indexOf("[");
            end = str.lastIndexOf("]");
            if(start < 0 || end < 0){
                start = str.indexOf("{");
                end = str.lastIndexOf("}");
                if(start < 0 || end < 0){
                    return true;
                }
            }
        }
        String blockStr = str.substring(start + 1, end);
        if(!checkValidString(blockStr)){
            return false;
        }else{
            return true;
        }
        
        
//        return isValidStr;
    }
}
