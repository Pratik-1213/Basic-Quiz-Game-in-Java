package Java_Microproject;

import java.util.Scanner;
import java.util.Random;

public class Quiz_GK {
    public static final String[][] questionsAndAnswers = {
            { "1. What is the capital of France?", "Paris", "London", "Berlin", "Madrid" },
            { "2. Which planet is known as the Red Planet?", "Mars", "Venus", "Jupiter", "Mercury" },
            { "3. What is the chemical symbol for water?", "H2O", "CO2", "NaCl", "O2" },
            { "4. What is the largest mammal in the world?", "Blue Whale", "African Elephant", "Giraffe",
                    "Hippopotamus" },
            { "5. Which is the longest river in the world?", "Nile", "Ganga", "Amazon", "Niger" },
            { "6. Which is the 29th state of India?", "Telangana", "Uttarakhand", "Uttar Pradesh", "Madhya Pradesh" },
            { "7. Who is the first prime minister of India?", "Jawaharlal Nehru", "Narendra Modi", "Motilal Nehru",
                    "Indra Gandhi" },
            { "8. General Election in India hold after how many years?", "5", "10", "4", "6" },
            { "9. Which is smallest continent in the world?", "Australia", "Asia", "Arctic", "Africa" },
            { "10. Which of the Following river is not included in Panchaganga River", "Krishna", "Kasari", "Bhogavati",
                    "Tulsi" }
    };

    public static void shuffleArray(String[] array) {
        int index;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            if (index != i) {

                // Swap the elements3

                String temp = array[index];
                array[index] = array[i];
                array[i] = temp;
            }
        }
    }

    public static void main(String string) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Quiz Game!");

        try {
            for (String[] questionAndOptions : questionsAndAnswers) {
                String question = questionAndOptions[0];
                String[] options = { questionAndOptions[1], questionAndOptions[2], questionAndOptions[3],
                        questionAndOptions[4] };
                String correctAnswer = questionAndOptions[1];

                // Shuffle the options
                shuffleArray(options);

                System.out.println(question);
                for (int i = 0; i < options.length; i++) {
                    System.out.println((i + 1) + ". " + options[i]);
                }
                System.out.print("Your answer: ");
                int userChoice = scanner.nextInt();

                if (options[userChoice - 1].equalsIgnoreCase(correctAnswer)) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Incorrect. The correct answer is: " + correctAnswer);
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close(); // Close the scanner to prevent resource leak
        }

        System.out.println("Quiz complete!");
        System.out.println("Your final score is: " + score + " out of " + questionsAndAnswers.length);
    }
}
