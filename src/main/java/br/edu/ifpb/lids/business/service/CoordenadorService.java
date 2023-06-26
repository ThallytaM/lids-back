package br.edu.ifpb.lids.business.service;

import br.edu.ifpb.lids.model.entity.Coordenador;
import org.springframework.stereotype.Service;

@Service
public interface CoordenadorService {

    public Coordenador create(Coordenador coordenador);

    public Coordenador update(Coordenador coordenador);

    public void delete(Long id);

    public Coordenador findAll();

    public Coordenador findById(Long id);
}
