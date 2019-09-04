package com.example.ejerciciopooandroid.clases;

import com.example.ejerciciopooandroid.clases.operaciones.Operadores;

public class OperadoresLogicos extends Operadores {
    public  double sumar(){
        return (this.getValor1() + this.getValor2());
    }
    public  double restar(){
        return (this.getValor1() - this.getValor2());
    }
    public  double multiplica(){
        return (this.getValor1() * this.getValor2());
    }
    public  double divide(){
        return (this.getValor1() / this.getValor2());
    }
}
