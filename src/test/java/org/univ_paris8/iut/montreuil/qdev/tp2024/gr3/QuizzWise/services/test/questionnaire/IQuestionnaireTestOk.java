package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.test.questionnaire;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class IQuestionnaireTestOk {

    private IServiceQuestionnaire iServiceQuestionnaire  =  new ServicesQestionnaire();

    @Test
    public void testChargerQuestionnaireOk() throws FileNotAvailableException, EmptyFileException, CannotReadFileException {
        QuestionDTO question1 = new QuestionDTO(1, "Question 1", "Reponse 1", Difficulte.DIFFICILE);
        QuestionDTO question2 = new QuestionDTO(2,"Question 1", "Reponse test", Difficulte.INTERMEDIARE);
        QuestionDTO question3 = new QuestionDTO(3,"Question 3", "Reponse 3", Difficulte.DIFFICILE);

        ArrayList<QuestionDTO> listeQuestions = new ArrayList<>();
        listeQuestions.add(question1);
        listeQuestions.add(question2);
        listeQuestions.add(question3);

        QuestionnairesDTO expectedQuestionnaireDTO = new QuestionnairesDTO(listeQuestions);
        Assertions.assertEquals(question1, iQuestServiceImpl.getListQuestionnaires("src/test/resources/QuestionnaireOK").getListeQuestions().get(0));
    }
}
