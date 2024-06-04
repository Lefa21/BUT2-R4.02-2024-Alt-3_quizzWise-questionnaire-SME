package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.test.question;

import org.junit.jupiter.api.Assertions;

public class IServiceQuestionTestOk {
    private IServiceQuestion iServiceQuestion = new IServiceQuestionMockOk();

    @Test
    public void testCreerQuestionOk() throws MissingArgumentException, WrongArgumentTypeException {
        QuestionDTO  question = new QuestionDTO(1, "Question 1", "Reponse 1", Difficulte.DIFFICILE);
        String[] ligne = {"1","Question test", "Reponse test", "5"};
        QuestionDTO expectedQuestion = iServiceQuestion.creerQuestion(ligne);
        Assertions.assertEquals(expectedQuestion, question);
    }
}