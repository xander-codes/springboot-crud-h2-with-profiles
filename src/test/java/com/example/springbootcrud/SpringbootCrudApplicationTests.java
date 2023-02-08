package com.example.springbootcrud;

import com.example.springbootcrud.model.Tutorial;
import com.example.springbootcrud.repository.TutorialRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringbootCrudApplicationTests {

    @Autowired
    private TutorialRepository tutorialRepository;

    @Test
    void testRepo() {
        Tutorial tut = new Tutorial();
        tut.setTitle("jpa");
        tut.setDescription("how to use jpa");

        tutorialRepository.save(tut);

        Tutorial fromDb = tutorialRepository.findById(tut.getId()).get();
        System.out.println(tut);
        System.out.println(fromDb);

        assertEquals(tut.getId(), fromDb.getId());
        assertEquals(tut.getTitle(), fromDb.getTitle());
        assertEquals(tut.getDescription(), fromDb.getDescription());
    }
}
