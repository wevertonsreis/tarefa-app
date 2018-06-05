package br.com.tarefa.tarefa.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tarefa.tarefa.entity.Tarefa;
import br.com.tarefa.tarefa.repository.TarefaRepository;

@RestController
@RequestMapping("api/tarefas")
public class TarefaResource {
	
	@Autowired
	private TarefaRepository tarefaRepository;
	
	@GetMapping("/")
	private List<Tarefa> list() {
		return tarefaRepository.findAll();
	}
	
}