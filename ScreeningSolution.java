package com.company;

public class ScreeningSolution {
    public String binaryReversal(String s) {
        long n = Long.parseLong(s);
        int len = length(n);
        int i = 0;
        while (i < len / 2) {
           n = swap(n, i, len - 1 - i);
           i++;
        }
        int res;
        if (n > (long)Integer.MAX_VALUE) {
            res = Integer.MAX_VALUE;
        } else if (n < (long)Integer.MIN_VALUE) {
            res = Integer.MIN_VALUE;
        } else {
            res = (int)n;
        }
        return String.valueOf(res);
    }

    private long swap(long n, int i , int j) {
        if ((n >> i & 1) == (n >> j & 1)) {
            return n;
        }
        return n ^ (1L << i) ^ (1L << j);
    }

    private int length(long n) {
        for (int i = 24; i >= 0; i -= 8) {
            if ((n >>> i & 255) != 0) {
                return i + 8;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        ScreeningSolution s = new ScreeningSolution();
//        System.out.println(s.binaryReversal("47"));
//        System.out.println(s.binaryReversal("1"));
//        System.out.println(s.binaryReversal("0"));
//        System.out.println(s.binaryReversal("3"));
        System.out.println(s.binaryReversal("1879048192"));
        System.out.println(s.binaryReversal("1879048193"));
    }
}
