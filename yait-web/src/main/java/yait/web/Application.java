package yait.web;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.runtime.Micronaut;
import yait.web.model.Interval;

import javax.inject.Inject;

@Controller("/")
public class Application {

    @Inject
    IntervalRepository intervalRepository;

    @Get(produces = MediaType.TEXT_PLAIN)
    public String hello() {
        intervalRepository.create(new Interval("TEST"));
        return "Hello, World!";
    }

    public static void main(String[] args) {
        Micronaut.run(Application.class);
    }
}