package br.edu.ifpb.lids.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "colaborador")
public class Colaborador extends Associado {

}
