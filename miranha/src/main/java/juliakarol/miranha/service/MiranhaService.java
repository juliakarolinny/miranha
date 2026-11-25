package juliakarol.miranha.service;


import juliakarol.miranha.entities.Miranha;
import juliakarol.miranha.repository.MiranhaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MiranhaService {

    private final MiranhaRepository repository;

    public MiranhaService(MiranhaRepository repository) {
        this.repository = repository;
    }

    public Miranha salvar (Miranha miranhs){
        return repository.save(miranhs);
    }

    public List<Miranha> listar(){
        return repository.findAll();
    }

}
