package cy.olesiabokk.animalfactoryapp.entity.util;

import java.util.Random;

public class Randomizer {
    private final Random random = new Random();

    public ColorEnum getRandomNumColor() {
        int randomNum = (int) (Math.random() * 100);
        if (randomNum > 0 & randomNum <= 32) {
            return ColorEnum.WHITE;
        } else if (randomNum >= 33 & randomNum <= 62) {
            return ColorEnum.BLACK;
        } else if (randomNum >= 63 & randomNum <= 82) {
            return ColorEnum.GINGER;
        } else {
            return ColorEnum.SMOKY;
        }
    }

    public int getRandomCatAge() {
        int randomNum = random.nextInt(26);
        if (randomNum == 0) {
            randomNum = 1;
        }
        return randomNum;
    }

    public int getRandomCatWeight() {
        int randomNum = random.nextInt(15);
        if (randomNum == 0) {
            randomNum = 1;
        }
        return randomNum;
    }

    public NameEnum getRandomCatName() {
        int num = random.nextInt(10);
        if (num == 0) {
            return NameEnum.BARSIK;
        } else if (num == 1) {
            return NameEnum.BORIS;
        } else if (num == 2) {
            return NameEnum.BUSINKA;
        } else if (num == 3) {
            return NameEnum.KNOPKA;
        } else if (num == 4) {
            return NameEnum.PUSHA;
        } else if (num == 5) {
            return NameEnum.KUZIA;
        } else if (num == 6) {
            return NameEnum.LADY;
        } else if (num == 7) {
            return NameEnum.MUSHKA;
        } else if (num == 8) {
            return NameEnum.TISHA;
        } else {
            return NameEnum.TOM;
        }
    }
}