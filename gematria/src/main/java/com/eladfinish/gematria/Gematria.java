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


//    public static void main(String[] args) {
//        System.out.println(getOtiot(123));
//    }
}
