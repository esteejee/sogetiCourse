public class Assignment10 {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 25, 67, 89, 23, 90, 91};

        for (int number: numbers) {

            String str = (number % 2 == 0)? " is an even number." : " is an odd number";
            System.out.println (number + str);
            }
        }
    }

/*
Onder de antwoorden op de gestelde vragen:
5. for-each loop gebruikt omdat het een array van nummers is;
6. conditional statement "if(number % 2 == 0)" ==> delen door 2 en geen restgetal;
7. operator %
 */