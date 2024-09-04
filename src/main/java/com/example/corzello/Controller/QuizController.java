package com.example.corzello.Controller;

import com.example.corzello.Entity.ModuleEntity;
import com.example.corzello.Entity.Quiz;
import com.example.corzello.Security.ModuleServcie;
import com.example.corzello.Service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Quiz")
@RequiredArgsConstructor
public class QuizController {
    @Autowired
    private QuizService quizService;

    @GetMapping("getAll")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Quiz> getAllQuiz() {
        return quizService.getAllQuiz();
    }


    @PostMapping("/add/{idModule}")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Quiz> addQuiz(@PathVariable Long idModule, @RequestBody Quiz quiz) {
        Quiz savedQuiz = quizService.AjouterQuiz(idModule, quiz);
        return new ResponseEntity<>(savedQuiz, HttpStatus.CREATED);
    }

    @DeleteMapping("/{idQuiz}")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Void> deleteQuiz(@PathVariable Long idQuiz) {
        quizService.deleteQuiz(idQuiz);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/ModuleQuiz/{idModule}")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Quiz> getModulesForProgEduc(@PathVariable Long idModule) {
        return quizService.getQuizByModule(idModule);
    }


}
