public class Main {
    public static void main(String[] args) {

        Quiz quiz = new Quiz();

        quiz.addQuestion(new Question(
            "What is Java?",
            new String[]{"Programming Language", "Animal", "Drink", "OS"},
            1
        ));

        quiz.addQuestion(new Question(
            "Which keyword is used for inheritance?",
            new String[]{"this", "super", "extends", "final"},
            3
        ));

        quiz.addQuestion(new Question(
            "Which collection is dynamic?",
            new String[]{"Array", "ArrayList", "Set", "Map"},
            2
        ));

        quiz.startQuiz();
    }
}