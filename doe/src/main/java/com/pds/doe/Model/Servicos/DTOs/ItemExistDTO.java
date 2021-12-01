package com.pds.doe.Model.Servicos.DTOs;

public class ItemExistDTO {

    boolean exists;

    public ItemExistDTO(boolean exists) {
        this.exists = exists;
    }

    public ItemExistDTO(){
        
    }

    public boolean isExists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }
    
}
