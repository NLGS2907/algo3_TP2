package edu.fiuba.algo3.modelo;

public class Caracteristica {

    private String tipo;
    private String valor;

    Caracteristica()
    {
        this.tipo = "";
        this.valor = "";
    }

    Caracteristica(String tipo)
    {
        this.tipo = tipo;
        this.valor = "";
    }

    Caracteristica(String tipo, String valor)
    {
        this.tipo = tipo;
        this.valor = valor;
    }

    public void establecerTipo(String tipo)
    {
        this.tipo = tipo;
    }

    public void establecerValor(String valor)
    {
        this.valor = valor;
    }

    public boolean compararTipo(Caracteristica caracteristicaAComparar)
    {
        return (this.tipo.equalsIgnoreCase(caracteristicaAComparar.tipo));
    }

    public boolean compararValor(Caracteristica caracteristicaAComparar)
    {
        return (this.valor.equalsIgnoreCase(caracteristicaAComparar.valor));
    }

    public boolean valorEsNulo()
    {
        return (this.valor.length() == 0);
    }

    public boolean compararManeraExacta(Caracteristica caracteristicaAComparar)
    {
        return (compararTipo(caracteristicaAComparar) && compararValor(caracteristicaAComparar));
    }

    public boolean esUna(Caracteristica caracteristicaAComparar)
    {
        boolean esSimilar = false;

        if(compararTipo(caracteristicaAComparar))
        {
            if(compararValor(caracteristicaAComparar) || caracteristicaAComparar.valorEsNulo())
            {
                esSimilar = true;
            }
        }

        return esSimilar;
    }

    //?!
    public String obtenerTipo(){
        return this.tipo;
    }
    //NO SE USA
    public String obtenerValor(){
        return this.valor;
    }

}
