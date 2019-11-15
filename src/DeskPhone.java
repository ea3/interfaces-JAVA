public class DeskPhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("DeskPhone does not have a power on button.");

    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("DeskPhone " + phoneNumber + " is ringing. ");

    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the deskPhone");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging = true;

        }else{
            isRinging = false;
        }
        return isRinging;

    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
