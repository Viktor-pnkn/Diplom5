package scheme;


import java.io.*;
import java.util.*;

public class Scheme {
    private int x1;
    private int x2;
    private int x3;
    private int x4;
    private int x11;
    private int x22;
    private int x33;
    private int x44;
    private int notx1;
    private int notx2;
    private int notx3;
    private int notx4;
    private int notx11;
    private int notx22;
    private int notx33;
    private int notx44;

    private int x5;
    private int x55;
    private int notx5;
    private int notx55;

    private int x111;
    private int x222;
    private int x333;
    private int x444;
    private int x1111;
    private int x2222;
    private int x3333;
    private int x4444;
    private int notx111;
    private int notx222;
    private int notx333;
    private int notx444;
    private int notx1111;
    private int notx2222;
    private int notx3333;
    private int notx4444;

    private int x555;
    private int x5555;
    private int notx555;
    private int notx5555;

    public Scheme() {
        this.x1 = -2;
        this.x2 = -2;
        this.x3 = -2;
        this.x4 = -2;
        this.x11 = -2;
        this.x22 = -2;
        this.x33 = -2;
        this.x44 = -2;
        this.notx1 = -2;
        this.notx2 = -2;
        this.notx3 = -2;
        this.notx4 = -2;
        this.notx11 = -2;
        this.notx22 = -2;
        this.notx33 = -2;
        this.notx44 = -2;

        this.x5 = -2;
        this.x55 = -2;
        this.notx5 = -2;
        this.notx55 = -2;

        this.x111 = -2;
        this.x222 = -2;
        this.x333 = -2;
        this.x444 = -2;
        this.x1111 = -2;
        this.x2222 = -2;
        this.x3333 = -2;
        this.x4444 = -2;
        this.notx111 = -2;
        this.notx222 = -2;
        this.notx333 = -2;
        this.notx444 = -2;
        this.notx1111 = -2;
        this.notx2222 = -2;
        this.notx3333 = -2;
        this.notx4444 = -2;

        this.x555 = -2;
        this.x5555 = -2;
        this.notx555 = -2;
        this.notx5555 = -2;
    }

    public TreeSet<String> generateFunctions3() {
        Set<String> functions = new TreeSet<String>();
        String str = "";
        for (int i = 0; i < 3; i++) {
            if (x1 < 2) {
                x1++;
            }
            for (int j = 0; j < 3; j++) {
                if (x2 < 2) {
                    x2++;
                }
                for (int k = 0; k < 3; k++) {
                    if (x3 < 2) {
                        x3++;
                    }
                    for (int l = 0; l < 3; l++) {
                        if (notx2 < 2) {
                            notx2++;
                        }
                        for (int m = 0; m < 3; m++) {
                            if (notx3 < 2) {
                                notx3++;
                            }
                            for (int n = 0; n < 3; n++) {
                                if (notx1 < 2) {
                                    notx1++;
                                }
                                for (int o = 0; o < 3; o++) {
                                    if (x22 < 2) {
                                        x22++;
                                    }
                                    for (int p = 0; p < 3; p++) {
                                        if (notx33 < 2) {
                                            notx33++;
                                        }
                                        for (int q = 0; q < 3; q++) {
                                            if (notx22 < 2) {
                                                notx22++;
                                            }
                                            for (int r = 0; r < 3; r++) {
                                                if (x33 < 2) {
                                                    x33++;
                                                }
                                                functions.add(getFunction3());
                                            }
                                            x33 = -2;
                                        }
                                        notx22 = -2;
                                    }
                                    notx33 = -2;
                                }
                                x22 = -2;
                            }
                            notx1 = -2;
                        }
                        notx3 = -2;
                    }
                    notx2 = -2;
                }
                x3 = -2;
            }
            x2 = -2;
        }
        return (TreeSet<String>) functions;
    }

    private String getFunction3() {
        int[] function = new int[8];
        for (int i3 = 0; i3 < 2; i3++) {
            for (int i2 = 0; i2 < 2; i2++) {
                for (int i1 = 0; i1 < 2; i1++) {
                    function[i1 + i2 * 2 + i3 * 4] = getFunctionValueLeftUpper(i1, i2, i3);
                    //function[i1 + i2 * 2 + i3 * 4] = getFunctionValueRightBottom(i1, i2, i3);
                }
            }
        }
        return Arrays.toString(function);
    }


    private int getFunctionValueLeftUpper(int i1, int i2, int i3) {
        boolean x_1 = ((x1 != 0 && x1 != 1) ? (i1 == 1) : (x1 == 1));
        boolean notx_1 = ((notx1 != 0 && notx1 != 1) ? (i1 == 0) : (notx1 == 1));

        boolean x_11 = ((x11 != 0 && x11 != 1) ? (i1 == 1) : (x11 == 1));
        boolean notx_11 = ((notx11 != 0 && notx11 != 1) ? (i1 == 0) : (notx11 == 1));

        boolean x_2 = ((x2 != 0 && x2 != 1) ? (i2 == 1) : (x2 == 1));
        boolean notx_2 = ((notx2 != 0 && notx2 != 1) ? (i2 == 0) : (notx2 == 1));

        boolean x_22 = ((x22 != 0 && x22 != 1) ? (i2 == 1) : (x22 == 1));
        boolean notx_22 = ((notx22 != 0 && notx22 != 1) ? (i2 == 0) : (notx22 == 1));

        boolean x_3 = ((x3 != 0 && x3 != 1) ? (i3 == 1) : (x3 == 1));
        boolean notx_3 = ((notx3 != 0 && notx3 != 1) ? (i3 == 0) : (notx3 == 1));

        // моя сумма 3
        /*if ((x_1 && x_2 && x_3) ||
                (x_1 && notx_2 && notx_3) ||
                (notx_1 && x_22 && notx_33) ||
                (notx_1 && notx_22 && x_33)
        ) {
            return 1;
        }*/

        // конфета
        if (!((x_1 && x_2 && notx_1) ||
                (x_1 && x_2 && x_3 && x_11) ||
                (x_1 && notx_3 && notx_2 && x_11) ||
                (x_1 && notx_3 && notx_2 && x_3 && notx_1) ||


                (notx_11 && notx_2 && x_11) ||
                (notx_11 && notx_2 && x_3 && notx_1) ||
                (notx_11 && notx_3 && x_2 && notx_1) ||
                (notx_11 && notx_3 && x_2 && x_3 && x_11))) {
            return 1;
        }

        // конверт
        /*if (((x_1 && notx_1) || (x_1 && notx_2 && notx_3) || (x_1 && notx_2 && x_2 && x_11) ||
                (x_3 && notx_2 && notx_1) || (x_3 && notx_3) || (x_3 && x_2 && x_11) ||
                (notx_11 & x_11) || (notx_11 && x_2 & notx_3) || (notx_11 && x_2 && notx_2 && notx_1))) {
            return 1;
        }*/
        return 0;
    }

