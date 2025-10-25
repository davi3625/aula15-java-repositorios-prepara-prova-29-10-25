package escolaSpring.entities;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name ="tb_notas")
public class Notas implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double valor;

    public Notas(){}

    public Notas(long id, double valor) {
        this.id = id;
        this.valor = valor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

