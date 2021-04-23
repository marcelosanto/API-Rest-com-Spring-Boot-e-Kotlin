package xyz.marcelosantos.contatos.entities

import org.springframework.lang.NonNull
import javax.persistence.*
import javax.validation.constraints.Email
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Entity
@Table(name = "contacts")
class Contact (
    @field:Id
    @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @field:NotNull
    @field:Size(min = 5, max = 50)
    var name: String,

    @field:NotNull
    @field:Email
    var email: String
)