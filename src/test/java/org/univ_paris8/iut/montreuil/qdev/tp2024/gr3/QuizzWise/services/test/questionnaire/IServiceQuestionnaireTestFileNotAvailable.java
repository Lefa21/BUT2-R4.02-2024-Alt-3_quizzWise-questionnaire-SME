package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.test.questionnaire;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IServiceQuestionnaireTestFileNotAvailable {

    private IServiceQuestionnaire iServiceQuestionnaire = new IQuestionnaireImplMockTestFileNotAvailable();

    @Test
    public void testChargerQuestionnaireFileNotAvailable() throws FileNotAvailableException, EmptyFileException, CannotReadFileException {

        Assertions.assertThrows(FileNotAvailableException.class, () -> {
            iServiceQuestionnaire.getListQuestionnaires("src/tst/resources/QuestionnaireOK");
        });

    }
}
