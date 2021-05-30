package com.example.firebasetest.View;

public class QuestionLibraryM {
    private String mQuestion [] = {
            "Correct result is: 13*3+20 = ?",
            "Correct result is: 5*7-17 = ?",
            "Correct result is: 7+7*7 = ?",
            "Correct result is: 10+6*12 = ?",
            "Correct result is: 49-27/3 = ?",
            "Correct result is: 6-16/4 = ?",
            "Correct result is: 45/9+5*3 = ?",
            "Correct result is: 42/3-2*5 = ?",
            "Correct result is: 6*5+28/4 = ?",
            "Correct result is: 16*6-0/17 = ?"
    };
    private String mChoices [] [] = {
            {"59","60","61"},
            {"17","18","19"},
            {"54","55","56"},
            {"82","83","84"},
            {"39","40","41"},
            {"0","1","2"},
            {"20","21","22"},
            {"3","4","5"},
            {"35","36","37"},
            {"96","97","98"}
    };
    private String mCorrectAnswers [] = {"59","18","56","82","40","2","20","4","37","96"};

    public String getQuestion(int a){
        String question = mQuestion[a];
        return question;
    };
    public String getChoice1(int a){
        String choice0 = mChoices[a][0];
        return choice0;
    };
    public String getChoice2(int a){
        String choice1 = mChoices[a][1];
        return choice1;
    };
    public String getChoice3(int a){
        String choice2 = mChoices[a][2];
        return choice2;
    };
    public String getChoice4(int a){
        String choice3 = mChoices[a][0];
        return choice3;
    };
    public String getChoice5(int a){
        String choice4 = mChoices[a][1];
        return choice4;
    };
    public String getChoice6(int a){
        String choice5 = mChoices[a][2];
        return choice5;
    };
    public String getChoice7(int a){
        String choice6 = mChoices[a][0];
        return choice6;
    };
    public String getChoice8(int a){
        String choice7 = mChoices[a][1];
        return choice7;
    };
    public String getChoice9(int a){
        String choice8 = mChoices[a][2];
        return choice8;
    };

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
