import java.util.*;

class Blueprint{
    int bedroom,washroom,hall,playground,dining,kitchen;
    void bedroom(int bedroom){
        this.bedroom=bedroom;
    }
    void washroom(int washroom){
        this.washroom=washroom;
    }
    void hall(int hall){
        this.hall=hall;
    }
    Blueprint(int n){
        playground=1;
        kitchen=1;
        dining=1;
        if(n==1){
            bedroom(1);
            washroom(1);
            hall(1);
        }
        if(n==2){
            bedroom(2);
            washroom(2);
            hall(2);
        }
        if(n==3){
            bedroom(3);
            washroom(3);
            hall(3);
        }
    }
    
    void display(){
        System.out.println("bed rooms: "+bedroom);
        if(washroom==1){
            System.out.println("washrooms "+washroom+" public");
        }
        else System.out.println("washrooms "+washroom+" attached");
        if(hall==1) System.out.println("common hall "+hall);
        else System.out.println("each and every 2 bedroom has "+hall+" halls");
        System.out.println("common kitchen "+kitchen);
        System.out.println("common dining "+dining);
        System.out.println("common playground "+playground);
    }
}
public class Apartments {
    public static void main(String[] args){
       Blueprint bp=new Blueprint(2);
       bp.display();;
    }
}