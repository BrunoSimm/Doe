package com.pds.doe.Model.Servicos.DTOs;

public class EntityExistDTO {

    boolean exists;

    public EntityExistDTO(boolean exists) {
        this.exists = exists;
    }

    public EntityExistDTO(){
        
    }

    public boolean getExists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }
    
}
