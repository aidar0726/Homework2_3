package passport;

import product.Recipe;
import product.RecipeMethodException;

import java.util.Set;

public class PassportMethod {

    public static void addPassport(Passport passport, Set<Passport> passports) {

            for (Passport passportOne : passports) {
                if (passportOne.getNumber().equals(passport.getNumber())) {
                    passportOne.setFatherland(passport.getFatherland());
                    passportOne.setSurname(passport.getSurname());
                    passportOne.setDateBirth(passport.getDateBirth());
                    System.out.println("Паспорт с номером " + passport.getNumber() + " Успешно обновлен!");
                } else {
                    passports.add(passport);
                    System.out.println("Паспорт с номером " + passport.getNumber() + " Успешно добавлен!");
                }
            }
    }


    public static Passport returnsPassport(Integer number,Set<Passport> passports) {
        for (Passport passportOne : passports) {
            if (passportOne.getNumber().equals(number)) {
                return passportOne;
            }
        }

        return null;
    }
}
