package br.com.tarefa.tarefa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tarefa.tarefa.entity.Tarefa;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

}