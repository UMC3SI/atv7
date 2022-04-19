/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade7;

/**
 * @author Bruno Rodrigues (11211501661@alunos.umc.br)
 * @author Bianca Gomes (11211101607@alunos.umc.br)
 *
 */
public class Aluno {
    
    private String m1;
    private String m2;
    private double media;

    public Aluno(String m1, String m2) {
        this.m1 = m1;
        this.m2 = m2;
    }    

    public String getM1() {
        return m1;
    }

    public void setM1(String m1) {
        this.m1 = m1;
    }

    public String getM2() {
        return m2;
    }

    public void setM2(String m2) {
        this.m2 = m2;
    }

    public double getMedia() {
        return media;
    }
    
    public void calculaMedia (){
        float m1 = (float) (new Float(this.m1).floatValue());
        float m2 = (float) (new Float(this.m1).floatValue());
        this.media = ((m2 * 2)+ m1) / 3;
    }
      
    
    
}
