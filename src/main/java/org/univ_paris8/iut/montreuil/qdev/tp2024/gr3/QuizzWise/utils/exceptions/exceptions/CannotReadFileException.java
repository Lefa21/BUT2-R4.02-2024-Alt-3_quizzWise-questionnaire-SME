package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utils.exceptions.exceptions;

public class CannotReadFileException extends Exception{
        public CannotReadFileException() {
                super("Le chargement du fichier est impossible");
        }
}
