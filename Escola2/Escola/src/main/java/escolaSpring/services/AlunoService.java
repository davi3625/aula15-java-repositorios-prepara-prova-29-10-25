package escolaSpring.services;

import escolaSpring.entities.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {



        @Autowired
        private AlunoService alunoService;

        public List<Aluno> findAll(){

            return alunoService.findAll();
        }

        public Aluno findByNome(String nome){
            Optional<Aluno> obj = alunoService.findByNome(nome);
            return obj.get();
        }
    }


