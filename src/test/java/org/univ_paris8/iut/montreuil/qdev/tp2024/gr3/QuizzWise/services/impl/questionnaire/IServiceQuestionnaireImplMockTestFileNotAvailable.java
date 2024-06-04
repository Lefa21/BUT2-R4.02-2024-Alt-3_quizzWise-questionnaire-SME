package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.impl.questionnaire;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.entities.dto.QuestionnairesDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.interfaces.IServiceQuestionnaire;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utils.exceptions.exceptions.CannotReadFileException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utils.exceptions.exceptions.EmptyFileException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utils.exceptions.exceptions.FileNotAvailableException;

public class IServiceQuestionnaireImplMockTestFileNotAvailable implements IServiceQuestionnaire {
    @Override
    public QuestionnairesDTO getListQuestionnaires(String sourceFichierCsv) throws FileNotAvailableException, EmptyFileException, CannotReadFileException {
        throw new FileNotAvailableException();
    }
}