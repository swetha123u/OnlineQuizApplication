import java.util.*;

class Quiz {
    List<Question> questions = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int score = 0;

    void addQuestion(Question q) {
        questions.add(q);
    }

    void startQuiz() {
        for (Question q : questions) {
            q.displayQuestion();
            System.out.print("Enter your answer (1-4): ");

            try {
                int userAnswer = sc.nextInt();

                if (q.checkAnswer(userAnswer)) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Wrong!");
                }

            } catch (Exception e) {
                System.out.println("Invalid input! Skipping question.");
                sc.next(); // clear buffer
            }
        }

        System.out.println("\nFinal Score: " + score + "/" + questions.size());
    }
}