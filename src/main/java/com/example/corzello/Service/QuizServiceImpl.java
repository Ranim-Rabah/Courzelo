package com.example.corzello.Service;

import com.example.corzello.Entity.ModuleEntity;
import com.example.corzello.Entity.Prog_educatif;
import com.example.corzello.Entity.Quiz;
import com.example.corzello.Repository.ModuleRepository;
import com.example.corzello.Repository.ProgramRepository;
import com.example.corzello.Repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class QuizServiceImpl implements QuizService {

    public QuizServiceImpl(ModuleRepository moduleRepository, QuizRepository quizRepository) {
        this.moduleRepository = moduleRepository;
        this.quizRepository = quizRepository;
    }


    @Autowired
    private ModuleRepository moduleRepository;
    private QuizRepository quizRepository;

    @Override
    public Optional<Quiz> getQuizById(Long idQuiz) {
        return quizRepository.findById(idQuiz);
    }

    @Override
    public Quiz AjouterQuiz(Long idModule, Quiz quiz) {
        ModuleEntity Module=this.moduleRepository.findById(idModule).orElse(null);
        if(Module != null){
            quiz.setModuleEntity(Module);
        }
        return this.quizRepository.save(quiz);
    }

    @Override
    public void deleteQuiz(Long idQuiz) {
        quizRepository.deleteById(idQuiz);
    }

    @Override
    public List<Quiz> getAllQuiz() {
        return (List<Quiz>) quizRepository.findAll();
    }

    @Override
    public List<Quiz> getQuizByModule(Long idModule) {
        // Récupérer le programme éducatif depuis la base de données
        ModuleEntity module = moduleRepository.findById(idModule)
                .orElseThrow(() -> new RuntimeException("Module  non trouvé"));

        return module.getQuizzes().stream().collect(Collectors.toList());
    }
}
