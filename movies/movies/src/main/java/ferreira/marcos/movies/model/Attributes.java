package ferreira.marcos.movies.model;

import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Attributes {
    @Getter
    @Setter
    private String name;
    @Getter @Setter
    private String year;
    @Getter @Setter
    private String genre;
    @Getter @Setter
    private String director;

}
