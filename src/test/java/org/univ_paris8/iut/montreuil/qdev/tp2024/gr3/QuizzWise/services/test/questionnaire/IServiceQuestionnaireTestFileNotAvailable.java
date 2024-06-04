package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.test.questionnaire;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.impl.questionnaire.IServiceQuestionnaireImplMockTestFileNotAvailable;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.interfaces.IServiceQuestionnaire;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utils.exceptions.exceptions.CannotReadFileException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utils.exceptions.exceptions.EmptyFileException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utils.exceptions.exceptions.FileNotAvailableException;

public class IServiceQuestionnaireTestFileNotAvailable {

    private IServiceQuestionnaire iServiceQuestionnaire = new IServiceQuestionnaireImplMockTestFileNotAvailable();

    @Test
    public void testChargerQuestionnaireFileNotAvailable() throws FileNotAvailableException, EmptyFileException, CannotReadFileException {

        Assertions.assertThrows(FileNotAvailableException.class, () -> {
            iServiceQuestionnaire.getListQuestionnaires("src/test/resources/QuestionnaireOk");
        });

    }
}
