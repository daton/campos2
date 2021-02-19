package com.campitos.campos

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class ControladorUsuario {

    @GetMapping("/usuario")
    public fun getUsuario():Usuario{
        var usuario=Usuario()
        usuario.email="rapidclimate@gmail.com"
        usuario.nombre="Juan Carlos"
        return usuario
    }
}