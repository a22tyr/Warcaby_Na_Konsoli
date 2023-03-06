


import java.util.Random;
import java.util.Scanner;



public class S21251_p02 {
     static int  iloścGraczy;
    static char [] mechanikaPlanszy = new char[60];
    static int[][] tabPionekA = new int[4][2];
    static int[][] tabPionekB = new int[4][2];
    static int[][] tabPionekC = new int[4][2];
    static int[][] tabPionekD = new int[4][2];
    static int runda = 1;


    public static void main(String[] args) {
        System.out.println("    -----------------------------   ");
        System.out.println("|              WARCABY             |");
        System.out.println("    -----------------------------   ");

        int ilośćPul = 39;
        int oczka=6;
        start();

       /*start(2,new int[][] {
               {'a',5},{'b',15},
               },new int[]{2}, new int[]{15}
       );*/




    }
    static void start(){
        Scanner scanner = new Scanner(System.in);
        boolean czyIloscGraczyPoprawna = false;

        System.out.println("Wybierz ilość graczy");
        for(int i = 0; i < tabPionekA.length; i++){
            tabPionekA[i][1] = -1;
            tabPionekB[i][1] = -1;
            tabPionekC[i][1] = -1;
            tabPionekD[i][1] = -1;
        }

        while(!czyIloscGraczyPoprawna)
        {
            iloścGraczy = scanner.nextInt();
            if(iloścGraczy > 4)
            {
                System.out.println("Ilość graczy nie może być równa " + iloścGraczy);
                System.out.println("Wybierz jeszcze raz");
            }else
            {
                czyIloscGraczyPoprawna = true;
            }
        }
        if(iloścGraczy == 2){
            for(int i = 0; i < tabPionekA.length; i++){
                tabPionekA[i][0] = 0;
                tabPionekB[i][0] = 0;
            }
            for(int i = 0; i < tabPionekA.length; i++){
                tabPionekA[i][1] = -1;
                tabPionekB[i][1] = -1;
            }
            tabPionekA[0][1] = 0;
            tabPionekB[0][1] =10;
            runda =1;
            graDlaDwuchGraczy();
        }
        if(iloścGraczy==3){
            for(int i = 0; i < tabPionekA.length; i++){
                tabPionekA[i][0] = 0;
                tabPionekB[i][0] = 0;
                tabPionekC[i][0] = 0;
            }
            for(int i = 0; i < tabPionekA.length; i++){
                tabPionekA[i][1] = -1;
                tabPionekB[i][1] = -1;
                tabPionekC[i][0] = -1;
            }
            tabPionekA[0][1] = 0;
            tabPionekB[0][1] =10;
            tabPionekC[0][1] =20;
            runda =1;
            graDlaTrzechGraczy();
        }
        if (iloścGraczy ==4){
            for(int i = 0; i < tabPionekA.length; i++){
                tabPionekA[i][0] = 0;
                tabPionekB[i][0] = 0;
                tabPionekC[i][0] = 0;
                tabPionekD[i][0] = 0;
            }
            for(int i = 0; i < tabPionekA.length; i++){
                tabPionekA[i][1] = -1;
                tabPionekB[i][1] = -1;
                tabPionekC[i][1] = -1;
                tabPionekD[i][1] = -1;
            }
            tabPionekA[0][1] = 0;
            tabPionekB[0][1] =10;
            tabPionekC[0][1] =20;
            tabPionekD[0][1] =30;
            runda = 1;
            graDlaCZterechGraczy();
        }




    }
     static void start(int iloscGraczy, int[][] kolorPionka, int[] tablicaWynikow, int[] tablicaDecyzji ){
         boolean czyIloscGraczyPoprawna = false;
         for(int i = 0; i < tabPionekA.length; i++){
             tabPionekA[i][1] = -1;
             tabPionekB[i][1] = -1;
             tabPionekC[i][1] = -1;
             tabPionekD[i][1] = -1;
         }
         while(!czyIloscGraczyPoprawna)
         {
             if(iloscGraczy > 4)
             {
                 System.out.println("Ilość graczy nie może być równa " + iloscGraczy);
             }else
             {
                 czyIloscGraczyPoprawna = true;
             }
         }
         if(iloscGraczy == 2){
             for(int i = 0; i < tabPionekA.length; i++){
                 tabPionekA[i][0] = 0;
                 tabPionekB[i][0] = 0;
             }
             for(int i = 0; i < tabPionekA.length; i++){
                 tabPionekA[i][1] = -1;
                 tabPionekB[i][1] = -1;
             }
             for(int i =0; i< kolorPionka.length; i++){
                 if(kolorPionka[i][0] == 'a'){
                     tabPionekA[i][1] = kolorPionka[i][1];
                 }
                 if(kolorPionka[i][0] == 'b'){
                     tabPionekB[i][1] = kolorPionka[i][1];
                 }
             }
             odswierzMechanikePlanszy();
            if(mechanikaPlanszy[tablicaDecyzji[tablicaDecyzji.length-1]] == 'a'){
                runda = 1;
            }
             if(mechanikaPlanszy[tablicaDecyzji[tablicaDecyzji.length-1]] == 'b'){
                 runda = 2;
             }

             graDlaDwuchGraczy();

         }
         if(iloscGraczy == 3){
             for(int i = 0; i < tabPionekA.length; i++){
                 tabPionekA[i][0] = 0;
                 tabPionekB[i][0] = 0;
                 tabPionekC[i][0] = 0;
             }
             for(int i = 0; i < tabPionekA.length; i++){
                 tabPionekA[i][1] = -1;
                 tabPionekB[i][1] = -1;
                 tabPionekC[i][0] = -1;
             }
             for(int i =0; i< kolorPionka.length; i++){
                 if(kolorPionka[i][0] == 'a'){
                     tabPionekA[i][1] = kolorPionka[i][1];
                 }
                 if(kolorPionka[i][0] == 'b'){
                     tabPionekB[i][1] = kolorPionka[i][1];
                 }
                 if(kolorPionka[i][0] == 'c'){
                     tabPionekC[i][1] = kolorPionka[i][1];
                 }
             }
             odswierzMechanikePlanszy();
             if(mechanikaPlanszy[tablicaDecyzji[0]] == 'a'){
                 runda = 1;
             }
             if(mechanikaPlanszy[tablicaDecyzji[0]] == 'b'){
                 runda = 2;
             }
             if(mechanikaPlanszy[tablicaDecyzji[0]] == 'c'){
                 runda = 3;
             }

             graDlaDwuchGraczy();


         }


         if(iloscGraczy == 4){
             for(int i = 0; i < tabPionekA.length; i++){
                 tabPionekA[i][0] = 0;
                 tabPionekB[i][0] = 0;
                 tabPionekC[i][0] = 0;
                 tabPionekD[i][0] = 0;
             }
             for(int i = 0; i < tabPionekA.length; i++){
                 tabPionekA[i][1] = -1;
                 tabPionekB[i][1] = -1;
                 tabPionekC[i][0] = -1;
                 tabPionekD[i][0] = -1;
             }
             for(int i =0; i< kolorPionka.length; i++){
                 if(kolorPionka[i][0] == 'a'){
                     tabPionekA[i][1] = kolorPionka[i][1];
                 }
                 if(kolorPionka[i][0] == 'b'){
                     tabPionekB[i][1] = kolorPionka[i][1];
                 }
                 if(kolorPionka[i][0] == 'c'){
                     tabPionekC[i][1] = kolorPionka[i][1];
                 }
                 if(kolorPionka[i][0] == 'd'){
                     tabPionekD[i][1] = kolorPionka[i][1];
                 }
             }
             odswierzMechanikePlanszy();
             if(mechanikaPlanszy[tablicaDecyzji[0]] == 'a'){
                 runda = 1;
             }
             if(mechanikaPlanszy[tablicaDecyzji[0]] == 'b'){
                 runda = 2;
             }
             if(mechanikaPlanszy[tablicaDecyzji[0]] == 'c'){
                 runda = 3;
             }
             if(mechanikaPlanszy[tablicaDecyzji[0]] == 'd'){
                 runda = 3;
             }

             graDlaDwuchGraczy();

         }
     }

