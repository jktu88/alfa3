package ru.jktu88.alfa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import ru.jktu88.alfa.model.Branche;
import ru.jktu88.alfa.repository.BrancheRepository;

@RestController
@RequestMapping("/")
public class CustomerController {

    private final SimpleError simpleError = new SimpleError();
    private BrancheRepository brancheRepository;

    @Autowired
    public void setBrancheRepository(BrancheRepository brancheRepository) {
        this.brancheRepository = brancheRepository;
    }

    @GetMapping("/branches/{id}")
    public Mono<Branche> findById(@PathVariable Long id) {
        return brancheRepository.findById(id);
    }


    @ExceptionHandler
    public Mono<ResponseEntity<SimpleError>> exceptionHandler(Exception e) {
        return Mono.just(new ResponseEntity<>(simpleError, HttpStatus.NOT_FOUND));
    }
}
