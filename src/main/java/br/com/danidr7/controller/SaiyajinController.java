package br.com.danidr7.controller;

import br.com.danidr7.domain.Saiyajin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("saiyajin")
public class SaiyajinController {

    private static final Logger logger = LoggerFactory.getLogger(SaiyajinController.class);

    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping
    public String getSaiyajins() {
        return "Saiyajins!";
    }

    @PostMapping("/create")
    public void createSaiyajin(@RequestBody @Valid Saiyajin saiyajin) {
        logger.info("saving new saiyajin");

        mongoTemplate.save(saiyajin, "saiyajin");
    }

}
