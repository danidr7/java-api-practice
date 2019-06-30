package br.com.danidr7.controller;

import br.com.danidr7.domain.Saiyajin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@RestController
@RequestMapping("saiyajin")
public class SaiyajinController {

    private static final Logger logger = LoggerFactory.getLogger(SaiyajinController.class);

    @Autowired
    private MongoTemplate mongoTemplate;

    @PostMapping
    public void createSaiyajin(@RequestBody @Valid Saiyajin saiyajin) {
        logger.info("saving new saiyajin");

        mongoTemplate.save(saiyajin, "saiyajin");
    }

    @GetMapping
    public Saiyajin getSaiyajins(@RequestParam Map<String, String> params) {
        logger.info("saving new saiyajin");
        Query query = new Query();
        query.addCriteria(Criteria.where("name").is("Eric"));
        Saiyajin saiyajin = (Saiyajin) mongoTemplate.find(query, Saiyajin.class);

        return saiyajin;
    }

}
