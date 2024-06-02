package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.impl.question;

public class IServiceQuestionMockWrongTypeArgument implements IQuestion {


    @Override
    public QuestionDTO creerQuestion(String[] ligne) throws MissingArgumentException, WrongArgumentTypeException {
        throw new WrongArgumentTypeException();
    }
}