package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.impl.question;

public class IServiceQuestionMockOk implements IQuestion {
    @Override
    public QuestionDTO creerQuestion(String[] ligne) throws MissingArgumentException, WrongArgumentTypeException {
        QuestionDTO expectedQuestionDTO = new QuestionDTO(1,"Question test", "Reponse test", Difficulte.DIFFICILE);
        return expectedQuestionDTO;
    }
}