package xyz.marcelosantos.contatos.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import xyz.marcelosantos.contatos.entities.Contact
import xyz.marcelosantos.contatos.repositories.ContactRepository

@RestController
@RequestMapping("/contacts")
class ContactController {
    @Autowired
    lateinit var repository: ContactRepository

    @GetMapping
    fun index(): List<Contact>{
        return repository.findAll()
    }

    @PostMapping
    fun create(@RequestBody contact: Contact): Contact {
        return repository.save(contact)
    }
}