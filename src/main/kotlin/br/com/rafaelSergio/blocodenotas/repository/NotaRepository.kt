package br.com.rafaelSergio.blocodenotas.repository

import br.com.rafaelSergio.blocodenotas.model.Nota
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface NotaRepository : MongoRepository<Nota, String>{

    fun findByTitulo(titulo: String): Nota

}