package br.edu.ifg.sistemacomercial.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class Pedido_has_produto_ implements Serializable {

    private Integer produto;
    private Integer pedido;

}
