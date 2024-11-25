package patterns.builder;

import lombok.Data;
import patterns.builder.enums.Foundation;
import patterns.builder.enums.Roof;
import patterns.builder.enums.Walls;

@Data
public class House {
    private Foundation foundation;
    private Walls walls;
    private Roof roof;
}
