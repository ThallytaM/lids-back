package br.edu.ifpb.lids.business.service.impl;

import br.edu.ifpb.lids.business.service.ColaboradorService;
import br.edu.ifpb.lids.model.entity.Colaborador;
import br.edu.ifpb.lids.model.repository.ColaboradorRepository;
import org.springframework.stereotype.Service;

@Service
public class ColaboradorServiceImpl implements ColaboradorService {

    private ColaboradorRepository colaboradorRepository;
    @Override
    public Colaborador create(Colaborador colaborador) {

//        if(findById(colaborador.getId()) != null){
//            throw new IllegalStateException("Colaborador já cadastrado.");
//        }
        return colaboradorRepository.save(colaborador);
    }

    @Override
    public Colaborador update(Colaborador coordenador) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Colaborador findAll() {
        return null;
    }

    @Override
    public Colaborador findById(Long id) {
        return null;
    }
}
