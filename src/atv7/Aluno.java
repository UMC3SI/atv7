/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv7;

/**
 *
 * @author Guilherme Antunes-RGM:11211102142 Matheus Meirielli-RGM:11211102089
 */
public class Aluno {

    double media;
    String M1, M2;

    public Aluno(String M1, String M2) {
        this.M1 = M1;
        this.M2 = M2;
    }

    public double CalculoMedia() {
        media = (Double.parseDouble(M1) + Double.parseDouble(M2)) / 2;
        return media;
    }

    public double getMedia() {
        return media;
    }

    public String getM1() {
        return M1;
    }

    public void setM1(String M1) {
        this.M1 = M1;
    }

    public String getM2() {
        return M2;
    }

    public void setM2(String M2) {
        this.M2 = M2;
    }
}
