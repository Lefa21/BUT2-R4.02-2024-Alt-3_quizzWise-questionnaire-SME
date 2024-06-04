package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.impl.question;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.entities.dto.QuestionDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.interfaces.IServiceQuestion;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utils.exceptions.enumerate.Difficulte;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utils.exceptions.exceptions.MissingArgumentException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utils.exceptions.exceptions.WrongArgumentTypeException;

public class IServiceQuestionMockOk implements IServiceQuestion {
    @Override
    public QuestionDTO creerQuestion(String[] ligne) throws MissingArgumentException, WrongArgumentTypeException {
        QuestionDTO expectedQuestionDTO = new QuestionDTO(1,"Question 1", "Reponse 1", Difficulte.DIFFICILE);
        return expectedQuestionDTO;
    }
}