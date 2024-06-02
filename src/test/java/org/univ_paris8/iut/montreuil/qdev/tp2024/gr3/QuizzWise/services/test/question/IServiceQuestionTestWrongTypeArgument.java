package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.test.question;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.impl.question.IServiceQuestionMockWrongTypeArgument;

public class IServiceQuestionTestWrongTypeArgument {
    private IServiceQuestion iQuestion = new IServiceQuestionMockWrongTypeArgument();

    @Test
    public void testCreerQuestionWrongArgumentTypeException() throws MissingArgumentException, WrongArgumentTypeException {
        String[] ligne = {"1", "FR", "Question 1", "Reponse 1", "ten"};
        Assertions.assertThrows(WrongArgumentTypeException.class, () -> {
            iServiceQuestion.creerQuestion(ligne);
        });

    }
}