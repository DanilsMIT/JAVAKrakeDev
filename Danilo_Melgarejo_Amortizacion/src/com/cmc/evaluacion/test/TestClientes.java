package com.cmc.evaluacion.test;

import com.cmc.evaluacion.Banco;
import com.cmc.evaluacion.Cliente;

public class TestClientes {
    public static void main(String[] args) {
        Banco banco = new Banco();
            Cliente cliente1 = new Cliente("1234567890", "Juan", "Perez");
            banco.agregarCliente(cliente1);
            cliente1.mostrarCliente();

          Cliente cliente2 = new Cliente("0987654321", "Maria", "Lopez");
            banco.agregarCliente(cliente2);
           cliente2.mostrarCliente();

           

          //  Intentar registrar un cliente duplicado
            Cliente cliente3 = new Cliente("1234567890", "Pedro", "Gomez");
            banco.agregarCliente(cliente3);
            
            
        }
    }

