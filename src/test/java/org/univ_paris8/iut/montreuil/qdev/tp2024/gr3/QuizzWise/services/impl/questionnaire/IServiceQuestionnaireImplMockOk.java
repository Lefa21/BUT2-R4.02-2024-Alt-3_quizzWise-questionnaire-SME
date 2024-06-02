package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.impl.questionnaire;

import java.util.ArrayList;

public class IServiceQuestionnaireImplMockOk implements IServiceQuestionnaire {
    @Override
    public QuestionnairesDTO getListQuestionnaires(String sourceFichierCsv) throws FileNotAvailableException, EmptyFileException, CannotReadFileException {

        QuestionDTO questionDTO1 = new QuestionDTO(1,"Question 1", "Reponse 1", Difficulte.DIFFICILE);
        QuestionDTO questionDTO2 = new QuestionDTO(2, "Question 2", "Reponse 2", Difficulte.FACILE);
        QuestionDTO questionDTO3 = new QuestionDTO(3,"Question 3", "Reponse 3", Difficulte.INTERMEDIAIRE);

        ArrayList<QuestionDTO> listeQuestions = new ArrayList<>();
        listeQuestions.add(questionDTO1);
        listeQuestions.add(questionDTO2);
        listeQuestions.add(questionDTO3);

        QuestionnairesDTO expectedQuestionnaireDTO = new QuestionnairesDTO(listeQuestions);
        return expectedQuestionnairesDTO;
    }
}