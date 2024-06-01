package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utils.exceptions.exceptions;

public class EmptyFileException extends Exception{
    public EmptyFileException(){
        super("Le fichier est vide");
    }
    }
