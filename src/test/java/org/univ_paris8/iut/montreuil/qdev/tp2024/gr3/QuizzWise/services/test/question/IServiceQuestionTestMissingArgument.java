package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.test.question;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.impl.question.IServiceQuestionMockMissingArgument;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.interfaces.IServiceQuestion;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utils.exceptions.exceptions.MissingArgumentException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utils.exceptions.exceptions.WrongArgumentTypeException;

public class IServiceQuestionTestMissingArgument {
    private IServiceQuestion iServiceQuestion = new IServiceQuestionMockMissingArgument();

    @Test
    public void testCreerQuestionMissingArgumentException() throws MissingArgumentException, WrongArgumentTypeException {
        String[] ligne = {"1", "Question 1", "Reponse 1"};
        Assertions.assertThrows(MissingArgumentException.class, () -> {
            iServiceQuestion.creerQuestion(ligne);
        });
    }
}
