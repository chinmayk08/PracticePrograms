package prctice;

public class contructor {

    contructor(){

        System.out.println("defualt con");
        }

    contructor(String title, String Author){
            System.out.println("title:"+ title+ ", Author:"+Author );

        }
    contructor(String title, String Author, String Price){
        System.out.println("title: "+ title+ ", Author: "+Author + "Price: "+Price);

    }

    public static void main(String[] args) {
        contructor ab=new contructor("mr","chinmay");

    }

}

