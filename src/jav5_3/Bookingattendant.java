package jav5_3;

import java.util.ArrayList;
import java.util.List;

//REZERVASYON GOREVLISI
public class Bookingattendant extends Customer {



    public void ChangeRezervation(){ //rezervasyon değiştirme
        System.out.println("Rezervasyon değiştirildi");
    }


    public void CancelRezervation(int CustomerIndex){  //rezervasyon iptal etme
        CustomerList.remove(CustomerIndex);
        System.out.println("Rezervasyon iptal edildi");
    }

    public void FindRezervation(String CustomerName){ //boş rezervasyon yeri bulma
        System.out.println("index "+CustomerList.size()+" Booking için müsait");
    }

}
