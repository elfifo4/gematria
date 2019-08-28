package com.eladfinish.gematria;


public class Gematria {

    //    gematria, gimatria
    // convert number to hebrew letters
    public static String getOtiot(int num) {
        String str;
        str = meot(num) + asarot(num) + ahadot(num);

        if (num % 100 == 15) str = meot(num) + "טו";
        else if (num % 100 == 16) str = meot(num) + "טז";

        return str;
    }

    private static String ahadot(int num) {
        String str = "";
        num = num % 10;
        switch (num) {
            case 1:
                str = "א";
                break;
            case 2:
                str = "ב";
                break;
            case 3:
                str = "ג";
                break;
            case 4:
                str = "ד";
                break;
            case 5:
                str = "ה";
                break;
            case 6:
                str = "ו";
                break;
            case 7:
                str = "ז";
                break;
            case 8:
                str = "ח";
                break;
            case 9:
                str = "ט";
                break;
        }
        return str;
    }

    private static String asarot(int num) {
        String str = "";
        num = (num % 100) / 10;
        switch (num) {
            case 1:
                str = "י";
                break;
            case 2:
                str = "כ";
                break;
            case 3:
                str = "ל";
                break;
            case 4:
                str = "מ";
                break;
            case 5:
                str = "נ";
                break;
            case 6:
                str = "ס";
                break;
            case 7:
                str = "ע";
                break;
            case 8:
                str = "פ";
                break;
            case 9:
                str = "צ";
                break;
        }
        return str;
    }

    private static String meot(int num) {
        String str = "";
        num = num / 100;
        switch (num) {
            case 1:
                str = "ק";
                break;
            case 2:
                str = "ר";
                break;
            case 3:
                str = "ש";
                break;
            case 4:
                str = "ת";
                break;
        }
        return str;
    }


    public static int gematriaWord(String word) {
        int sum = 0;

        for (int i = 0; i < word.length(); i++)
            sum += gematriaOt(word.charAt(i));

        return sum;
    }

    private static int gematriaOt(char ot) {
        int num;
        switch (ot) {
            case 'א':
                num = 1;
                break;
            case 'ב':
                num = 2;
                break;
            case 'ג':
                num = 3;
                break;
            case 'ד':
                num = 4;
                break;
            case 'ה':
                num = 5;
                break;
            case 'ו':
                num = 6;
                break;
            case 'ז':
                num = 7;
                break;
            case 'ח':
                num = 8;
                break;
            case 'ט':
                num = 9;
                break;
            case 'י':
                num = 10;
                break;
            case 'כ':
            case 'ך':
                num = 20;
                break;
            case 'ל':
                num = 30;
                break;
            case 'מ':
            case 'ם':
                num = 40;
                break;
            case 'נ':
            case 'ן':
                num = 50;
                break;
            case 'ס':
                num = 60;
                break;
            case 'ע':
                num = 70;
                break;
            case 'פ':
            case 'ף':
                num = 80;
                break;
            case 'צ':
            case 'ץ':
                num = 90;
                break;
            case 'ק':
                num = 100;
                break;
            case 'ר':
                num = 200;
                break;
            case 'ש':
                num = 300;
                break;
            case 'ת':
                num = 400;
                break;
            default:
                num = 0;
        }
        return num;
    }
    
    
//    public static void main(String[] args) {
//        System.out.println(getOtiot(123));
//    }
}
