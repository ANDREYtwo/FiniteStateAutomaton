import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        char state='1';
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку из 0 и 1:");
        String InputDate= sc.nextLine();
        char [] ArrayInputDate=getString(InputDate);
        for(int nextSymbol=0;nextSymbol<ArrayInputDate.length;nextSymbol++){
            state=transitionRules(state,ArrayInputDate[nextSymbol]);
        }
        entyInAlphabet(state);
    }

    private static char[] getString(String input_date){
        char[] chWord = input_date.toCharArray();
        return chWord;
    }

    private static char transitionRules(char transitionRulesForState,char symbolWord){
        char state_1='1';//четное число 1 и 0
        char state_2='2';//четное число 1 и не четное 0
        char state_3='3';//не четное число 1 и не четное 0
        char state_4='4';//четное число 1 и  четное 0 заключительное
        if(transitionRulesForState==state_1&&symbolWord=='1') {
            transitionRulesForState = '4';
        }else if(transitionRulesForState==state_1&&symbolWord=='0') {
            transitionRulesForState = '2';
        }else if(transitionRulesForState==state_2&&symbolWord=='1') {
            transitionRulesForState = '3';
        }else if(transitionRulesForState==state_2&&symbolWord=='0') {
            transitionRulesForState = '1';
        }else if(transitionRulesForState==state_3&&symbolWord=='1') {
            transitionRulesForState = '2';
        }else if(transitionRulesForState==state_3&&symbolWord=='0') {
            transitionRulesForState = '4';
        }else if(transitionRulesForState==state_4&&symbolWord=='1') {
            transitionRulesForState = '1';
        }else if(transitionRulesForState==state_4&&symbolWord=='0') {
            transitionRulesForState = '3';
        }
        return transitionRulesForState;
    }

    private static void entyInAlphabet(char state){
        if(state=='4'){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}

