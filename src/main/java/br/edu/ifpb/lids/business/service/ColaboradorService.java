package br.edu.ifpb.lids.business.service;

import br.edu.ifpb.lids.model.entity.Colaborador;
import org.springframework.stereotype.Service;

@Service
public interface ColaboradorService {

    public Colaborador create(Colaborador colaborador);

    public Colaborador update(Colaborador coordenador);

    public void delete(Long id);

    public Colaborador findAll();

    public Colaborador findById(Long id);
}
