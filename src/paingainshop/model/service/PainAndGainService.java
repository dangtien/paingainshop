/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paingainshop.model.service;

import paingainshop.model.DAO.HangHoaDAO;
import paingainshop.model.DAO.NhaCungCapDAO;
import paingainshop.model.DAO.PhieuChiDAO;

/**
 *
 * @author dangt
 * 
 */
public class PainAndGainService {
    /**
     * 
     * @param prefix 'tien to cho khoa chinh
     * @param lastPkey 'khoa chinh duoc cap nhat cuoi cung trong csdl
     * @return datatype String
     * @throws Exception 
     */
    public static String CreatePKey(String prefix ,String lastPkey) throws Exception{
        HangHoaDAO hh = new HangHoaDAO();
       
        if(!lastPkey.isEmpty()){
            int i;
            for (i=2;i<lastPkey.length();i++){
                if(lastPkey.charAt(i) != '0'){
                    break;
                }
            }
            String tmp = lastPkey.substring(i);
            System.out.println(tmp);
            int beflen = tmp.length();
            int intTmp = Integer.parseInt(tmp);
            intTmp=intTmp+1;
            tmp = Integer.toString(intTmp);
            System.out.println(tmp);
            int aflen = tmp.length();
            if(beflen == aflen){
                lastPkey = lastPkey.substring(0,i) + tmp;
            }else{
                lastPkey = lastPkey.substring(0,i-1) + tmp;
            }
        }else{
            lastPkey = prefix+"000001";
        }
        return lastPkey;
    }
}
