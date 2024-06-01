package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.entities.dto.QuestionDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utils.exceptions.exceptions.MissingArgumentException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utils.exceptions.exceptions.WrongArgumentTypeException;

public interface IServiceQuestion {

    public QuestionDTO creerQuestion(String[] ligne) throws MissingArgumentException, WrongArgumentTypeException;
}

