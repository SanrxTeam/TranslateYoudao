
package com.sanrxteam.YoudaoAPI;


import java.util.List;

public class Json {

   private List<String> translation;
   private String query;
   private int errorcode;
   public void setTranslation(List<String> translation) {
        this.translation = translation;
    }
    public List<String> getTranslation() {
        return translation;
    }

   public void setQuery(String query) {
        this.query = query;
    }
    public String getQuery() {
        return query;
    }

   public void setErrorcode(int errorcode) {
        this.errorcode = errorcode;
    }
    public int getErrorcode() {
        return errorcode;
    }

}