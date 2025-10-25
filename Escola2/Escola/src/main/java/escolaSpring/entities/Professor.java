package escolaSpring.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;


@Entity
@Table(name ="tb_professor")
public class Professor extends Pessoa implements Serializable {


    private String email;

    public Professor(){
        super();
    }

    public Professor(String email) {
        this.email = email;
    }

    public Professor(long id, String nome, String cpf, String datadenascimento, String email) {
        super(id, nome, cpf, datadenascimento);
        this.email = email;


    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
