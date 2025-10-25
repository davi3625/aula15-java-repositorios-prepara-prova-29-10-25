package escolaSpring.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name ="tb_aluno")
public class Aluno extends Pessoa implements Serializable {


    private String matricula;


    public Aluno(){
        super();
    }

    public Aluno(String matricula) {
        this.matricula = matricula;
    }

    public Aluno(long id, String nome, String cpf, String datadenascimento, String matricula) {
        super(id, nome, cpf, datadenascimento);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
