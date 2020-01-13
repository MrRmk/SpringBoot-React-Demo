package com.example.dream.utils;

public class DreamUtils {

    private String def = "";


    public DreamUtils(String def) {
        this.def = def;
    }

    public DreamUtils() {
        this.def = "";
    }

    public static String StringNullDef(String value, String def){
        if(value == null){
            if(def != null && def != ""){
                value = def;
            }else{
                value = "";
            }
        }
        return value;
    }

}

