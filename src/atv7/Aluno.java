/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv7;

/**
 *
 * @author Julia Calazans - 11211102258@alunos.umc.br
 * @author Gustavo Monteiro - 11211100223@alunos.umc.br
 */
public class Aluno {
    private double media;
    private String m1;
    private String m2;

    public Aluno(String m1, String m2){
        this.m1 = m1;
        this.m2 = m2;
    }
    public double getMedia(){
        return media;
    }
    public String getM1(){
        return m1;
    }
    public String getM2(){
        return m2;
    }
    public void setM1(String m1){
        this.m1 = m1;
    }
    public void setM2(String m2){
        this.m2 = m2;
    }
    public void calcularMedia(){
        media = (Double.parseDouble(m1) + Double.parseDouble(m2)) / 2;
    }
    
}