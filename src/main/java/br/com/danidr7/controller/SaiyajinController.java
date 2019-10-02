package br.com.danidr7.controller;

import br.com.danidr7.domain.Saiyajin;
import br.com.danidr7.service.SaiyajinService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
@RequestMapping("saiyajin")
public class SaiyajinController {

    private static final Logger logger = LoggerFactory.getLogger(SaiyajinController.class);

    @Autowired
    private SaiyajinService saiyajinService;

    @PostMapping
    public void createSaiyajin(@RequestBody @Valid Saiyajin saiyajin) {
        logger.info("saving new saiyajin");

        try {
            saiyajinService.createSaiyajin(saiyajin);
        } catch (DuplicateKeyException e) {
            logger.error(e.getLocalizedMessage());
            throw new ResponseStatusException(HttpStatus.CONFLICT, e.getLocalizedMessage());
        } catch (Exception e) {
            logger.error("fails attempting create a saiyajin", e);
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
        }

    }

    @GetMapping
    public Saiyajin getSaiyajins(@RequestParam String name) {
        logger.info("Find for {} saiyajin", name);

        Saiyajin saiyajin;
        try {
            saiyajin = saiyajinService.getSaiyajin(name);
        } catch (Exception e) {
            logger.error("fails attempting get a saiyajin", e);
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
        }

        return saiyajin;
    }

}
