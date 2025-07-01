package Java_Microproject;

import java.util.Scanner;
import java.util.Random;

public class Quiz_Comp {
    private static final String[][] questionsAndAnswers = {
            { "1. Who is the father of Computers?", "Charles Babbage", "James Gosling", "Dennis Ritchie",
                    "Bjarne Stroustrup" },
            { "2. Which of the following is the correct abbreviation of COMPUTER?",
                    "Commonly Operated Machines Used in Technical and Educational Research",
                    "Commonly Occupied Machines Used in Technical and Educational Research",
                    "Commonly Operated Machines Used in Technical and Environmental Research",
                    "Commonly Oriented Machines Used in Technical and Educational Research" },
            { "3. What is the full form of CPU?", "Control Processing Unit", "Computer Processing Unit",
                    "Computer Principle Unit",
                    "Central Processing Unit" },
            { "4. Which of the following language does the computer understand?",
                    "Computer understands only Binary Language", "Computer understands only C Language",
                    "Computer understands only Assembly Language", "Computer understands only BASIC" },
            { "5. Which of the following is the smallest unit of data in a computer?", "Bit", "KB", "Nibble", "Byte" },
            { "6. Which data structure follows the Last In First Out (LIFO) principle?", "Stack", "Linked List", "Tree",
                    "Queue" },
            { "7. Which of the following is not a primary color in the RGB color model used in digital devices?", "Yellow",
                    "Blue", "Green", "Red" },
            { "8. Which programming language is commonly used for building web applications?",
                    "JavaScript", "Java", "Python", "C++" },
            { "9. Which of the following is an example of a high-level programming language?", "C Language",
                    "Machine Language", "Binary Language", "Assembly Language" },
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

    public static void main() {
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
