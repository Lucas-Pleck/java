package exo14.dingBottle;

public class DingBottle {
        public static void main(String... args) {
            for (int i = 0; i < 100; i++) {
                boolean isDisplay = false;
                if (isMessage(i, 5)) {
                    isDisplay = true;
                    System.out.print("Ding ding");
                }
                if (isMessage(i, 7)) {
                    isDisplay = true;
                    System.out.print("Bottle");
                }
                if (!isDisplay) {
                    System.out.print(i);
                }
                System.out.println("");
            }
        }

        private static boolean isMessage(int i, int expected) {
            return sumOfNumbersEquals(i, expected)|| isMultiple(i, expected) || endWith(i, Integer.toString(expected));
        }

        private static boolean sumOfNumbersEquals(int nbr, int expected) {
            int sumNum = 0;
            String numString = Integer.toString(nbr);
            for (int i=0;i<numString.length();i++) {
                sumNum+= Character.getNumericValue(numString.toCharArray()[i]);
            }
            return sumNum == expected;
        }

        private static boolean isMultiple(int nbr, int multiple) {
            return nbr % multiple == 0;
        }

        private static boolean endWith(int nbr, String end) {
            return Integer.toString(nbr).endsWith(end);
        }
    }
