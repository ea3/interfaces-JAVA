public class Main {
    public static void main(String [] args){
        ITelephone emiliosPhone;
        emiliosPhone= new DeskPhone(2233);
        emiliosPhone.dial(112233);
        emiliosPhone.callPhone(112233);
        emiliosPhone.answer();

        emiliosPhone = new MobilePhone(443322);
        emiliosPhone.dial(443322);
        emiliosPhone.callPhone(443322);
        emiliosPhone.answer();
    }
}
