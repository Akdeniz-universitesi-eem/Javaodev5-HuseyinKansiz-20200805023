package jav5_3;

import java.util.ArrayList;
import java.util.List;

//MUSTERI
public class Customer {
 private String CustomerName;
 private Boolean isVIP;
 private int NumberofDaystoStay;
 private int CustomerNumber;
 private int rezervationtype;
 private Boolean RezervationisCanselled=false;

    public static List<String> CustomerList = new ArrayList<>(15);   //Rezervasyonların string olarak depolandığı arraylist








    public Boolean getRezervationisCanselled() {
        return RezervationisCanselled;
    }
    public void setRezervationisCanselled(Boolean rezervationisCanselled) {
        RezervationisCanselled = rezervationisCanselled;
    }
    public int getRezervationtype() {
        return rezervationtype;
    }
    public void setRezervationtype(int rezervationtype) {
        this.rezervationtype = rezervationtype;
    }
    public int getCustomerNumber() {
        return CustomerNumber;
    }
    public void setCustomerNumber(int customerNumber) {
        CustomerNumber = customerNumber;
    }
    public String getCustomerName() {
        return CustomerName;
    }
    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }
    public Boolean getVIP() {
        return isVIP;
    }
    public void setVIP(Boolean VIP) {
        isVIP = VIP;
    }
    public int getNumberofDaystoStay() {
        return NumberofDaystoStay;
    }
    public void setNumberofDaystoStay(int numberofDaystoStay) {
        NumberofDaystoStay = numberofDaystoStay;
    }



    public void CellphoneorOnlineBooking(Boolean isCellphone){
        if(isCellphone)
        System.out.println("Müşteri rezervasyon için arıyor");
        else System.out.println("Müşteri online rezervasyon yapıyor");
    }




    Customer(){

 }
    public Customer(int CustomerNumber, String CustomerName, Boolean isVIP, int NumberofDaystoStay){
        setCustomerName(CustomerName);
        setVIP(isVIP);
        setNumberofDaystoStay(NumberofDaystoStay);
        setCustomerNumber(CustomerNumber);
        CustomerList.add(CustomerAsString());
    }


    public String CustomerAsString(){ //müşterinin bilgilerini içeren string
        return CustomerNumber+","+CustomerName+",VIPmi?="+isVIP+",KaçGünKalacak="+NumberofDaystoStay+",Rezervasyon Aktif="+!RezervationisCanselled;
    }

    public void CancelRezervation(){
        setRezervationisCanselled(true);
    }

    public void ChangeRezervation(int NumberofDaystoStay){      //müşteri bilgisi güncelleme, sadece kalınacak gün hesabı
        setNumberofDaystoStay(NumberofDaystoStay);
    }
    public void ChangeRezervation(int NumberofDaystoStay,String CustomerName){     //müşteri bilgisi güncelleme, müşteri ismi ve kalınacak gün hesabı
        setNumberofDaystoStay(NumberofDaystoStay);
        setCustomerName(CustomerName);
    }
    public void ChangeRezervation(int NumberofDaystoStay,String CustomerName,Boolean isVip,int CustomerNumber){  //müşteri bilgisi güncelleme, müşteri ismi, kalınacak gün ve müşteri numarası hesabı
        setNumberofDaystoStay(NumberofDaystoStay);
        setCustomerName(CustomerName);
        setVIP(isVip);
        setCustomerNumber(CustomerNumber);
    }



}
