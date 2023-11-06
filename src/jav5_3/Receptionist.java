package jav5_3;
//RESEPSIYONCU
public class Receptionist {


    public void CustomerExits(){  //müşteri çıkışı yapma fonksiyonu
        System.out.println("Müşteri çıkışı yapıldı");
    }

    public void NewReservation(){ //rezervasyon ayırma
        System.out.println("Yeni rezervasyon yapıldı");
    }

    public void ChangeRezervation(){ //rezervasyon değiştirme
        System.out.println("Rezervasyon değiştirildi");
    }


    public void CancelRezervation(int CustomerIndex){  //rezervasyon iptal etme
        System.out.println("Rezervasyon iptal edildi");
    }

    public void FindRezervation(String CustomerName){ //boş rezervasyon yeri bulma
        System.out.println("Rezervasyon bulundu");
    }
}
