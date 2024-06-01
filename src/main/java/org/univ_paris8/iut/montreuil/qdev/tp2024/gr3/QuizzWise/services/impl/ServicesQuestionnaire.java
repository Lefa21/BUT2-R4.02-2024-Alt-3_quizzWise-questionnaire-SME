package org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.impl;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.entities.dto.QuestionDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.entities.dto.QuestionnairesDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.services.interfaces.IServiceQuestionnaire;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr3.QuizzWise.utils.exceptions.exceptions.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ServicesQuestionnaire implements IServiceQuestionnaire {

    @Override
    public QuestionnairesDTO getListQuestionnaires(String url) throws FileNotAvailableException, EmptyFileException, CannotReadFileException {
        String line = "";
        String cvsSplitBy = ";";
        ArrayList<QuestionDTO> questions = new ArrayList<>();
        ServiceQuestion questionService = new ServiceQuestion();
        try (BufferedReader br = new BufferedReader(new FileReader(url))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(cvsSplitBy);
                QuestionDTO question = questionService.creerQuestion(data);
                questions.add(question);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (MissingArgumentException | WrongArgumentTypeException e) {
            throw new RuntimeException(e);
        }

        return new QuestionnairesDTO(questions);
    }

}
