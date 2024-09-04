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
public class Carross {

    /**
     * @return the Passageiros
     */
    public int getPassageiros() {
        return Passageiros;
    }

    /**
     * @param Passageiros the Passageiros to set
     */
    public void setPassageiros(int Passageiros) {
        this.Passageiros = Passageiros;
    }

    /**
     * @return the Capacidade
     */
    public double getCapacidade() {
        return Capacidade;
    }

    /**
     * @param Capacidade the Capacidade to set
     */
    public void setCapacidade(double Capacidade) {
        this.Capacidade = Capacidade;
    }

    /**
     * @return the Kmporlitro
     */
    public double getKmporlitro() {
        return Kmporlitro;
    }

    /**
     * @param Kmporlitro the Kmporlitro to set
     */
    public void setKmporlitro(double Kmporlitro) {
        this.Kmporlitro = Kmporlitro;
    }
    private int Passageiros;
    private double Capacidade;
    private double Kmporlitro;
}
