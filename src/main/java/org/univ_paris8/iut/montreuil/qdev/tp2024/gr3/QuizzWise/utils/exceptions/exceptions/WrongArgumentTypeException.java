package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utils.exceptions.exceptions;

public class WrongArgumentTypeException extends Exception{
    public WrongArgumentTypeException(){
        super("Un ou plusieurs arguments n'ont pas le bon type");
    }
}
