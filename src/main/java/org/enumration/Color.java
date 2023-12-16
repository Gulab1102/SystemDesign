package org.enumration;

public enum Color {

    RED,
    GREEN,
    BLUE,
    YELLOW
}

class  Main{

    public static void main(String[] args) {

        for(Color x: Color.values()){
            System.out.println(x.equals(Color.BLUE));
        }
    }
}


