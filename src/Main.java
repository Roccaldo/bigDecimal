import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal numb1 = BigDecimal.valueOf(10);
        BigDecimal numb2 = BigDecimal.valueOf(2);
        operations(OperationArithmeticEnum.ADDITION, numb1, numb2);
    }

    public static void operations(OperationArithmeticEnum operation, BigDecimal numb1, BigDecimal numb2) {
        //crea variabile d'appoggio per il risultato
        BigDecimal result = BigDecimal.valueOf(0);
        //controlla quale tipo di operazione si sta usando ed esegui l'operazione
        switch (operation) {
            case ADDITION:
                result = numb1.add(numb2);
                System.out.println("The addition between " + numb1 + " and " + numb2 + " is: " + result);
                break;
            case SUBTRACTION:
                result = numb1.subtract(numb2);
                System.out.println("The subtraction between " + numb1 + " and " + numb2 + " is: " + result);
                break;
            case MULTIPLICATION:
                result = numb1.multiply(numb2);
                System.out.println("The multiplication between " + numb1 + " and " + numb2 + " is: " + result);
                break;
            case DIVISION:
                result = numb1.divide(numb2);
                System.out.println("The division between " + numb1 + " and " + numb2 + " is: " + result);
                break;
            case MIN:
                result = numb1.min(numb2);
                System.out.println("The min between " + numb1 + " and " + numb2 + " is: " + result);
                break;
            case MAX:
                result = numb1.max(numb2);
                System.out.println("The max between " + numb1 + " and " + numb2 + " is: " + result);
                break;
        }
    }
}