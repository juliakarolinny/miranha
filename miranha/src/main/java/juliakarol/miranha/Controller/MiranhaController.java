package juliakarol.miranha.Controller;


import jakarta.persistence.GeneratedValue;
import juliakarol.miranha.entities.Miranha;
import juliakarol.miranha.service.MiranhaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MiranhaController {

    private final MiranhaService service;
    public MiranhaController(MiranhaService service){
        this.service = service;
    }
@PostMapping
    public String save(@RequestBody Miranha m){
        return service.salvar(m) + " Miranha Calvo com sucesso";
    }

    @GetMapping
    public List<Miranha> listar(){
        return service.listar();
    }

}
