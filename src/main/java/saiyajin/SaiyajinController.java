package saiyajin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("saiyajin")
public class SaiyajinController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping
    public String getSaiyajins() {
        return "Saiyajins!";
    }

    @PostMapping("/create")
    public void createSaiyajin() {
        Saiyajin saiyajin = new Saiyajin();
        saiyajin.setName("Goku");
        saiyajin.setAge(48);
        saiyajin.setMaxLeval(6);
        Set<String> skills = new HashSet<String>();
        skills.add("");
        skills.add("");
        skills.add("");

        mongoTemplate.getCollection("saiyajin").insertOne(saiyajin);
    }

}
