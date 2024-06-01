package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.impl;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.entities.dto.QuestionDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.interfaces.IServiceQuestion;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utils.exceptions.enumerate.Difficulte;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utils.exceptions.exceptions.MissingArgumentException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utils.exceptions.exceptions.WrongArgumentTypeException;

public class ServiceQuestion implements IServiceQuestion {

    public QuestionDTO creerQuestion(String[] ligne) throws MissingArgumentException, WrongArgumentTypeException {
        Difficulte difficulte = (Integer.parseInt(ligne[5]) == 1)? Difficulte.FACILE : (Integer.parseInt(ligne[5]) == 2)? Difficulte.INTERMEDIARE : Difficulte.DIFFICILE;

        QuestionDTO question = new QuestionDTO(
                Integer.parseInt(ligne[1]),
                ligne[3],
                ligne[4],
                difficulte
        );

        return question;
    }
}