    private int getFunctionValueRightBottom(int i1, int i2, int i3) {
        boolean x_1 = ((x1 != 0 && x1 != 1) ? (i1 == 1) : (x1 == 1));
        boolean notx_1 = ((notx1 != 0 && notx1 != 1) ? (i1 == 0) : (notx1 == 1));

        boolean x_11 = ((x11 != 0 && x11 != 1) ? (i1 == 1) : (x11 == 1));
        boolean notx_11 = ((notx11 != 0 && notx11 != 1) ? (i1 == 0) : (notx11 == 1));

        boolean x_2 = ((x2 != 0 && x2 != 1) ? (i2 == 1) : (x2 == 1));
        boolean notx_2 = ((notx2 != 0 && notx2 != 1) ? (i2 == 0) : (notx2 == 1));

        boolean x_22 = ((x22 != 0 && x22 != 1) ? (i2 == 1) : (x22 == 1));
        boolean notx_22 = ((notx22 != 0 && notx22 != 1) ? (i2 == 0) : (notx22 == 1));

        boolean x_3 = ((x3 != 0 && x3 != 1) ? (i3 == 1) : (x3 == 1));
        boolean notx_3 = ((notx3 != 0 && notx3 != 1) ? (i3 == 0) : (notx3 == 1));


        if ((x_1 && notx_2 && x_3) ||
                (notx_1 && x_2 && x_3) ||
                (x_11 && x_22 && notx_3) ||
                (notx_11 && notx_22 && notx_3)
        ) {
            return 1;
        }
        return 0;
    }

    public TreeSet<String> andSchemes(File file1, File file2) throws IOException {
        BufferedReader bf1 = new BufferedReader(new FileReader(file1));
        BufferedReader bf2 = new BufferedReader(new FileReader(file2));
        int[][] functions1 = new int[71][8];
        int[][] functions2 = new int[11][4];
        TreeSet<String> functions = new TreeSet<>();
        String f1 = "";
        String f2 = "";
        int jg = 0;
        for (int i = 0; i < 71; i++) {
            f1 = bf1.readLine();
            int t = 1;
            for (int j = 0; j < 8; j++) {
                functions1[i][j] = Integer.parseInt(String.valueOf(f1.charAt(t)));
                t += 3;
            }
        }
        for (int i = 0; i < 11; i++) {
            f2 = bf2.readLine();
            int t = 1;
            for (int j = 0; j < 4; j++) {
                functions2[i][j] = Integer.parseInt(String.valueOf(f2.charAt(t)));
                t += 3;
            }
        }
        int[] func = new int[32];
        for (int m = 0; m < 71; m++) {
            for (int n = 0; n < 11; n++) {
                int k = 0;
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 4; j++) {
                        func[k++] = functions1[m][i] * functions2[n][j];
                    }
                }
                if (!functions.contains(Arrays.toString(func))) {
                    functions.add(Arrays.toString(func));
                    System.out.println(jg++);
                }
            }
        }
        bf1.close();
        bf2.close();
        return functions;
    }

    public TreeSet<String> orSchemes(File file1, File file2) throws IOException {
        TreeSet<String> functions = new TreeSet<String>();
        BufferedReader bf1 = new BufferedReader(new FileReader(file1));
        BufferedReader bf2 = new BufferedReader(new FileReader(file2));
        int[][] functions1 = new int[701][32];
        int[][] functions2 = new int[701][32];
        String f1 = "";
        String f2 = "";
        int t = 1;
        for (int i = 0; i < 701; i++) {
            f1 = bf1.readLine();
            t = 1;
            for (int j = 0; j < 32; j++) {
                functions1[i][j] = Integer.parseInt(String.valueOf(f1.charAt(t)));
                t += 3;
            }

        }
        for (int i = 0; i < 701; i++) {
            f2 = bf2.readLine();
            t = 1;
            for (int j = 0; j < 32; j++) {
                functions2[i][j] = Integer.parseInt(String.valueOf(f2.charAt(t)));
                t += 3;
            }
        }

        int k = 1;
        int[] func = new int[32];
        for (int m = 0; m < 701; m++) {
            for (int n = 0; n < 701; n++) {
                for (int i = 0; i < 32; i++) {
                    if ((functions1[m][i] + functions2[n][i]) == 0) {
                        func[i] = 0;
                    } else {
                        func[i] = 1;
                    }
                }
                    if (!functions.contains(Arrays.toString(func))) {
                        System.out.println(k++ + " " + m);
                        functions.add(Arrays.toString(func));
                    }
            }
        }
        bf1.close();
        bf2.close();
        return functions;
    }

}