package xyz.marcelosantos.contatos.repositories

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import xyz.marcelosantos.contatos.entities.Contact

@Repository
interface ContactRepository: JpaRepository<Contact, Long> {
}