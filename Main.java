// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Personal_Banking Arda = new Personal_Banking();
        Arda.customer_id = 31;
        Arda.customer_number = "1658";


        Corporate_Banking EBAY = new Corporate_Banking();
        EBAY.company_name = "eBAY LTD";  //For an example
        EBAY.corporate_customer_number = "60308";

        Syndicate_Banking Bundesrepublik_Risorgimento = new Syndicate_Banking();
        Bundesrepublik_Risorgimento.Syndicate_number = "1871";

        Customer_Registiration customerManager = new Customer_Registiration();
        customerManager.add(EBAY);
        customerManager.add(Arda);
        customerManager.add(Bundesrepublik_Risorgimento);





    }
}