package br.edu.ifpb.lids.presentation.control;

import br.edu.ifpb.lids.business.service.CoordenadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/coordenador")
public class CoordenadorController {

    @Autowired
    private CoordenadorService coordenadorService;

    public ResponseEntity create(){
        return null;
    }

    public ResponseEntity update(){
        return null;
    }
    public ResponseEntity delete(){
        return null;
    }
    public ResponseEntity findAll(){
        return null;
    }
    public ResponseEntity findById(){
        return null;
    }


}
