package yait.web.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.Duration;
import java.util.List;

@Valid
@Data
@Builder
@JsonDeserialize(builder = Interval.IntervalBuilder.class)
public class Interval {
    @NotBlank
    String title;

    @NotNull
    List<Interval> subIntervals;

    @NotNull
    Duration duration;

    @JsonPOJOBuilder(withPrefix = "")
    public static class IntervalBuilder {

    }
}
