package ferreira.marcos.movies.control;

import ferreira.marcos.movies.model.Attributes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Objects {
    @GetMapping("/Vingadores")

    public ArrayList<Attributes> getAvengers(){
        Attributes a = new Attributes();
        a.setName("Avengers");
        Attributes a1 = new Attributes();
        a1.setDirector("Joss Whedon");
        Attributes a2 = new Attributes();
        a2.setGenre("Ação");
        Attributes a3 = new Attributes();
        a3.setYear("2012");


        ArrayList<Attributes> attributes = new ArrayList<>();
        attributes.add(a);
        attributes.add(a1);
        attributes.add(a2);
        attributes.add(a3);
        return attributes;


    }

    @GetMapping("/devoltaaojogo")

    public ArrayList<Attributes> getWick() {
        Attributes a = new Attributes();
        a.setName("John Wick");
        Attributes a1 = new Attributes();
        a1.setDirector("Chad Stahelski");
        Attributes a2 = new Attributes();
        a2.setGenre("Ação");
        Attributes a3 = new Attributes();
        a3.setYear("2014");


        ArrayList<Attributes> attributes = new ArrayList<>();
        attributes.add(a);
        attributes.add(a1);
        attributes.add(a2);
        attributes.add(a3);
        return attributes;


    }

    @GetMapping("/olivrodehenry")

    public ArrayList<Attributes> getHenry() {
        Attributes a = new Attributes();
        a.setName("The Book of Henry");
        Attributes a1 = new Attributes();
        a1.setDirector("Colin Trevorrow");
        Attributes a2 = new Attributes();
        a2.setGenre("drama/aventura");
        Attributes a3 = new Attributes();
        a3.setYear("2017");


        ArrayList<Attributes> attributes = new ArrayList<>();
        attributes.add(a);
        attributes.add(a1);
        attributes.add(a2);
        attributes.add(a3);
        return attributes;
    }

    @GetMapping("/oresgate")

    public ArrayList<Attributes> getHExtraction() {
        Attributes a = new Attributes();
        a.setName("The Extraction");
        Attributes a1 = new Attributes();
        a1.setDirector("Sam Hargrave");
        Attributes a2 = new Attributes();
        a2.setGenre("Ação/Aventura");
        Attributes a3 = new Attributes();
        a3.setYear("2020");


        ArrayList<Attributes> attributes = new ArrayList<>();
        attributes.add(a);
        attributes.add(a1);
        attributes.add(a2);
        attributes.add(a3);
        return attributes;
    }

}
