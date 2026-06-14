package com.library.school;

import com.library.school.config.DistrictPolicy;
import com.library.school.decorator.BaseFineCalculator;
import com.library.school.decorator.FineCalculator;
import com.library.school.decorator.SiblingDiscountDecorator;
import com.library.school.factory.*;
import com.library.school.model.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SchoolLibraryTest {


    @Test
    void testSingleton() {

        DistrictPolicy d1 = DistrictPolicy.getInstance();
        DistrictPolicy d2 = DistrictPolicy.getInstance();

        assertSame(d1, d2);
        assertEquals("Valley School District", d1.getDistrictName());
    }

    @Test
    void testSimpleFactory() {

        SchoolResource resource =
                ToyBookFactory.createResource("comic", "Spider Man");

        assertTrue(resource instanceof ComicBook);

        assertEquals("Spider Man", resource.getTitle());

        assertThrows(
                IllegalArgumentException.class,
                () -> ToyBookFactory.createResource("abc", "Test")
        );
    }

    @Test
    void testFactoryMethod() {

        RoleCreator teacher = new TeacherCreator();
        RoleCreator student = new ElementaryCreator();

        assertEquals(25,
                teacher.createMember().getLimit());

        assertEquals(2,
                student.createMember().getLimit());
    }

    @Test
    void testAbstractFactory() {

        GradeCurriculumFactory factory =
                new KindergartenKitFactory();

        assertEquals(
                "AlphabetBook",
                factory.createBook());

        assertEquals(
                "PhonicsApp",
                factory.createDigitalTool());
    }

    @Test
    void testBuilder() {

        ReadingChallenge challenge =
                new ReadingChallenge.Builder()
                        .setChallengeName("Summer Reading")
                        .setTargetBookCount(10)
                        .setRewardBadge("Gold Star")
                        .build();

        assertEquals(
                "Summer Reading",
                challenge.getChallengeName());

        assertEquals(
                10,
                challenge.getTargetBookCount());

        assertEquals(
                "Gold Star",
                challenge.getRewardBadge());
    }

    @Test
    void testDecorator() {

        FineCalculator calculator =
                new SiblingDiscountDecorator(
                        new BaseFineCalculator());

        assertEquals(
                1.0,
                calculator.calculateFine(4));
    }
}