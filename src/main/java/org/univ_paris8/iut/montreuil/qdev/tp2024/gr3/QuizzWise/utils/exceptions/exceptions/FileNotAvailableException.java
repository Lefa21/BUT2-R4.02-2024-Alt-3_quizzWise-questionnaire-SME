package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utils.exceptions.exceptions;

public class FileNotAvailableException extends Exception{

    public FileNotAvailableException(){
        super("Le fichier n'a pas été trouvé");
    }
}