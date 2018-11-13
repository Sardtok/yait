package yait.web.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Collections;
import java.util.List;

@Data
@AllArgsConstructor
public class Interval {
    @NotBlank
    String title;
    @NotNull
    List<Interval> subIntervals;

    @JsonCreator
    public Interval(@JsonProperty("title") String title) {
        this(title, Collections.emptyList());
    }
}
