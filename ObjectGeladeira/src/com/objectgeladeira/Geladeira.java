package com.objectgeladeira;

/**
 * @author euryss
 * @version  1.0
 *
 * <h1>Exercio: Criação de Objecto e Métodos</h1>
 *  <hr>
 *      <p>Neste ecercíco criei um objecto de nome geladeira e que pode efextuar as segintes operações<br>
 *      <ul>
 *          <li>Ligar a geladeira</li>
 *          <li>Desligar</li>
 *          <li>Abrir a porta da geladeira</li>
 *          <li>Fechar a Porta.</li>
 *      </ul>
 *      e no final podemos observar esse comportamento  atravez do métedo  toDisplay()
 *      </p>
 * @link {@link https:www.git@github.com:euryss/exercecio-modulo7}
 * <a href ="https:www.git@github.com:euryss/exercecio-modulo7">Meu GitHub</a>
 *
 */
public class Geladeira {
    private String marca;
    private String modelo;
    private String cor;
    private boolean ligado;
    private boolean estado;
    private double comprimento;
    private double largura;

    public Geladeira(String marca, String modelo, String cor, boolean ligado, boolean estado, double height, double width ){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ligado = ligado;
        this.estado = estado;
        this.comprimento = height;
        this.largura = width;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return this.cor;
    }
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    public boolean getLigado(){
        return this.ligado;
    }
    public void setEstado(boolean estado){
        this.estado = estado;
    }
    public boolean getEstado(){
        return this.estado;
    }
    public void setComprimento(double comprimento){
        this.comprimento = comprimento;
    }
    public double getComprimento(){
        return this.comprimento;
    }
    public void setLargura(double largura){
        this.largura = largura;
    }
    public double getLargura(){
        return this.largura;
    }

    public boolean ligar(){
        if(this.getLigado()== true){
          return false;
        }else{
            this.setLigado(true);
            return true;
        }
    }
    public boolean desligar(){
        if(this.getLigado()){
            this.setLigado(false);
            return true;
        }else{
            return false;
        }
    }
    public boolean abrir(){
        if(this.getEstado() != true){
            this.setEstado(true);
            return true;
        }else{
            return false;
        }
    }
    public boolean fechar(){
        if(this.getEstado() == true){
            this.setEstado(false);
            return true;
        }else{
            return false;
        }
    }

    /**
     * @see public void toDisplay();
     * <h2>toDisplay()</h2>
     * <p>É responsaver pela visualização do comportamento da aplicação</p>
     */
    public void toDisplay(){
        System.out.println("---------------");
        System.out.println("   Geladeira   ");
        System.out.println("________________");
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modeldo: " + this.getModelo());
        System.out.println("Cor: "+ this.getCor());
        if(this.getLigado()){
            System.out.println("Ligado -> "+ this.getLigado());
        }else {
            System.out.println("Desligado -> "+ this.getLigado());
        }
        if (this.estado){
            System.out.println("   Aberta   ");
        }else{
            System.out.println("   Fechada  ");
        }
        System.out.println("________________");
        System.out.println("Cumprimento: " + this.getComprimento()+"  Largura: "+this.getLargura());
    }
}
