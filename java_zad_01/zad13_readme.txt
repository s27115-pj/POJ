Niestety przez małe problemy z githubem nie mogłem zacommitować zad13 w odpowiednim czasie postanowiłem je więc dodać osobno tutaj aby nie zmieniać daty 
przesłania pliku z resztą zadań 
  
public static void zad_13 (){
        Scanner scanner = new Scanner(System.in);
        int n;
        int tab[] = new int[100];
        n = scanner.nextInt();
        for (int i = 0 ; i < n;i++){
            tab[i] = scanner.nextInt();
        }
        System.out.println(getMax(tab,n));
    }


    public static int getMax(int[] tab, int n) {
        if (n == 1) {
            return tab[0];
        } else {
            int max = getMax(tab, n - 1);
            return Math.max(max,tab[n - 1]);
        }
    }
