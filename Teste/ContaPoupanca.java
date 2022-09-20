public class ContaPoupanca extends Conta {

    @Override
    int getFee() {
        return this.total * 2;
    }
    
    public static void main(String[] args) {
        
        System.out.println(Math.toDegrees(Math.atan((double)(-3)/4)));
        System.out.println(Math.toDegrees(Math.atan2(-3, 4)));
        System.out.println(Math.hypot(-3, 4));
        
    }
}
