package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Dog[] dogs = new Dog[]{new Taxsa(1), new Schpitz(2)};
        Dog[] var2 = dogs;
        int var3 = dogs.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            Dog Dog = var2[var4];
            System.out.println(Dog);
        }
    }
}
