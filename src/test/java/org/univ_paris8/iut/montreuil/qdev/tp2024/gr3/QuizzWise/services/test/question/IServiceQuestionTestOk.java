package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.test.question;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.entities.dto.QuestionDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.impl.question.IServiceQuestionMockOk;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.interfaces.IServiceQuestion;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utils.exceptions.enumerate.Difficulte;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utils.exceptions.exceptions.MissingArgumentException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utils.exceptions.exceptions.WrongArgumentTypeException;

public class IServiceQuestionTestOk {
    private IServiceQuestion iServiceQuestion = new IServiceQuestionMockOk();

    @Test
    public void testCreerQuestionOk() throws MissingArgumentException, WrongArgumentTypeException {
        QuestionDTO question = new QuestionDTO(1, "Question 1", "Reponse 1", Difficulte.DIFFICILE);
        String[] ligne = {"1","Question 1", "Reponse 1", "3"};
        QuestionDTO expectedQuestion = iServiceQuestion.creerQuestion(ligne);
        Assertions.assertEquals(expectedQuestion, question);
    }
}