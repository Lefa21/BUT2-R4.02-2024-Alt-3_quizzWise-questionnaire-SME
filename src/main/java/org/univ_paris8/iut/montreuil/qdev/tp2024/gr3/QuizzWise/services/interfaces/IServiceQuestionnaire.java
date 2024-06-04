package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.entities.dto.QuestionnairesDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utils.exceptions.exceptions.CannotReadFileException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utils.exceptions.exceptions.EmptyFileException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utils.exceptions.exceptions.FileNotAvailableException;

import java.util.ArrayList;
import java.util.List;

public interface IServiceQuestionnaire {
    public  QuestionnairesDTO getListQuestionnaires(String sourceFichierCsv) throws FileNotAvailableException, EmptyFileException, CannotReadFileException;
}
