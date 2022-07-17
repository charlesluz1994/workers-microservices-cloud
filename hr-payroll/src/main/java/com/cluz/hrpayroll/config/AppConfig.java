package com.cluz.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//Exemplo de singleton(instancia unica), para ter a disposicao um objeto restTemplate para injetar em outros servicos.
//Bean que terá uma instancia unica da aplicação, que servirá de comunicação com outras.

//restTemplate serve para registrar uma instancia unica(singleton) de um objeto do tipo restTemplate. E esta instancia servira para injetar em outros componentes.
//Resumidamente, cria um componente, só que não na classe, e sim a partir de uma chamada de método.
@Configuration
public class AppConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }


}
