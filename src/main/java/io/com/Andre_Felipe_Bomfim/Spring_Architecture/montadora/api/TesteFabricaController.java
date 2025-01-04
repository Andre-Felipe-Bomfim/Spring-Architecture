package io.com.Andre_Felipe_Bomfim.Spring_Architecture.montadora.api;

import io.com.Andre_Felipe_Bomfim.Spring_Architecture.montadora.CarroStatus;
import io.com.Andre_Felipe_Bomfim.Spring_Architecture.montadora.Chave;
import io.com.Andre_Felipe_Bomfim.Spring_Architecture.montadora.HondaHRV;
import io.com.Andre_Felipe_Bomfim.Spring_Architecture.montadora.Motor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {

    @Autowired//injete a instancia do motor la das configuration
    //@Qualifier("motorTurbo")
    @Eletrico
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave){
        var carro = new HondaHRV(motor);
        return carro.darIginicao(chave);
    }
}
