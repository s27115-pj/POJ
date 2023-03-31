public class zad2_10 {
    public static class TruthTable {
        private final boolean variable1;
        private final boolean variable2;

        public TruthTable(boolean v1, boolean v2) {
            variable1 = v1;
            variable2 = v2;
        }

        public boolean getVariable1() {
            return variable1;
        }

        public boolean getVariable2() {
            return variable2;
        }

        public boolean and() {
            return variable1 && variable2;
        }

        public boolean or() {
            return variable1 || variable2;
        }

        public boolean xor() {
            return variable1 ^ variable2;
        }


    }
    public static void main(String[] args) {
        System.out.println("|  V1  |  V2  |  AND |  OR  |  XOR |");
        System.out.println("|------|------|------|------|------|");

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                TruthTable tt = new TruthTable(i == 1, j == 1);
                System.out.printf("| %4b | %4b | %4b | %4b | %4b |\n", tt.getVariable1(), tt.getVariable2(), tt.and(), tt.or(), tt.xor());
            }
        }
    }
}