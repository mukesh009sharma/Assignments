class Main {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) { 
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("1");
                }
            } else { 
                for (int j = 1; j <= i; j++) { 
                    System.out.print("0"); 
                }
            }
            System.out.println(); 
        }
    }
}
/*
1
00
111
0000
11111/
