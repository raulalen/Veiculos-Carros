/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculoss;

/**
 *
 * @author lab11
 */
public class Veiculoss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carross minivan = new Carross();
        Carross carroEsporte = new Carross(); 
        double autonomia;
        minivan.setCapacidade(40);
        minivan.setKmporlitro(12);
        minivan.setPassageiros(6);
        
        cadastrarCapacidadeCarro(minivan);
        carroEsporte = minivan;
        carroEsporte.setPassageiros(80);
        cadastrarCapacidadeCarro(carroEsporte);
        
       if(carroEsporte.equals(minivan))
       {
           System.out.println("\nIguais \n");
       }
       else
       {
            System.out.println("Diferentes \n");
       }
       
       System.out.println("Minivan: "+minivan.getPassageiros());
       System.out.println("Esporte: "+carroEsporte.getPassageiros());
    }

    private static void cadastrarCapacidadeCarro(Carross carro) {
        double autonomia;
        autonomia = carro.getKmporlitro()*carro.getCapacidade();
        System.out.println("autonomia: "+autonomia+" km");
        carro.setKmporlitro(16);
        autonomia = carro.getKmporlitro()*carro.getCapacidade();
        System.out.println("autonomia: "+autonomia+" km");
    }
        
}
