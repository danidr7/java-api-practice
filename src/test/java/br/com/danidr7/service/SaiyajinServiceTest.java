package br.com.danidr7.service;

import br.com.danidr7.domain.Saiyajin;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SaiyajinServiceTest {

    @Autowired
    private SaiyajinService saiyajinService;

    @Test
    public void saveSaiyajin(){
        Saiyajin saiyajin = new Saiyajin();
        saiyajin.setName("Goku");
        saiyajin.setAge(38);
        saiyajin.setSkills(new HashSet<String>(){{add("kamehameha");}});
        saiyajin.setMaxLeval(7);

        saiyajinService.createSaiyajin(saiyajin);

        Saiyajin saiyajinB = saiyajinService.getSaiyajin(saiyajin.getName());

        Assert.assertEquals(saiyajin.getName(), saiyajinB.getName());
        Assert.assertEquals(saiyajin.getAge(), saiyajinB.getAge());
        Assert.assertEquals(saiyajin.getSkills(), saiyajinB.getSkills());
        Assert.assertEquals(saiyajin.getMaxLeval(), saiyajinB.getMaxLeval());
    }

}
