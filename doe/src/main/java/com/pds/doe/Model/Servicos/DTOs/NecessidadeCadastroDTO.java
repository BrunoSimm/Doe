package com.pds.doe.Model.Servicos.DTOs;

import java.util.Date;

public class NecessidadeCadastroDTO {

    int expectedQuantity;
    Date limitDate;
    int currentQuantity;
    String status;
    Long idItem;

    public NecessidadeCadastroDTO(int expectedQuantity, Date limitDate, int currentQuantity, String status,
            Long idItem) {
        this.expectedQuantity = expectedQuantity;
        this.limitDate = limitDate;
        this.currentQuantity = currentQuantity;
        this.status = status;
        this.idItem = idItem;
    }

    public int getExpectedQuantity() {
        return expectedQuantity;
    }

    public void setExpectedQuantity(int expectedQuantity) {
        this.expectedQuantity = expectedQuantity;
    }

    public Date getlimitDate() {
        return limitDate;
    }

    public void setlimitDate(Date limitDate) {
        this.limitDate = limitDate;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getIdItem() {
        return idItem;
    }

    public void setIdItem(Long idItem) {
        this.idItem = idItem;
    }

    @Override
    public String toString() {
        return "NecessidadeCadastroDTO [currentQuantity=" + currentQuantity + ", expectedQuantity=" + expectedQuantity
                + ", idItem=" + idItem + ", limitDate=" + limitDate + ", status=" + status + "]";
    }
}
