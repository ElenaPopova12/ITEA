class Tree {
    public static void main(String[] args) {
        for (int y = 1; y <= 5; y++) {
            for (int x = 1; x <= y; x++) {
                System.out.print('x');
            }
            System.out.println();
        }
        for (int i = 5; i >= 0; i--) {
            for (int a = 0; a < i; a++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}