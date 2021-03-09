package nl.han.ica.oose.dea.exerciselambda;

import nl.han.ica.oose.dea.exerciselambda.person.Gender;
import nl.han.ica.oose.dea.exerciselambda.person.Person;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ListMaker {


    private Predicate<Person> isAdult = (person) -> {/* Hier volgt de implementatie van de check */}
    /**
     * Create a {@link List} containing only the Persons that are both male and adult.
     *
     * @param allPersons A {@link List} of {@link Person} Objects
     * @return A {@link List} containing only the Persons that are both male and adult
     */
    public List<Person> createMaleAdultList(List<Person> allPersons) {

        if (allPersons == null) {
            return new ArrayList<>();
        }

        List<Person> filteredMaleAdults = new ArrayList<>();

        for (Person person : allPersons) {
            if (person.isGender(Gender.MALE)) {
                LocalDate now = LocalDate.now();
                Period age = Period.between(person.getBirthDate(), now);

                if (person.checkIfEighteen(age)) {
                    filteredMaleAdults.add(person);
                }

            }
        }

        return filteredMaleAdults;
    }




    /**
     * Create a {@link List} containing only the Persons that are both female and adult.
     *
     * @param allPersons A {@link List} of {@link Person} Objects
     * @return A {@link List} containing only the Persons that are both female and adult
     */
    public List<Person> createFemaleAdultList(List<Person> allPersons) {

        if (allPersons == null) {
            return new ArrayList<>();
        }

        List<Person> filteredFemaleAdults = new ArrayList<>();

        for (Person person : allPersons) {
            if (person.isGender(Gender.FEMALE)) {
                LocalDate now = LocalDate.now();
                Period age = Period.between(person.getBirthDate(), now);

                if (person.checkIfEighteen(age)) {
                    filteredFemaleAdults.add(person);
                }
            }
        }


        return filteredFemaleAdults;
    }

}
