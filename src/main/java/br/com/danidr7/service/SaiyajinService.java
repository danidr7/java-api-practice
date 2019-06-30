package br.com.danidr7.service;

import br.com.danidr7.domain.Saiyajin;
import br.com.danidr7.repository.SaiyajinRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaiyajinService {

    private static final Logger logger = LoggerFactory.getLogger(SaiyajinService.class);

    @Autowired
    private SaiyajinRepository saiyajinRepository;

    public Saiyajin createSaiyajin(Saiyajin saiyajin) {
        return saiyajinRepository.save(saiyajin);
    }

    public Saiyajin getSaiyajin(String name) {
        try {
            return saiyajinRepository.findByName(name);
        }
        catch (Exception e) {
            logger.error("fails attempting get a saiyajin", e);
        }

        return null;
    }
}
