package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utils.exceptions.exceptions;

public class MissingArgumentException extends Exception {
    public MissingArgumentException() {
        super("Un argument est manquant dans le fichier");
    }
}