public class Grade {
    public char deterineLetterGrade(int numberGrade){
        if(numberGrade<0){
            throw new IllegalArgumentException("Number grade cannot be 0");
        } else if (numberGrade<60) {
            return 'F';
        } else if (numberGrade<70) {
            return  'D';

        } else if (numberGrade<80) {
            return 'C';
        }else if (numberGrade<90) {
            return 'B';
        }else {
            return 'A';
        }
    }
}
