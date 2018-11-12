package yait.web;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.runtime.Micronaut;

@Controller("/")
public class Application {

    @Get
    public String hello() {
        return "Hello, World!";
    }

    public static void main(String[] args) {
        Micronaut.run(Application.class);
    }
}