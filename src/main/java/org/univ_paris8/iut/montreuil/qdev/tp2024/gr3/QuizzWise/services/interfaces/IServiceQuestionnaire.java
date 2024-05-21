package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.entities.dto.QuestionnairesDTO;

import java.util.ArrayList;
import java.util.List;

public interface IServiceQuestionnaire {
    public ArrayList<QuestionnairesDTO> getListQuestionnaires(String sourceFichierCsv);
}