    static void narysujMape() {
        int [][] tab = new int[13][13];
        for(int i = 0; i< tab.length ; i++){
            for(int j = 0;j<tab[i].length; j++){
                tab[i][j] = ' ';
            }
        }
        tab[0][7] = '0';
        tab[5][0] = '3';
        tab[6][0] ='0';
        tab[12][5] = '2';
        tab[12][6] ='0';
        tab[7][12] = '1';
        tab[8][12] ='0';

        for(int m = 0;m <= mechanikaPlanszy.length-1; m++) {
            switch (m) {
                case 0:
                    tab[1][7] = mechanikaPlanszy[m];
                    break;
                case 1:
                    tab[2][7] = mechanikaPlanszy[m];
                    break;
                case 2:
                    tab[3][7] = mechanikaPlanszy[m];
                    break;
                case 3:
                    tab[4][7] = mechanikaPlanszy[m];
                    break;
                case 4:
                    tab[5][7] = mechanikaPlanszy[m];
                    break;
                case 5:
                    tab[5][8] = mechanikaPlanszy[m];
                    break;
                case 6:
                    tab[5][9] = mechanikaPlanszy[m];
                    break;
                case 7:
                    tab[5][10] = mechanikaPlanszy[m];
                    break;
                case 8:
                    tab[5][11] = mechanikaPlanszy[m];
                    break;
                case 9:
                    tab[6][11] = mechanikaPlanszy[m];
                    break;
                case 10:
                    tab[7][11] = mechanikaPlanszy[m];
                    break;
                case 11:
                    tab[7][10] = mechanikaPlanszy[m];
                    break;
                case 12:
                    tab[7][9] = mechanikaPlanszy[m];
                    break;
                case 13:
                    tab[7][8] = mechanikaPlanszy[m];
                    break;
                case 14:
                    tab[7][7] = mechanikaPlanszy[m];
                    break;
                case 15:
                    tab[8][7] = mechanikaPlanszy[m];
                    break;
                case 16:
                    tab[9][7] = mechanikaPlanszy[m];
                    break;
                case 17:
                    tab[10][7] = mechanikaPlanszy[m];
                    break;
                case 18:
                    tab[11][7] = mechanikaPlanszy[m];
                    break;
                case 19:
                    tab[11][6] = mechanikaPlanszy[m];
                    break;
                case 20:
                    tab[11][5] = mechanikaPlanszy[m];
                    break;
                case 21:
                    tab[10][5] = mechanikaPlanszy[m];
                    break;
                case 22:
                    tab[9][5] = mechanikaPlanszy[m];
                    break;
                case 23:
                    tab[8][5] = mechanikaPlanszy[m];
                    break;
                case 24:
                    tab[7][5] = mechanikaPlanszy[m];
                    break;
                case 25:
                    tab[7][4] = mechanikaPlanszy[m];
                    break;
                case 26:
                    tab[7][3] = mechanikaPlanszy[m];
                    break;
                case 27:
                    tab[7][2] = mechanikaPlanszy[m];
                    break;
                case 28:
                    tab[7][1] = mechanikaPlanszy[m];
                    break;
                case 29:
                    tab[6][1] = mechanikaPlanszy[m];
                    break;
                case 30:
                    tab[5][1] = mechanikaPlanszy[m];
                    break;
                case 31:
                    tab[5][2] = mechanikaPlanszy[m];
                    break;
                case 32:
                    tab[5][3] = mechanikaPlanszy[m];
                    break;
                case 33:
                    tab[5][4] = mechanikaPlanszy[m];
                    break;
                case 34:
                    tab[5][5] = mechanikaPlanszy[m];
                    break;
                case 35:
                    tab[4][5] = mechanikaPlanszy[m];
                    break;
                case 36:
                    tab[3][5] = mechanikaPlanszy[m];
                    break;
                case 37:
                    tab[2][5] = mechanikaPlanszy[m];
                    break;
                case 38:
                    tab[1][5] = mechanikaPlanszy[m];
                    break;
                case 39:
                    tab[1][6] = mechanikaPlanszy[m];
                    break;


            }
        }

        for(int i = 0;i< tab.length; i++ ){
            System.out.println();
            for(int j = 0;j< tab[i].length; j++){
                System.out.print((char) tab[i][j] + "  ");
            }
        }
    }
    static void odswierzMechanikePlanszy() {
        for(int i=0; i<mechanikaPlanszy.length; i++){
            mechanikaPlanszy[i] = 'x';
        }
        for (int j = 0; j < mechanikaPlanszy.length; j++) {
           // for (int i = 0; i < tabPionekA.length; i++) {
               if(tabPionekA[0][1] == j){
                   mechanikaPlanszy[j] = 'a';
               }else if(tabPionekA[1][1] == j){
                   mechanikaPlanszy[j] = 'a';
               }else if(tabPionekA[2][1] == j){
                mechanikaPlanszy[j] = 'a';
                }else if(tabPionekA[3][1] == j){
                mechanikaPlanszy[j] = 'a';
            }
            if(tabPionekB[0][1] == j){
                mechanikaPlanszy[j] = 'b';
            }else if(tabPionekB[1][1] == j){
                mechanikaPlanszy[j] = 'b';
            }else if(tabPionekB[2][1] == j){
                mechanikaPlanszy[j] = 'b';
            }else if(tabPionekB[3][1] == j){
                mechanikaPlanszy[j] = 'b';
            }
            if(tabPionekC[0][1] == j){
                mechanikaPlanszy[j] = 'c';
            }else if(tabPionekC[1][1] == j){
                mechanikaPlanszy[j] = 'c';
            }else if(tabPionekC[2][1] == j){
                mechanikaPlanszy[j] = 'c';
            }else if(tabPionekC[3][1] == j){
                mechanikaPlanszy[j] = 'c';
            }
            if(tabPionekD[0][1] == j){
                mechanikaPlanszy[j] = 'd';
            }else if(tabPionekD[1][1] == j){
                mechanikaPlanszy[j] = 'd';
            }else if(tabPionekD[2][1] == j){
                mechanikaPlanszy[j] = 'd';
            }else if(tabPionekD[3][1] == j){
                mechanikaPlanszy[j] = 'd';
            }
        }
        narysujMape();
        //}
    }
    static int rzutKostką(){
        Random liczbaOczek = new Random();
        return liczbaOczek.nextInt(6) + 1;
    }
    static void graDlaDwuchGraczy(){
        Scanner scanner = new Scanner(System.in);
        int polePionkaDoruchu;
        int pionkiWygraneA = 0;
        int pionkiWygraneB = 0;
        System.out.println("Zaczyna Pionek A");


        int kostka;
        int wynik = 0;

        while(pionkiWygraneA < 4 || pionkiWygraneB < 4){
             wynik = 0;
                while(runda % 2 == 1) {
                    odswierzMechanikePlanszy();
                    System.out.println();
                    System.out.println("Gracz A");
                    kostka = rzutKostką();
                    System.out.println();
                    System.out.println("Wyrzucono " + kostka);
                    wynik += kostka;
                    System.out.println("W sumie do przesuniecia się jest: " + wynik);

                    if (wynik == 6) {
                        int zmienna = 4;
                        for (int i = 0; i < tabPionekA.length; i++) {
                            if (tabPionekA[i][1] == -1) {
                                zmienna = i;
                                break;
                            }
                        }
                        if (zmienna < 4) {
                            if (mechanikaPlanszy[0] != 'a') {
                                System.out.println("Wybierz czy chcesz wystawić pionka czy ruszać sie wystawionym");
                                System.out.println("Czy wystwaic pionek ?");
                                System.out.println("Wcisnij jeden by wystawić, lub 2 by ruszyć sie innym pionkiem");
                                polePionkaDoruchu = scanner.nextInt();
                                if (polePionkaDoruchu == 1) {
                                    tabPionekA[zmienna][1] = 0;
                                    if(mechanikaPlanszy[0] == 'b'){
                                        for (int j = 0; j < tabPionekB.length; j++) {
                                            if (tabPionekB[j][1] == 0){
                                                tabPionekB[j][0] =0;
                                                tabPionekB[j][1] =-1;

                                            }
                                        }

                                    }
                                    runda++;
                                    wynik=0;

                                }else{
                                    System.out.println("Rzucasz jeszcze raz");
                                }

                            }

                        } else System.out.println("Rzucasz jeszcze raz");
                    }else {
                        polePionkaDoruchu = scanner.nextInt();
                        if (mechanikaPlanszy[polePionkaDoruchu] == 'a') {// sprawdz czy na polu jest pionek a
                            for (int i = 0; i < tabPionekA.length; i++) { // wyszukuje pionjka
                                if (tabPionekA[i][1] == polePionkaDoruchu) {// wybiera pionika który mas sie ruszyć
                                    if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'x' ){
                                        tabPionekA[i][1] = polePionkaDoruchu + wynik;
                                        tabPionekA[i][0] += wynik;
                                        if(tabPionekA[i][0] >40){
                                            tabPionekA[i][1] = - 2;
                                            tabPionekA[i][0] += wynik;
                                            pionkiWygraneA ++;
                                        }
                                    }else if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'a' ){
                                        wynik+=1;
                                        tabPionekA[i][1] = polePionkaDoruchu + wynik ;
                                        tabPionekA[i][0] += wynik;
                                        if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'b'){
                                            for (int j = 0; j < tabPionekB.length; j++) {
                                                if (tabPionekB[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekB[j][0] =0;
                                                    tabPionekB[j][1] =-1;

                                                }
                                            }
                                            }


                                    }else if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'b'){
                                        if(tabPionekA[i][1] + wynik == 10){
                                            tabPionekA[i][1] = polePionkaDoruchu + wynik+1 ;
                                            tabPionekA[i][0] += wynik+1;
                                            if(mechanikaPlanszy[tabPionekA[i][1] ] == 'b'){
                                                for (int j = 0; j < tabPionekB.length; j++) {
                                                    if (tabPionekB[j][1] == polePionkaDoruchu + wynik){
                                                        tabPionekB[j][0] =0;
                                                        tabPionekB[j][1] =-1;

                                                    }
                                                }
                                            }//
                                        }else{
                                            tabPionekA[i][1] = polePionkaDoruchu + wynik ;
                                            tabPionekA[i][0] += wynik;
                                            if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'b'){
                                                for (int j = 0; j < tabPionekB.length; j++) {
                                                    if (tabPionekB[j][1] == polePionkaDoruchu + wynik){
                                                        tabPionekB[j][0] =0;
                                                        tabPionekB[j][1] =-1;

                                                    }
                                                }
                                            }

                                        }

                                    }

                                }
                            } runda++;
                            wynik =0;

                        } else
                            System.out.println("Wybierz pole jeszcze raz");
                        wynik =0;

                    }
                }

            while(runda % 2 == 0) {

                odswierzMechanikePlanszy();
                System.out.println();
                System.out.println("Gracz B");
                kostka = rzutKostką();
                System.out.println("Wyrzucono " + kostka);
                wynik += kostka;
                System.out.println("W sumie do przesuniecia się jest: " + wynik);

                if (wynik == 6) {
                    int zmienna = 4;
                    for (int i = 0; i < tabPionekB.length; i++) {
                        if (tabPionekB[i][1] == -1) {
                            zmienna = i;
                            break;
                        }
                    }
                    if (zmienna < 4) {
                        if (mechanikaPlanszy[10] != 'b') {
                            System.out.println("Wybierz czy chcesz wystawić pionka czy ruszać sie wystawionym");
                            System.out.println("Czy wystwaic pionek ?");
                            System.out.println("Wcisnij jeden by wystawić, lub 2 by ruszyć sie innym pionkiem");
                            polePionkaDoruchu = scanner.nextInt();
                            if (polePionkaDoruchu == 1) {
                                tabPionekB[zmienna][1] = 10;
                                if(mechanikaPlanszy[10] == 'a'){
                                    for (int j = 0; j < tabPionekA.length; j++) {
                                        if (tabPionekA[j][1] == 0){
                                            tabPionekA[j][0] =0;
                                            tabPionekA[j][1] =-1;

                                        }
                                    }

                                }
                                runda++;
                                wynik=0;

                            }else{
                                System.out.println("Rzucasz jeszcze raz");
                            }

                        }

                    } else System.out.println("Rzucasz jeszcze raz");
                }else {
                    polePionkaDoruchu = scanner.nextInt();
                    if (mechanikaPlanszy[polePionkaDoruchu] == 'b') {// sprawdz czy na polu jest pionek a
                        for (int i = 0; i < tabPionekB.length; i++) { // wyszukuje pionjka
                            if (tabPionekB[i][1] == polePionkaDoruchu) {// wybiera pionika który mas sie ruszyć
                                if(mechanikaPlanszy[tabPionekB[i][1] + wynik] == 'x' ){
                                    tabPionekB[i][1] = polePionkaDoruchu + wynik;
                                    tabPionekB[i][0] += wynik;
                                    if(tabPionekB[i][0] >40){
                                        tabPionekB[i][1] = - 2;
                                        tabPionekB[i][0] += wynik;
                                        pionkiWygraneB ++;
                                    }
                                }else if(mechanikaPlanszy[tabPionekB[i][1] + wynik] == 'b' ){
                                    wynik+=1;
                                    tabPionekB[i][1] = polePionkaDoruchu + wynik ;
                                    tabPionekB[i][0] += wynik;
                                    if(mechanikaPlanszy[tabPionekB[i][1] + wynik] == 'a'){
                                        for (int j = 0; j < tabPionekA.length; j++) {
                                            if (tabPionekA[j][1] == polePionkaDoruchu + wynik){
                                                tabPionekA[j][0] =0;
                                                tabPionekA[j][1] =-1;

                                            }
                                        }
                                    }


                                }else if(mechanikaPlanszy[tabPionekB[i][1] + wynik] == 'a'){
                                    if(tabPionekB[i][1] + wynik == 10){
                                        tabPionekB[i][1] = polePionkaDoruchu + wynik+1 ;
                                        tabPionekB[i][0] += wynik+1;
                                        if(mechanikaPlanszy[tabPionekA[i][1] ] == 'a'){
                                            for (int j = 0; j < tabPionekA.length; j++) {
                                                if (tabPionekA[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekA[j][0] =0;
                                                    tabPionekA[j][1] =-1;

                                                }
                                            }
                                        }//
                                    }else{
                                        tabPionekB[i][1] = polePionkaDoruchu + wynik ;
                                        tabPionekB[i][0] += wynik;
                                        if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'a'){
                                            for (int j = 0; j < tabPionekB.length; j++) {
                                                if (tabPionekA[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekA[j][0] =0;
                                                    tabPionekA[j][1] =-1;

                                                }
                                            }
                                        }

                                    }

                                }

                            }
                        }  runda++;
                        wynik=0;

                    } else
                        System.out.println("Wybierz pole jeszcze raz");
                    wynik =0;

                }

            }

        }
        if(pionkiWygraneA == 4 ){
            System.out.println("Wygral gracz a");
        }
        if(pionkiWygraneB == 4 ){
            System.out.println("Wygral gracz b");
        }

    }



    static void graDlaTrzechGraczy(){
        Scanner scanner = new Scanner(System.in);
        int polePionkaDoruchu;
        int pionkiWygraneA = 0;
        int pionkiWygraneB = 0;
        int pionkiWygraneC = 0;
        System.out.println("Zaczyna Pionek A");
        tabPionekA[0][1] = 0;
        tabPionekB[0][1] =10;
        tabPionekC[0][1] =20;

        int kostka;
        int wynik = 0;

        while(pionkiWygraneA < 4 || pionkiWygraneB < 4 || pionkiWygraneC < 4){
            wynik = 0;
            while(runda == 1) {
                odswierzMechanikePlanszy();
                System.out.println();
                System.out.println("Gracz A");
                kostka = rzutKostką();
                System.out.println();
                System.out.println("Wyrzucono " + kostka);
                wynik += kostka;
                System.out.println("W sumie do przesuniecia się jest: " + wynik);

                if (wynik == 6) {
                    int zmienna = 4;
                    for (int i = 0; i < tabPionekA.length; i++) {
                        if (tabPionekA[i][1] == -1) {
                            zmienna = i;
                            break;
                        }
                    }
                    if (zmienna < 4) {
                        if (mechanikaPlanszy[0] != 'a') {
                            System.out.println("Wybierz czy chcesz wystawić pionka czy ruszać sie wystawionym");
                            System.out.println("Czy wystwaic pionek ?");
                            System.out.println("Wcisnij jeden by wystawić, lub 2 by ruszyć sie innym pionkiem");
                            polePionkaDoruchu = scanner.nextInt();
                            if (polePionkaDoruchu == 1) {
                                tabPionekA[zmienna][1] = 0;
                                if(mechanikaPlanszy[0] == 'b'){
                                    for (int j = 0; j < tabPionekB.length; j++) {
                                        if (tabPionekB[j][1] == 0){
                                            tabPionekB[j][0] =0;
                                            tabPionekB[j][1] =-1;

                                        }
                                    }
                                }
                                if(mechanikaPlanszy[0] == 'c'){
                                    for (int j = 0; j < tabPionekC.length; j++) {
                                        if (tabPionekC[j][1] == 0){
                                            tabPionekC[j][0] =0;
                                            tabPionekC[j][1] =-1;

                                        }
                                    }
                                }
                                runda++;
                                wynik=0;

                            }else{
                                System.out.println("Rzucasz jeszcze raz");
                            }

                        }

                    } else System.out.println("Rzucasz jeszcze raz");
                }else {
                    polePionkaDoruchu = scanner.nextInt();
                    if (mechanikaPlanszy[polePionkaDoruchu] == 'a') {// sprawdz czy na polu jest pionek a
                        for (int i = 0; i < tabPionekA.length; i++) { // wyszukuje pionjka
                            if (tabPionekA[i][1] == polePionkaDoruchu) {// wybiera pionika który mas sie ruszyć
                                if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'x' ){
                                    tabPionekA[i][1] = polePionkaDoruchu + wynik;
                                    tabPionekA[i][0] += wynik;
                                    if(tabPionekA[i][0] >40){
                                        tabPionekA[i][1] = - 2;
                                        tabPionekA[i][0] += wynik;
                                        pionkiWygraneA ++;
                                    }
                                }else if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'a' ){
                                    wynik+=1;
                                    tabPionekA[i][1] = polePionkaDoruchu + wynik ;
                                    tabPionekA[i][0] += wynik;
                                    if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'b'){
                                        for (int j = 0; j < tabPionekB.length; j++) {
                                            if (tabPionekB[j][1] == polePionkaDoruchu + wynik){
                                                tabPionekB[j][0] =0;
                                                tabPionekB[j][1] =-1;

                                            }
                                        }
                                    }
                                    if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'c'){
                                        for (int j = 0; j < tabPionekB.length; j++) {
                                            if (tabPionekC[j][1] == polePionkaDoruchu + wynik){
                                                tabPionekC[j][0] =0;
                                                tabPionekC[j][1] =-1;

                                            }
                                        }
                                    }
                                    if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'c'){
                                        for (int j = 0; j < tabPionekC.length; j++) {
                                            if (tabPionekC[j][1] == polePionkaDoruchu + wynik){
                                                tabPionekC[j][0] =0;
                                                tabPionekC[j][1] =-1;

                                            }
                                        }
                                    }


                                }else if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'b'){
                                    if(tabPionekA[i][1] + wynik == 10){
                                        tabPionekA[i][1] = polePionkaDoruchu + wynik +1 ;
                                        tabPionekA[i][0] += wynik+1;
                                        if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'b'){
                                            for (int j = 0; j < tabPionekB.length; j++) {
                                                if (tabPionekB[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekB[j][0] =0;
                                                    tabPionekB[j][1] =-1;

                                                }
                                            }
                                        }
                                        if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'c'){
                                            for (int j = 0; j < tabPionekB.length; j++) {
                                                if (tabPionekC[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekC[j][0] =0;
                                                    tabPionekC[j][1] =-1;

                                                }
                                            }
                                        }
                                    }else{
                                        tabPionekA[i][1] = polePionkaDoruchu + wynik ;
                                        tabPionekA[i][0] += wynik;
                                        if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'b'){
                                            for (int j = 0; j < tabPionekB.length; j++) {
                                                if (tabPionekB[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekB[j][0] =0;
                                                    tabPionekB[j][1] =-1;

                                                }
                                            }
                                        }

                                    }

                                }else if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'c'){
                                    if(tabPionekA[i][1] + wynik == 20){
                                        tabPionekA[i][1] = polePionkaDoruchu + wynik +1 ;
                                        tabPionekA[i][0] += wynik+1;
                                        if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'b'){
                                            for (int j = 0; j < tabPionekB.length; j++) {
                                                if (tabPionekB[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekB[j][0] =0;
                                                    tabPionekB[j][1] =-1;

                                                }
                                            }
                                        }
                                        if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'c'){
                                            for (int j = 0; j < tabPionekB.length; j++) {
                                                if (tabPionekC[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekC[j][0] =0;
                                                    tabPionekC[j][1] =-1;

                                                }
                                            }
                                        }
                                    }else{
                                        tabPionekA[i][1] = polePionkaDoruchu + wynik ;
                                        tabPionekA[i][0] += wynik;
                                        if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'c'){
                                            for (int j = 0; j < tabPionekC.length; j++) {
                                                if (tabPionekC[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekC[j][0] =0;
                                                    tabPionekC[j][1] =-1;

                                                }
                                            }
                                        }

                                    }

                                }

                            }
                        } runda++;
                        wynik =0;

                    } else
                        System.out.println("Wybierz pole jeszcze raz");
                    wynik =0;

                }
            }

            while(runda == 2) {

                odswierzMechanikePlanszy();
                System.out.println();
                System.out.println("Gracz B");
                kostka = rzutKostką();
                System.out.println("Wyrzucono " + kostka);
                wynik += kostka;
                System.out.println("W sumie do przesuniecia się jest: " + wynik);

                if (wynik == 6) {
                    int zmienna = 4;
                    for (int i = 0; i < tabPionekB.length; i++) {
                        if (tabPionekB[i][1] == -1) {
                            zmienna = i;
                            break;
                        }
                    }
                    if (zmienna < 4) {
                        if (mechanikaPlanszy[10] != 'b') {
                            System.out.println("Wybierz czy chcesz wystawić pionka czy ruszać sie wystawionym");
                            System.out.println("Czy wystwaic pionek ?");
                            System.out.println("Wcisnij jeden by wystawić, lub 2 by ruszyć sie innym pionkiem");
                            polePionkaDoruchu = scanner.nextInt();
                            if (polePionkaDoruchu == 1) {
                                tabPionekB[zmienna][1] = 10;
                                if(mechanikaPlanszy[10] == 'a'){
                                    for (int j = 0; j < tabPionekA.length; j++) {
                                        if (tabPionekA[j][1] == 0){
                                            tabPionekA[j][0] =0;
                                            tabPionekA[j][1] =-1;

                                        }
                                    }

                                }if(mechanikaPlanszy[10] == 'c'){
                                    for (int j = 0; j < tabPionekC.length; j++) {
                                        if (tabPionekC[j][1] == 0){
                                            tabPionekC[j][0] =0;
                                            tabPionekC[j][1] =-1;

                                        }
                                    }

                                }
                                runda++;
                                wynik=0;

                            }else{
                                System.out.println("Rzucasz jeszcze raz");
                            }

                        }

                    } else System.out.println("Rzucasz jeszcze raz");
                }else {
                    polePionkaDoruchu = scanner.nextInt();
                    if (mechanikaPlanszy[polePionkaDoruchu] == 'b') {// sprawdz czy na polu jest pionek a
                        for (int i = 0; i < tabPionekB.length; i++) { // wyszukuje pionjka
                            if (tabPionekB[i][1] == polePionkaDoruchu) {// wybiera pionika który mas sie ruszyć
                                if(mechanikaPlanszy[tabPionekB[i][1] + wynik] == 'x' ){
                                    tabPionekB[i][1] = polePionkaDoruchu + wynik;
                                    tabPionekB[i][0] += wynik;
                                    if(tabPionekB[i][0] >40){
                                        tabPionekB[i][1] = - 2;
                                        tabPionekB[i][0] += wynik;
                                        pionkiWygraneB ++;
                                    }
                                }else if(mechanikaPlanszy[tabPionekB[i][1] + wynik] == 'b' ){
                                    wynik+=1;
                                    tabPionekB[i][1] = polePionkaDoruchu + wynik ;
                                    tabPionekB[i][0] += wynik;
                                    if(mechanikaPlanszy[tabPionekB[i][1] + wynik] == 'a'){
                                        for (int j = 0; j < tabPionekA.length; j++) {
                                            if (tabPionekA[j][1] == polePionkaDoruchu + wynik){
                                                tabPionekA[j][0] =0;
                                                tabPionekA[j][1] =-1;

                                            }
                                        }
                                    }
                                    if(mechanikaPlanszy[tabPionekC[i][1] + wynik] == 'c'){
                                        for (int j = 0; j < tabPionekA.length; j++) {
                                            if (tabPionekC[j][1] == polePionkaDoruchu + wynik){
                                                tabPionekC[j][0] =0;
                                                tabPionekC[j][1] =-1;

                                            }
                                        }
                                    }


                                }else if(mechanikaPlanszy[tabPionekB[i][1] + wynik] == 'a'){
                                    if(tabPionekB[i][1] + wynik == 0){
                                        tabPionekB[i][1] = polePionkaDoruchu + wynik+1 ;
                                        tabPionekB[i][0] += wynik+1;
                                        if(mechanikaPlanszy[tabPionekB[i][1] + wynik] == 'a'){
                                            for (int j = 0; j < tabPionekA.length; j++) {
                                                if (tabPionekA[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekA[j][0] =0;
                                                    tabPionekA[j][1] =-1;

                                                }
                                            }
                                        }
                                        if(mechanikaPlanszy[tabPionekC[i][1] + wynik] == 'c'){
                                            for (int j = 0; j < tabPionekA.length; j++) {
                                                if (tabPionekC[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekC[j][0] =0;
                                                    tabPionekC[j][1] =-1;

                                                }
                                            }
                                        }
                                    }else{
                                        tabPionekB[i][1] = polePionkaDoruchu + wynik ;
                                        tabPionekB[i][0] += wynik;
                                        if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'a'){
                                            for (int j = 0; j < tabPionekB.length; j++) {
                                                if (tabPionekA[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekA[j][0] =0;
                                                    tabPionekA[j][1] =-1;

                                                }
                                            }
                                        }
                                    }
                                }else if(mechanikaPlanszy[tabPionekB[i][1] + wynik] == 'c'){
                                    if(tabPionekB[i][1] + wynik == 20){
                                        tabPionekB[i][1] = polePionkaDoruchu + wynik+1 ;
                                        tabPionekB[i][0] += wynik+1;
                                        if(mechanikaPlanszy[tabPionekB[i][1] + wynik] == 'a'){
                                            for (int j = 0; j < tabPionekA.length; j++) {
                                                if (tabPionekA[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekA[j][0] =0;
                                                    tabPionekA[j][1] =-1;

                                                }
                                            }
                                        }
                                        if(mechanikaPlanszy[tabPionekC[i][1] + wynik] == 'c'){
                                            for (int j = 0; j < tabPionekA.length; j++) {
                                                if (tabPionekC[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekC[j][0] =0;
                                                    tabPionekC[j][1] =-1;

                                                }
                                            }
                                        }
                                    }else{
                                        tabPionekB[i][1] = polePionkaDoruchu + wynik ;
                                        tabPionekB[i][0] += wynik;
                                        if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'c'){
                                            for (int j = 0; j < tabPionekB.length; j++) {
                                                if (tabPionekC[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekC[j][0] =0;
                                                    tabPionekC[j][1] =-1;

                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }  runda++;
                        wynik=0;

                    } else
                        System.out.println("Wybierz pole jeszcze raz");
                    wynik =0;

                }

            }
            while(runda == 3) {

                odswierzMechanikePlanszy();
                System.out.println();
                System.out.println("Gracz C");
                kostka = rzutKostką();
                System.out.println("Wyrzucono " + kostka);
                wynik += kostka;
                System.out.println("W sumie do przesuniecia się jest: " + wynik);

                if (wynik == 6) {
                    int zmienna = 4;
                    for (int i = 0; i < tabPionekC.length; i++) {
                        if (tabPionekC[i][1] == -1) {
                            zmienna = i;
                            break;
                        }
                    }
                    if (zmienna < 4) {
                        if (mechanikaPlanszy[20] != 'c') {
                            System.out.println("Wybierz czy chcesz wystawić pionka czy ruszać sie wystawionym");
                            System.out.println("Czy wystwaic pionek ?");
                            System.out.println("Wcisnij jeden by wystawić, lub 2 by ruszyć sie innym pionkiem");
                            polePionkaDoruchu = scanner.nextInt();
                            if (polePionkaDoruchu == 1) {
                                tabPionekB[zmienna][1] = 20;
                                if(mechanikaPlanszy[20] == 'a'){
                                    for (int j = 0; j < tabPionekA.length; j++) {
                                        if (tabPionekA[j][1] == 0){
                                            tabPionekA[j][0] =0;
                                            tabPionekA[j][1] =-1;

                                        }
                                    }

                                }if(mechanikaPlanszy[20] == 'b'){
                                    for (int j = 0; j < tabPionekC.length; j++) {
                                        if (tabPionekB[j][1] == 0){
                                            tabPionekB[j][0] =0;
                                            tabPionekB[j][1] =-1;

                                        }
                                    }

                                }
                                runda = 1;
                                wynik=0;

                            }else{
                                System.out.println("Rzucasz jeszcze raz");
                            }

                        }

                    } else System.out.println("Rzucasz jeszcze raz");
                }else {
                    polePionkaDoruchu = scanner.nextInt();
                    if (mechanikaPlanszy[polePionkaDoruchu] == 'c') {// sprawdz czy na polu jest pionek a
                        for (int i = 0; i < tabPionekC.length; i++) { // wyszukuje pionjka
                            if (tabPionekC[i][1] == polePionkaDoruchu) {// wybiera pionika który mas sie ruszyć
                                if(mechanikaPlanszy[tabPionekC[i][1] + wynik] == 'x' ){
                                    tabPionekC[i][1] = polePionkaDoruchu + wynik;
                                    tabPionekC[i][0] += wynik;
                                    if(tabPionekC[i][0] >40){
                                        tabPionekC[i][1] = - 2;
                                        tabPionekC[i][0] += wynik;
                                        pionkiWygraneC ++;
                                    }
                                }else if(mechanikaPlanszy[tabPionekC[i][1] + wynik] == 'c' ){
                                    wynik+=1;
                                    tabPionekC[i][1] = polePionkaDoruchu + wynik ;
                                    tabPionekC[i][0] += wynik;
                                    if(mechanikaPlanszy[tabPionekC[i][1] + wynik] == 'a'){
                                        for (int j = 0; j < tabPionekA.length; j++) {
                                            if (tabPionekA[j][1] == polePionkaDoruchu + wynik){
                                                tabPionekA[j][0] =0;
                                                tabPionekA[j][1] =-1;

                                            }
                                        }
                                    }
                                    if(mechanikaPlanszy[tabPionekC[i][1] + wynik] == 'b'){
                                        for (int j = 0; j < tabPionekA.length; j++) {
                                            if (tabPionekB[j][1] == polePionkaDoruchu + wynik){
                                                tabPionekB[j][0] =0;
                                                tabPionekB[j][1] =-1;

                                            }
                                        }
                                    }


                                }else if(mechanikaPlanszy[tabPionekC[i][1] + wynik] == 'a'){
                                    if(tabPionekC[i][1] + wynik == 0){
                                        tabPionekC[i][1] = polePionkaDoruchu + wynik+1 ;
                                        tabPionekC[i][0] += wynik+1;
                                        if(mechanikaPlanszy[tabPionekC[i][1] + wynik] == 'a'){
                                            for (int j = 0; j < tabPionekA.length; j++) {
                                                if (tabPionekA[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekA[j][0] =0;
                                                    tabPionekA[j][1] =-1;

                                                }
                                            }
                                        }
                                        if(mechanikaPlanszy[tabPionekC[i][1] + wynik] == 'b'){
                                            for (int j = 0; j < tabPionekA.length; j++) {
                                                if (tabPionekB[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekB[j][0] =0;
                                                    tabPionekB[j][1] =-1;

                                                }
                                            }
                                        }
                                    }else{
                                        tabPionekC[i][1] = polePionkaDoruchu + wynik ;
                                        tabPionekC[i][0] += wynik;
                                        if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'a'){
                                            for (int j = 0; j < tabPionekA.length; j++) {
                                                if (tabPionekA[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekA[j][0] =0;
                                                    tabPionekA[j][1] =-1;

                                                }
                                            }
                                        }
                                    }
                                }else if(mechanikaPlanszy[tabPionekC[i][1] + wynik] == 'b'){
                                    if(tabPionekC[i][1] + wynik == 20){
                                        tabPionekC[i][1] = polePionkaDoruchu + wynik+1 ;
                                        tabPionekC[i][0] += wynik+1;
                                        if(mechanikaPlanszy[tabPionekC[i][1] + wynik] == 'a'){
                                            for (int j = 0; j < tabPionekA.length; j++) {
                                                if (tabPionekA[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekA[j][0] =0;
                                                    tabPionekA[j][1] =-1;

                                                }
                                            }
                                        }
                                        if(mechanikaPlanszy[tabPionekC[i][1] + wynik] == 'b'){
                                            for (int j = 0; j < tabPionekA.length; j++) {
                                                if (tabPionekB[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekB[j][0] =0;
                                                    tabPionekB[j][1] =-1;

                                                }
                                            }
                                        }
                                    }else{
                                        tabPionekC[i][1] = polePionkaDoruchu + wynik ;
                                        tabPionekC[i][0] += wynik;
                                        if(mechanikaPlanszy[tabPionekC[i][1] + wynik] == 'b'){
                                            for (int j = 0; j < tabPionekC.length; j++) {
                                                if (tabPionekB[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekB[j][0] =0;
                                                    tabPionekB[j][1] =-1;

                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }  runda=1;
                        wynik=0;

                    } else
                        System.out.println("Wybierz pole jeszcze raz");
                    wynik =0;

                }

            }

        }
        if(pionkiWygraneA == 4 ){
            System.out.println("Wygral gracz a");
        }
        if(pionkiWygraneB == 4 ){
            System.out.println("Wygral gracz b");
        }
        if(pionkiWygraneC == 4 ){
            System.out.println("Wygral gracz c");
        }

    }
    static void graDlaCZterechGraczy(){
        Scanner scanner = new Scanner(System.in);
        int polePionkaDoruchu;
        int pionkiWygraneA = 0;
        int pionkiWygraneB = 0;
        int pionkiWygraneC = 0;
        int pionkiWygraneD = 0;




        System.out.println("Zaczyna Pionek A");
        tabPionekA[0][1] = 0;
        tabPionekB[0][1] =10;
        tabPionekC[0][1] =20;
        tabPionekD[0][1] =30;

        int kostka;
        int wynik = 0;

        while(pionkiWygraneA < 4 || pionkiWygraneB < 4 || pionkiWygraneC < 4 || pionkiWygraneD < 4){
            wynik = 0;
            while(runda == 1) {
                odswierzMechanikePlanszy();
                System.out.println();
                System.out.println("Gracz A");
                kostka = rzutKostką();
                System.out.println();
                System.out.println("Wyrzucono " + kostka);
                wynik += kostka;
                System.out.println("W sumie do przesuniecia się jest: " + wynik);

                if (wynik == 6) {
                    int zmienna = 4;
                    for (int i = 0; i < tabPionekA.length; i++) {
                        if (tabPionekA[i][1] == -1) {
                            zmienna = i;
                            break;
                        }
                    }
                    if (zmienna < 4) {
                        if (mechanikaPlanszy[0] != 'a') {
                            System.out.println("Wybierz czy chcesz wystawić pionka czy ruszać sie wystawionym");
                            System.out.println("Czy wystwaic pionek ?");
                            System.out.println("Wcisnij jeden by wystawić, lub 2 by ruszyć sie innym pionkiem");
                            polePionkaDoruchu = scanner.nextInt();
                            if (polePionkaDoruchu == 1) {
                                tabPionekA[zmienna][1] = 0;
                                if(mechanikaPlanszy[0] == 'b'){
                                    for (int j = 0; j < tabPionekB.length; j++) {
                                        if (tabPionekB[j][1] == 0){
                                            tabPionekB[j][0] =0;
                                            tabPionekB[j][1] =-1;

                                        }
                                    }
                                }
                                if(mechanikaPlanszy[0] == 'c'){
                                    for (int j = 0; j < tabPionekC.length; j++) {
                                        if (tabPionekC[j][1] == 0){
                                            tabPionekC[j][0] =0;
                                            tabPionekC[j][1] =-1;

                                        }
                                    }
                                } if(mechanikaPlanszy[0] == 'd'){
                                    for (int j = 0; j < tabPionekD.length; j++) {
                                        if (tabPionekD[j][1] == 0){
                                            tabPionekD[j][0] =0;
                                            tabPionekD[j][1] =-1;

                                        }
                                    }
                                }
                                runda++;
                                wynik=0;

                            }else{
                                System.out.println("Rzucasz jeszcze raz");
                            }

                        }

                    } else System.out.println("Rzucasz jeszcze raz");
                }else {
                    polePionkaDoruchu = scanner.nextInt();
                    if (mechanikaPlanszy[polePionkaDoruchu] == 'a') {// sprawdz czy na polu jest pionek a
                        for (int i = 0; i < tabPionekA.length; i++) { // wyszukuje pionjka
                            if (tabPionekA[i][1] == polePionkaDoruchu) {// wybiera pionika który mas sie ruszyć
                                if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'x' ){
                                    tabPionekA[i][1] = polePionkaDoruchu + wynik;
                                    tabPionekA[i][0] += wynik;
                                    if(tabPionekA[i][0] >40){
                                        tabPionekA[i][1] = - 2;
                                        tabPionekA[i][0] += wynik;
                                        pionkiWygraneA ++;
                                    }
                                }else if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'a' ){
                                    wynik+=1;
                                    tabPionekA[i][1] = polePionkaDoruchu + wynik ;
                                    tabPionekA[i][0] += wynik;
                                    if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'b'){
                                        for (int j = 0; j < tabPionekB.length; j++) {
                                            if (tabPionekB[j][1] == polePionkaDoruchu + wynik){
                                                tabPionekB[j][0] =0;
                                                tabPionekB[j][1] =-1;

                                            }
                                        }
                                    }
                                    if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'c'){
                                        for (int j = 0; j < tabPionekC.length; j++) {
                                            if (tabPionekC[j][1] == polePionkaDoruchu + wynik){
                                                tabPionekC[j][0] =0;
                                                tabPionekC[j][1] =-1;

                                            }
                                        }
                                    }
                                    if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'd'){
                                        for (int j = 0; j < tabPionekD.length; j++) {
                                            if (tabPionekD[j][1] == polePionkaDoruchu + wynik){
                                                tabPionekD[j][0] =0;
                                                tabPionekD[j][1] =-1;

                                            }
                                        }
                                    }


                                }else if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'b'){
                                    if(tabPionekA[i][1] + wynik == 10){
                                        tabPionekA[i][1] = polePionkaDoruchu + wynik +1 ;
                                        tabPionekA[i][0] += wynik+1;
                                        if(mechanikaPlanszy[tabPionekA[i][1]] == 'b'){
                                            for (int j = 0; j < tabPionekB.length; j++) {
                                                if (tabPionekB[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekB[j][0] =0;
                                                    tabPionekB[j][1] =-1;

                                                }
                                            }
                                        }//
                                    }else{
                                        tabPionekA[i][1] = polePionkaDoruchu + wynik ;
                                        tabPionekA[i][0] += wynik;
                                        if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'b'){
                                            for (int j = 0; j < tabPionekB.length; j++) {
                                                if (tabPionekB[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekB[j][0] =0;
                                                    tabPionekB[j][1] =-1;

                                                }
                                            }
                                        }

                                    }

                                }else if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'c'){
                                    if(tabPionekA[i][1] + wynik == 20){
                                        tabPionekA[i][1] = polePionkaDoruchu + wynik +1 ;
                                        tabPionekA[i][0] += wynik+1;
                                        if(mechanikaPlanszy[tabPionekA[i][1]] == 'c'){
                                            for (int j = 0; j < tabPionekC.length; j++) {
                                                if (tabPionekC[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekC[j][0] =0;
                                                    tabPionekC[j][1] =-1;

                                                }
                                            }
                                        }//
                                    }else{
                                        tabPionekA[i][1] = polePionkaDoruchu + wynik ;
                                        tabPionekA[i][0] += wynik;
                                        if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'c'){
                                            for (int j = 0; j < tabPionekC.length; j++) {
                                                if (tabPionekC[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekC[j][0] =0;
                                                    tabPionekC[j][1] =-1;

                                                }
                                            }
                                        }

                                    }

                                }else if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'd'){
                                    if(tabPionekA[i][1] + wynik == 30){
                                        tabPionekA[i][1] = polePionkaDoruchu + wynik +1 ;
                                        tabPionekA[i][0] += wynik+1;
                                        if(mechanikaPlanszy[tabPionekA[i][1]] == 'd'){
                                            for (int j = 0; j < tabPionekD.length; j++) {
                                                if (tabPionekD[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekD[j][0] =0;
                                                    tabPionekD[j][1] =-1;

                                                }
                                            }
                                        }//
                                    }else{
                                        tabPionekA[i][1] = polePionkaDoruchu + wynik ;
                                        tabPionekA[i][0] += wynik;
                                        if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'd'){
                                            for (int j = 0; j < tabPionekD.length; j++) {
                                                if (tabPionekD[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekD[j][0] =0;
                                                    tabPionekD[j][1] =-1;

                                                }
                                            }
                                        }

                                    }

                                }

                            }
                        } runda++;
                        wynik =0;

                    } else
                        System.out.println("Wybierz pole jeszcze raz");
                    wynik =0;

                }
            }

            while(runda == 2) {

                odswierzMechanikePlanszy();
                System.out.println();
                System.out.println("Gracz B");
                kostka = rzutKostką();
                System.out.println("Wyrzucono " + kostka);
                wynik += kostka;
                System.out.println("W sumie do przesuniecia się jest: " + wynik);

                if (wynik == 6) {
                    int zmienna = 4;
                    for (int i = 0; i < tabPionekB.length; i++) {
                        if (tabPionekB[i][1] == -1) {
                            zmienna = i;
                            break;
                        }
                    }
                    if (zmienna < 4) {
                        if (mechanikaPlanszy[10] != 'b') {
                            System.out.println("Wybierz czy chcesz wystawić pionka czy ruszać sie wystawionym");
                            System.out.println("Czy wystwaic pionek ?");
                            System.out.println("Wcisnij jeden by wystawić, lub 2 by ruszyć sie innym pionkiem");
                            polePionkaDoruchu = scanner.nextInt();
                            if (polePionkaDoruchu == 1) {
                                tabPionekB[zmienna][1] = 10;
                                if(mechanikaPlanszy[10] == 'a'){
                                    for (int j = 0; j < tabPionekA.length; j++) {
                                        if (tabPionekA[j][1] == 0){
                                            tabPionekA[j][0] =0;
                                            tabPionekA[j][1] =-1;

                                        }
                                    }

                                }if(mechanikaPlanszy[10] == 'c'){
                                    for (int j = 0; j < tabPionekC.length; j++) {
                                        if (tabPionekC[j][1] == 0){
                                            tabPionekC[j][0] =0;
                                            tabPionekC[j][1] =-1;

                                        }
                                    }

                                }if(mechanikaPlanszy[10] == 'd'){
                                    for (int j = 0; j < tabPionekD.length; j++) {
                                        if (tabPionekD[j][1] == 0){
                                            tabPionekD[j][0] =0;
                                            tabPionekD[j][1] =-1;

                                        }
                                    }

                                }
                                runda++;
                                wynik=0;

                            }else{
                                System.out.println("Rzucasz jeszcze raz");
                            }

                        }

                    } else System.out.println("Rzucasz jeszcze raz");
                }else {
                    polePionkaDoruchu = scanner.nextInt();
                    if (mechanikaPlanszy[polePionkaDoruchu] == 'b') {// sprawdz czy na polu jest pionek a
                        for (int i = 0; i < tabPionekB.length; i++) { // wyszukuje pionjka
                            if (tabPionekB[i][1] == polePionkaDoruchu) {// wybiera pionika który mas sie ruszyć
                                if(mechanikaPlanszy[tabPionekB[i][1] + wynik] == 'x' ){
                                    tabPionekB[i][1] = polePionkaDoruchu + wynik;
                                    tabPionekB[i][0] += wynik;
                                    if(tabPionekB[i][0] >40){
                                        tabPionekB[i][1] = - 2;
                                        tabPionekB[i][0] += wynik;
                                        pionkiWygraneB ++;
                                    }
                                }else if(mechanikaPlanszy[tabPionekB[i][1] + wynik] == 'b' ){
                                    wynik+=1;
                                    tabPionekB[i][1] = polePionkaDoruchu + wynik ;
                                    tabPionekB[i][0] += wynik;
                                    if(mechanikaPlanszy[tabPionekB[i][1] + wynik] == 'a'){
                                        for (int j = 0; j < tabPionekA.length; j++) {
                                            if (tabPionekA[j][1] == polePionkaDoruchu + wynik){
                                                tabPionekA[j][0] =0;
                                                tabPionekA[j][1] =-1;

                                            }
                                        }
                                    }
                                    if(mechanikaPlanszy[tabPionekB[i][1] + wynik] == 'c'){
                                        for (int j = 0; j < tabPionekC.length; j++) {
                                            if (tabPionekC[j][1] == polePionkaDoruchu + wynik){
                                                tabPionekC[j][0] =0;
                                                tabPionekC[j][1] =-1;

                                            }
                                        }
                                    }
                                    if(mechanikaPlanszy[tabPionekB[i][1] + wynik] == 'd'){
                                        for (int j = 0; j < tabPionekD.length; j++) {
                                            if (tabPionekD[j][1] == polePionkaDoruchu + wynik){
                                                tabPionekD[j][0] =0;
                                                tabPionekD[j][1] =-1;

                                            }
                                        }
                                    }


                                }else if(mechanikaPlanszy[tabPionekB[i][1] + wynik] == 'a'){
                                    if(tabPionekB[i][1] + wynik == 0){
                                        tabPionekB[i][1] = polePionkaDoruchu + wynik+1 ;
                                        tabPionekB[i][0] += wynik+1;
                                        if(mechanikaPlanszy[tabPionekB[i][1]] == 'a'){
                                            for (int j = 0; j < tabPionekA.length; j++) {
                                                if (tabPionekA[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekA[j][0] =0;
                                                    tabPionekA[j][1] =-1;

                                                }
                                            }
                                        }//
                                         if(mechanikaPlanszy[tabPionekB[i][1]] == 'c'){
                                        for (int j = 0; j < tabPionekA.length; j++) {
                                            if (tabPionekC[j][1] == polePionkaDoruchu + wynik){
                                                tabPionekC[j][0] =0;
                                                tabPionekC[j][1] =-1;

                                            }
                                        }
                                    }if(mechanikaPlanszy[tabPionekB[i][1]] == 'd'){
                                            for (int j = 0; j < tabPionekA.length; j++) {
                                                if (tabPionekD[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekD[j][0] =0;
                                                    tabPionekD[j][1] =-1;

                                                }
                                            }
                                        }
                                    }else{
                                        tabPionekB[i][1] = polePionkaDoruchu + wynik ;
                                        tabPionekB[i][0] += wynik;
                                        if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'a'){
                                            for (int j = 0; j < tabPionekB.length; j++) {
                                                if (tabPionekA[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekA[j][0] =0;
                                                    tabPionekA[j][1] =-1;

                                                }
                                            }
                                        }
                                    }
                                }else if(mechanikaPlanszy[tabPionekB[i][1] + wynik] == 'c'){
                                    if(tabPionekB[i][1] + wynik == 20){
                                        tabPionekB[i][1] = polePionkaDoruchu + wynik+1 ;
                                        tabPionekB[i][0] += wynik+1;
                                        if(mechanikaPlanszy[tabPionekB[i][1]] == 'c'){
                                            for (int j = 0; j < tabPionekC.length; j++) {
                                                if (tabPionekC[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekC[j][0] =0;
                                                    tabPionekC[j][1] =-1;

                                                }
                                            }
                                        }
                                        if(mechanikaPlanszy[tabPionekB[i][1]] == 'a'){
                                            for (int j = 0; j < tabPionekA.length; j++) {
                                                if (tabPionekA[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekA[j][0] =0;
                                                    tabPionekA[j][1] =-1;

                                                }
                                            }
                                        }
                                        if(mechanikaPlanszy[tabPionekB[i][1]] == 'd'){
                                            for (int j = 0; j < tabPionekD.length; j++) {
                                                if (tabPionekD[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekD[j][0] =0;
                                                    tabPionekD[j][1] =-1;

                                                }
                                            }
                                        }
                                    }else{
                                        tabPionekB[i][1] = polePionkaDoruchu + wynik ;
                                        tabPionekB[i][0] += wynik;
                                        if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'c'){
                                            for (int j = 0; j < tabPionekB.length; j++) {
                                                if (tabPionekC[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekC[j][0] =0;
                                                    tabPionekC[j][1] =-1;

                                                }
                                            }
                                        }
                                    }
                                }else if(mechanikaPlanszy[tabPionekB[i][1] + wynik] == 'd'){
                                    if(tabPionekB[i][1] + wynik == 30){
                                        tabPionekB[i][1] = polePionkaDoruchu + wynik+1 ;
                                        tabPionekB[i][0] += wynik+1;
                                        if(mechanikaPlanszy[tabPionekB[i][1]] == 'c'){
                                            for (int j = 0; j < tabPionekC.length; j++) {
                                                if (tabPionekC[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekC[j][0] =0;
                                                    tabPionekC[j][1] =-1;

                                                }
                                            }
                                        }
                                        if(mechanikaPlanszy[tabPionekB[i][1]] == 'a'){
                                            for (int j = 0; j < tabPionekA.length; j++) {
                                                if (tabPionekA[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekA[j][0] =0;
                                                    tabPionekA[j][1] =-1;

                                                }
                                            }
                                        }
                                        if(mechanikaPlanszy[tabPionekB[i][1]] == 'd'){
                                            for (int j = 0; j < tabPionekD.length; j++) {
                                                if (tabPionekD[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekD[j][0] =0;
                                                    tabPionekD[j][1] =-1;

                                                }
                                            }
                                        }
                                    }else{
                                        tabPionekB[i][1] = polePionkaDoruchu + wynik ;
                                        tabPionekB[i][0] += wynik;
                                        if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'c'){
                                            for (int j = 0; j < tabPionekB.length; j++) {
                                                if (tabPionekC[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekC[j][0] =0;
                                                    tabPionekC[j][1] =-1;

                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }  runda++;
                        wynik=0;

                    } else
                        System.out.println("Wybierz pole jeszcze raz");
                    wynik =0;

                }

            }
            while(runda == 3) {

                odswierzMechanikePlanszy();
                System.out.println();
                System.out.println("Gracz C");
                kostka = rzutKostką();
                System.out.println("Wyrzucono " + kostka);
                wynik += kostka;
                System.out.println("W sumie do przesuniecia się jest: " + wynik);

                if (wynik == 6) {
                    int zmienna = 4;
                    for (int i = 0; i < tabPionekC.length; i++) {
                        if (tabPionekC[i][1] == -1) {
                            zmienna = i;
                            break;
                        }
                    }
                    if (zmienna < 4) {
                        if (mechanikaPlanszy[20] != 'c') {
                            System.out.println("Wybierz czy chcesz wystawić pionka czy ruszać sie wystawionym");
                            System.out.println("Czy wystwaic pionek ?");
                            System.out.println("Wcisnij jeden by wystawić, lub 2 by ruszyć sie innym pionkiem");
                            polePionkaDoruchu = scanner.nextInt();
                            if (polePionkaDoruchu == 1) {
                                tabPionekB[zmienna][1] = 20;
                                if(mechanikaPlanszy[20] == 'a'){
                                    for (int j = 0; j < tabPionekA.length; j++) {
                                        if (tabPionekA[j][1] == 0){
                                            tabPionekA[j][0] =0;
                                            tabPionekA[j][1] =-1;

                                        }
                                    }

                                }if(mechanikaPlanszy[20] == 'b'){
                                    for (int j = 0; j < tabPionekB.length; j++) {
                                        if (tabPionekB[j][1] == 0){
                                            tabPionekB[j][0] =0;
                                            tabPionekB[j][1] =-1;

                                        }
                                    }

                                }if(mechanikaPlanszy[20] == 'd'){
                                    for (int j = 0; j < tabPionekD.length; j++) {
                                        if (tabPionekD[j][1] == 0){
                                            tabPionekD[j][0] =0;
                                            tabPionekD[j][1] =-1;

                                        }
                                    }

                                }
                                runda ++;
                                wynik=0;

                            }else{
                                System.out.println("Rzucasz jeszcze raz");
                            }

                        }

                    } else System.out.println("Rzucasz jeszcze raz");
                }else {
                    polePionkaDoruchu = scanner.nextInt();
                    if (mechanikaPlanszy[polePionkaDoruchu] == 'c') {// sprawdz czy na polu jest pionek a
                        for (int i = 0; i < tabPionekC.length; i++) { // wyszukuje pionjka
                            if (tabPionekC[i][1] == polePionkaDoruchu) {// wybiera pionika który mas sie ruszyć
                                if(mechanikaPlanszy[tabPionekC[i][1] + wynik] == 'x' ){
                                    tabPionekC[i][1] = polePionkaDoruchu + wynik;
                                    tabPionekC[i][0] += wynik;
                                    if(tabPionekC[i][0] >40){
                                        tabPionekC[i][1] = - 2;
                                        tabPionekC[i][0] += wynik;
                                        pionkiWygraneC ++;
                                    }
                                }else if(mechanikaPlanszy[tabPionekC[i][1] + wynik] == 'c' ){
                                    wynik+=1;
                                    tabPionekC[i][1] = polePionkaDoruchu + wynik ;
                                    tabPionekC[i][0] += wynik;
                                    if(mechanikaPlanszy[tabPionekC[i][1] + wynik] == 'a'){
                                        for (int j = 0; j < tabPionekA.length; j++) {
                                            if (tabPionekA[j][1] == polePionkaDoruchu + wynik){
                                                tabPionekA[j][0] =0;
                                                tabPionekA[j][1] =-1;

                                            }
                                        }
                                    }
                                    if(mechanikaPlanszy[tabPionekC[i][1] + wynik] == 'b'){
                                        for (int j = 0; j < tabPionekA.length; j++) {
                                            if (tabPionekB[j][1] == polePionkaDoruchu + wynik){
                                                tabPionekB[j][0] =0;
                                                tabPionekB[j][1] =-1;

                                            }
                                        }
                                    }
                                    if(mechanikaPlanszy[tabPionekC[i][1] + wynik] == 'd'){
                                        for (int j = 0; j < tabPionekA.length; j++) {
                                            if (tabPionekD[j][1] == polePionkaDoruchu + wynik){
                                                tabPionekD[j][0] =0;
                                                tabPionekD[j][1] =-1;

                                            }
                                        }
                                    }


                                }else if(mechanikaPlanszy[tabPionekC[i][1] + wynik] == 'a'){
                                    if(tabPionekC[i][1] + wynik == 0){
                                        tabPionekC[i][1] = polePionkaDoruchu + wynik+1 ;
                                        tabPionekC[i][0] += wynik+1;
                                        if(mechanikaPlanszy[tabPionekC[i][1] + wynik] == 'a'){
                                            for (int j = 0; j < tabPionekA.length; j++) {
                                                if (tabPionekA[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekA[j][0] =0;
                                                    tabPionekA[j][1] =-1;

                                                }
                                            }
                                        }
                                        if(mechanikaPlanszy[tabPionekC[i][1] + wynik] == 'b'){
                                            for (int j = 0; j < tabPionekA.length; j++) {
                                                if (tabPionekB[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekB[j][0] =0;
                                                    tabPionekB[j][1] =-1;

                                                }
                                            }
                                        }
                                        if(mechanikaPlanszy[tabPionekC[i][1] + wynik] == 'd'){
                                            for (int j = 0; j < tabPionekA.length; j++) {
                                                if (tabPionekD[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekD[j][0] =0;
                                                    tabPionekD[j][1] =-1;

                                                }
                                            }
                                        }
                                    }else{
                                        tabPionekC[i][1] = polePionkaDoruchu + wynik ;
                                        tabPionekC[i][0] += wynik;
                                        if(mechanikaPlanszy[tabPionekA[i][1] + wynik] == 'a'){
                                            for (int j = 0; j < tabPionekA.length; j++) {
                                                if (tabPionekA[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekA[j][0] =0;
                                                    tabPionekA[j][1] =-1;

                                                }
                                            }
                                        }
                                    }
                                }else if(mechanikaPlanszy[tabPionekC[i][1] + wynik] == 'b'){
                                    if(tabPionekC[i][1] + wynik == 20){
                                        tabPionekC[i][1] = polePionkaDoruchu + wynik+1 ;
                                        tabPionekC[i][0] += wynik+1;
                                        if(mechanikaPlanszy[tabPionekC[i][1] + wynik] == 'a'){
                                            for (int j = 0; j < tabPionekA.length; j++) {
                                                if (tabPionekA[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekA[j][0] =0;
                                                    tabPionekA[j][1] =-1;

                                                }
                                            }
                                        }
                                        if(mechanikaPlanszy[tabPionekC[i][1] + wynik] == 'b'){
                                            for (int j = 0; j < tabPionekA.length; j++) {
                                                if (tabPionekB[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekB[j][0] =0;
                                                    tabPionekB[j][1] =-1;

                                                }
                                            }
                                        }
                                        if(mechanikaPlanszy[tabPionekC[i][1] + wynik] == 'd'){
                                            for (int j = 0; j < tabPionekA.length; j++) {
                                                if (tabPionekD[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekD[j][0] =0;
                                                    tabPionekD[j][1] =-1;

                                                }
                                            }
                                        }
                                    }else{
                                        tabPionekC[i][1] = polePionkaDoruchu + wynik ;
                                        tabPionekC[i][0] += wynik;
                                        if(mechanikaPlanszy[tabPionekC[i][1] + wynik] == 'b'){
                                            for (int j = 0; j < tabPionekC.length; j++) {
                                                if (tabPionekB[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekB[j][0] =0;
                                                    tabPionekB[j][1] =-1;

                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }  runda++;
                        wynik=0;

                    } else
                        System.out.println("Wybierz pole jeszcze raz");
                    wynik =0;

                }

            }
            while(runda == 4) {

                odswierzMechanikePlanszy();
                System.out.println();
                System.out.println("Gracz D");
                kostka = rzutKostką();
                System.out.println("Wyrzucono " + kostka);
                wynik += kostka;
                System.out.println("W sumie do przesuniecia się jest: " + wynik);

                if (wynik == 6) {
                    int zmienna = 4;
                    for (int i = 0; i < tabPionekD.length; i++) {
                        if (tabPionekD[i][1] == -1) {
                            zmienna = i;
                            break;
                        }
                    }
                    if (zmienna < 4) {
                        if (mechanikaPlanszy[30] != 'd') {
                            System.out.println("Wybierz czy chcesz wystawić pionka czy ruszać sie wystawionym");
                            System.out.println("Czy wystwaic pionek ?");
                            System.out.println("Wcisnij jeden by wystawić, lub 2 by ruszyć sie innym pionkiem");
                            polePionkaDoruchu = scanner.nextInt();
                            if (polePionkaDoruchu == 1) {
                                tabPionekD[zmienna][1] = 20; //poprawC
                                if(mechanikaPlanszy[20] == 'a'){
                                    for (int j = 0; j < tabPionekA.length; j++) {
                                        if (tabPionekA[j][1] == 0){
                                            tabPionekA[j][0] =0;
                                            tabPionekA[j][1] =-1;

                                        }
                                    }

                                }if(mechanikaPlanszy[20] == 'b'){
                                    for (int j = 0; j < tabPionekB.length; j++) {
                                        if (tabPionekB[j][1] == 0){
                                            tabPionekB[j][0] =0;
                                            tabPionekB[j][1] =-1;

                                        }
                                    }

                                }if(mechanikaPlanszy[20] == 'c'){
                                    for (int j = 0; j < tabPionekD.length; j++) {
                                        if (tabPionekC[j][1] == 0){
                                            tabPionekC[j][0] =0;
                                            tabPionekC[j][1] =-1;

                                        }
                                    }

                                }
                                runda =1;
                                wynik=0;

                            }else{
                                System.out.println("Rzucasz jeszcze raz");
                            }

                        }

                    } else System.out.println("Rzucasz jeszcze raz");
                }else {
                    polePionkaDoruchu = scanner.nextInt();
                    if (mechanikaPlanszy[polePionkaDoruchu] == 'd') {// sprawdz czy na polu jest pionek a
                        for (int i = 0; i < tabPionekD.length; i++) { // wyszukuje pionjka
                            if (tabPionekD[i][1] == polePionkaDoruchu) {// wybiera pionika który mas sie ruszyć
                                if(mechanikaPlanszy[tabPionekD[i][1] + wynik] == 'x' ){
                                    tabPionekD[i][1] = polePionkaDoruchu + wynik;
                                    tabPionekD[i][0] += wynik;
                                    if(tabPionekD[i][0] >40){
                                        tabPionekD[i][1] = - 2;
                                        tabPionekD[i][0] += wynik;
                                        pionkiWygraneD ++;
                                    }
                                }else if(mechanikaPlanszy[tabPionekD[i][1] + wynik] == 'c' ){
                                    wynik+=1;
                                    tabPionekD[i][1] = polePionkaDoruchu + wynik ;
                                    tabPionekD[i][0] += wynik;
                                    if(mechanikaPlanszy[tabPionekD[i][1] + wynik] == 'a'){
                                        for (int j = 0; j < tabPionekA.length; j++) {
                                            if (tabPionekA[j][1] == polePionkaDoruchu + wynik){
                                                tabPionekA[j][0] =0;
                                                tabPionekA[j][1] =-1;

                                            }
                                        }
                                    }
                                    if(mechanikaPlanszy[tabPionekD[i][1] + wynik] == 'b'){
                                        for (int j = 0; j < tabPionekA.length; j++) {
                                            if (tabPionekB[j][1] == polePionkaDoruchu + wynik){
                                                tabPionekB[j][0] =0;
                                                tabPionekB[j][1] =-1;

                                            }
                                        }
                                    }
                                    if(mechanikaPlanszy[tabPionekD[i][1] + wynik] == 'c'){
                                        for (int j = 0; j < tabPionekC.length; j++) {
                                            if (tabPionekC[j][1] == polePionkaDoruchu + wynik){
                                                tabPionekC[j][0] =0;
                                                tabPionekC[j][1] =-1;

                                            }
                                        }
                                    }


                                }else if(mechanikaPlanszy[tabPionekD[i][1] + wynik] == 'a'){
                                    if(tabPionekC[i][1] + wynik == 0){
                                        tabPionekC[i][1] = polePionkaDoruchu + wynik+1 ;
                                        tabPionekC[i][0] += wynik+1;
                                        if(mechanikaPlanszy[tabPionekC[i][1] + wynik] == 'a'){
                                            for (int j = 0; j < tabPionekA.length; j++) {
                                                if (tabPionekA[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekA[j][0] =0;
                                                    tabPionekA[j][1] =-1;

                                                }
                                            }
                                        }
                                        if(mechanikaPlanszy[tabPionekD[i][1] + wynik] == 'b'){
                                            for (int j = 0; j < tabPionekA.length; j++) {
                                                if (tabPionekB[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekB[j][0] =0;
                                                    tabPionekB[j][1] =-1;

                                                }
                                            }
                                        }
                                        if(mechanikaPlanszy[tabPionekD[i][1] + wynik] == 'c'){
                                            for (int j = 0; j < tabPionekA.length; j++) {
                                                if (tabPionekC[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekC[j][0] =0;
                                                    tabPionekC[j][1] =-1;

                                                }
                                            }
                                        }
                                    }else{
                                        tabPionekC[i][1] = polePionkaDoruchu + wynik ;
                                        tabPionekC[i][0] += wynik;
                                        if(mechanikaPlanszy[tabPionekD[i][1] + wynik] == 'a'){
                                            for (int j = 0; j < tabPionekA.length; j++) {
                                                if (tabPionekA[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekA[j][0] =0;
                                                    tabPionekA[j][1] =-1;

                                                }
                                            }
                                        }
                                    }
                                }else if(mechanikaPlanszy[tabPionekD[i][1] + wynik] == 'b'){
                                    if(tabPionekC[i][1] + wynik == 20){
                                        tabPionekC[i][1] = polePionkaDoruchu + wynik+1 ;
                                        tabPionekC[i][0] += wynik+1;
                                        if(mechanikaPlanszy[tabPionekC[i][1] + wynik] == 'a'){
                                            for (int j = 0; j < tabPionekA.length; j++) {
                                                if (tabPionekA[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekA[j][0] =0;
                                                    tabPionekA[j][1] =-1;

                                                }
                                            }
                                        }
                                        if(mechanikaPlanszy[tabPionekD[i][1] + wynik] == 'b'){
                                            for (int j = 0; j < tabPionekA.length; j++) {
                                                if (tabPionekB[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekB[j][0] =0;
                                                    tabPionekB[j][1] =-1;

                                                }
                                            }
                                        }
                                        if(mechanikaPlanszy[tabPionekD[i][1] + wynik] == 'c'){
                                            for (int j = 0; j < tabPionekA.length; j++) {
                                                if (tabPionekC[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekC[j][0] =0;
                                                    tabPionekC[j][1] =-1;

                                                }
                                            }
                                        }
                                    }else{
                                        tabPionekD[i][1] = polePionkaDoruchu + wynik ;
                                        tabPionekD[i][0] += wynik;
                                        if(mechanikaPlanszy[tabPionekD[i][1] + wynik] == 'b'){
                                            for (int j = 0; j < tabPionekD.length; j++) {
                                                if (tabPionekB[j][1] == polePionkaDoruchu + wynik){
                                                    tabPionekB[j][0] =0;
                                                    tabPionekB[j][1] =-1;

                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }  runda =1;
                        wynik=0;

                    } else
                        System.out.println("Wybierz pole jeszcze raz");
                    wynik =0;

                }

            }

        }
        if(pionkiWygraneA == 4 ){
            System.out.println("Wygral gracz a");
        }
        if(pionkiWygraneB == 4 ){
            System.out.println("Wygral gracz b");
        }
        if(pionkiWygraneC == 4 ){
            System.out.println("Wygral gracz b");
        }
        if(pionkiWygraneD == 4 ){
            System.out.println("Wygral gracz b");
        }

    }


}














