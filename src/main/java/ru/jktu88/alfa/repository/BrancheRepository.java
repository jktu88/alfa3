package ru.jktu88.alfa.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import ru.jktu88.alfa.model.Branche;

public interface BrancheRepository extends ReactiveCrudRepository<Branche, Long> {
}