package baseball;

import java.util.Arrays;

public class Game {
    static final int NUMBER_LENGTH = 3;
    String STRING_BALL = "볼";
    String STRING_STRIKE = "스트라이크";
    String STRING_NOTHING = "낫싱";
    public Game() {
    }
    public void play() {
        RandomNumber computer = new RandomNumber();
        UserNumber user = new UserNumber();

        // get random number from computer
        computer.getRandomNumber();
        int randomNumber = computer.randomNumber;
        System.out.println(randomNumber);

        while(true) {
            // get user number from user
            user.setUserNumber();
            int userNumber = user.getUserNumber();
            System.out.println(userNumber);

            int strike = 0;
            int ball = 0;

            String[] randomNumberArr = String.valueOf(randomNumber).split("");
            String[] userNumberArr = String.valueOf(userNumber).split("");

            for(int i=0; i<NUMBER_LENGTH; i++) {
                // calculate strike
                if(randomNumberArr[i].equals(userNumberArr[i])) {
                    strike++;
                }
                // calculate ball
                for(int k=0; k<NUMBER_LENGTH; k++){
                    if(randomNumberArr[i].equals(userNumberArr[k]) && i != k) {
                        ball++;
                    }
                }
            }

            // paint result
            String result = "";
            if (ball == 0 && strike == 0) {
                result = STRING_NOTHING;
            }else if (ball == 0 && strike > 0) {
                result = strike + STRING_STRIKE;
            }else if (ball > 0 && strike == 0) {
                result = ball + STRING_BALL;
            }else if (ball > 0 && strike > 0){
                result = ball + STRING_BALL + " " + strike + STRING_STRIKE;
            }
            System.out.println(result);

            if(strike == 3) {
                break;
            }

        }
    }
}


