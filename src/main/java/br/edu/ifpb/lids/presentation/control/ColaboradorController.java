package br.edu.ifpb.lids.presentation.control;

import br.edu.ifpb.lids.business.service.ColaboradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/colaborador")
public class ColaboradorController {

    @Autowired
    private ColaboradorService colaboradorService;

    @PostMapping
    public ResponseEntity create(){
        return null;
    }

    @PutMapping
    public ResponseEntity update(){
        return null;
    }
    @DeleteMapping
    public ResponseEntity delete(){
        return null;
    }
    @GetMapping
    public ResponseEntity findAll(){
        return null;
    }

    public ResponseEntity findById(){
        return null;
    }


}
