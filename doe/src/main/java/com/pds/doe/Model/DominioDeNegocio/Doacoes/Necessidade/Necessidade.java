package com.pds.doe.Model.DominioDeNegocio.Doacoes.Necessidade;

import java.util.Date;

public class Necessidade {
    private int quantidade;
    private Date prazoLimite;
    private int itemId;

    public Necessidade(int quantidade, Date prazoLimite, int itemId) {
        this.quantidade = quantidade;
        this.prazoLimite = prazoLimite;
        this.itemId = itemId;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getPrazoLimite() {
        return this.prazoLimite;
    }

    public void setPrazoLimite(Date prazoLimite) {
        this.prazoLimite = prazoLimite;
    }

    public int getItemId() {
        return this.itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
}
