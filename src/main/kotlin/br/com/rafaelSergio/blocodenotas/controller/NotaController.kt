package br.com.rafaelSergio.blocodenotas.controller

import br.com.rafaelSergio.blocodenotas.model.Nota
import br.com.rafaelSergio.blocodenotas.service.NotaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import javax.xml.ws.Service


@RestController
@RequestMapping("/nota")

class NotaController {

    @Autowired
    lateinit var notaService: NotaService

    @GetMapping("/check")
    fun checkHealth(): String{
        return "OK"
    }

    @GetMapping("/getAll")
    fun buscarTodos() : List<Nota>{
        return notaService.buscarTodos()
    }

    @PostMapping("/salvar")
    fun salvar(@RequestBody nota: Nota) : Nota {
        return notaService.salvar(nota)
    }

    @DeleteMapping("/apagar/{id}")
    fun apagar(@PathVariable("id")id: String){
        notaService.apagar(id)
    }

    @GetMapping("/busca/{id}")
    fun buscarPor(@PathVariable("id")id: String): Nota{
        return notaService.buscarId(id)
    }

    @GetMapping("/titulo/{titulo}")
    fun buscarPortitulo(@PathVariable("titulo")titulo: String): Nota{
        return notaService.buscarPorTitulo(titulo)
    }


}