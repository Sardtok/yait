package yait.web;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import yait.web.model.Interval;

import javax.inject.Inject;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Map;
import java.util.Optional;

@Controller("/intervals")
public class IntervalController {

    @Inject
    IntervalRepository repository;

    @Get("/")
    public Map<Integer, Interval> index() {
        return repository.read();
    }

    @Get("/{id}")
    public Optional<Interval> getInterval(@Min(1) Integer id) {
        return repository.read(id);
    }

    @Post("/")
    public int addInterval(@NotNull Interval interval) {
        return repository.create(interval);
    }
}