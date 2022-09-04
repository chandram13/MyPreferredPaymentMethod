
public class evaluatePayment{
        public static void badHealth(creditLimit,debtUtilization){
        if creditLimit > creditLimit * 0.10:
            if debtUtilization > 0.30:
                return creditLimit;
                return debtUtilization;
                System.out.PrintIn("Unfortuantely, you are considered to have bad financial health on this payment.")
        }
        public static void mildHealth(creditLimit,debtUtilization){
        if creditLimit > creditLimit * 0.05:
            if debtUtilization > 0.10:
                return creditLimit;
                return debtUtilization;
                System.out.PrintIn("Currently, you have mild health. Keep up your payments to have stable or better financial health.");
        }
        public static void badHealth(creditLimit,debtUtilization){
        if creditLimit =< creditLimit * 0.10:
            if debtUtilization > 0.05:
                return creditLimit;
                return debtUtilization;
                System.out.PrintIn("Currently, you are at a good health. Good job! Maintain your payments and this will be a good payment method for you to use.");
        }
    }
