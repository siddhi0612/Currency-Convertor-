package convertor;
import java.util.*;
import java.text.DecimalFormat;

public class CurrencyConverter
{
    public static void main(String[] args) 
        {
            double rs = 0.00, dollar = 0.00, euro = 0.00, currency, convert, krw = 0.00, yen = 0.00;
            DecimalFormat f = new DecimalFormat("##.###");
            try (Scanner sc = new Scanner(System.in)) {
				System.out.println("*****CURRENCY CONVERTER*****");
				System.out.println("Enter 1: Indian Rupee (RS)");
				System.out.println("Enter 2: United State Dollar (USD)");
				System.out.println("Enter 3: Euro (EU)");
				System.out.println("Enter 4: South Korean Won (KRW)");
				System.out.println("Enter 5: Japnese Yen (YEN)");
				System.out.println("\n");
				System.out.println("Enter the Currency :");
				currency=sc.nextInt();
				
				//RS CONVERTED TO ANOTHER CURRENCY
				if(currency == 1)
				{
				    System.out.println("Enter amount in Rupee:");
				    rs = sc.nextFloat();
				    
				    System.out.println("\n");
				    
				     System.out.println("To be Converted to :");
				     System.out.println("Enter 1: United State Dollar (USD)");
				     System.out.println("Enter 2: Euro (EU)");
				     System.out.println("Enter 3: South Korean Won (KRW)");
				     System.out.println("Enter 4: Japnese Yen (YEN)");
				     System.out.println("\n");
				     System.out.println("Enter the Converter :");
				     convert=sc.nextInt();
				    
				    System.out.println("\n");
				    
				    if(convert == 1)
				    {
				    dollar = rs * 0.012;
				    System.out.println("US Dollar : "+f.format(dollar) + "dolar");
				    }
				    
				    else if(convert == 2)
				    {
				    euro = rs * 0.011;
				    System.out.println("Euro : "+f.format(euro) + "euro");
				    }
				    
				    else if(convert == 3)
				    {
				    krw = rs * 16.58;
				    System.out.println("KRW : "+f.format(krw) + "won");
				    }
				    
				    else if(convert == 4)
				    {
				    yen = rs * 1.84;
				    System.out.println("/nYEN : "+f.format(yen) + "yen");
				    }
				    
				    else
				    System.out.println("Invalid Converter!!");
				}
         
         //DOLLAR CONVERTED TO ANOTHER CURRENCY
				else if (currency == 2)
				{
				    System.out.println("Enter amount in US Dollar:");
				    dollar = sc.nextFloat();
				    
				    System.out.println("\n");
				    
				     System.out.println("To be Converted to :");
				     System.out.println("Enter 1: Indian Rupee (RS)");
				     System.out.println("Enter 2: Euro (EU)");
				     System.out.println("Enter 3: South Korean Won (KRW)");
				     System.out.println("Enter 4: Japnese Yen (YEN)");
				     System.out.println("\n");
				     System.out.println("Enter the Converter :");
				     convert=sc.nextInt();
				    
				    System.out.println("\n");
				    
				    if(convert == 1)
				    {
				    rs = dollar * 84.41;
				    System.out.println("Indian Rupee : "+f.format(rs) + "rupee");
				    }
				    
				    else if(convert == 2)
				    {
				    euro = dollar * 0.87;
				    System.out.println("Euro : "+f.format(euro) + "euro");
				    }
				    
				    else if(convert == 3)
				    {
				    krw = dollar * 1398.79;
				    System.out.println("KRW : "+f.format(krw) + "won");
				    }
				    
				    else if(convert == 4)
				    {
				    yen = dollar * 154.99;
				    System.out.println("YEN : "+f.format(yen) + "yen");
				    }
				    
				    else
				    System.out.println("Invalid Converter!!");
				}
        
        //EURO CONVERTED TO ANOTHER CURRENCY
				else if(currency == 3)
				{
				    System.out.println("Enter amount in Euro:");
				    euro = sc.nextFloat();
				    
				    System.out.println("\n");
				    
				     System.out.println("To be Converted to :");
				     System.out.println("Enter 1: Indian Rupee (RS)");
				     System.out.println("Enter 2: United State Dollar (USD)");
				     System.out.println("Enter 3: South Korean Won (KRW)");
				     System.out.println("Enter 4: Japnese Yen (YEN)");
				     System.out.println("\n");
				     System.out.println("Enter the Converter :");
				     convert=sc.nextInt();
				    
				    System.out.println("\n");
				    
				    if(convert == 1)
				    {
				    rs = euro * 89.04;
				    System.out.println("RS : "+f.format(rs) + "rupee");
				    }
				    
				    else if(convert == 2)
				    {
				    dollar = euro * 1.05;
				    System.out.println("US Dollar : "+f.format(euro) + "euro");
				    }
				    
				    else if(convert == 3)
				    {
				    krw = euro * 1475.95;
				    System.out.println("KRW : "+f.format(krw) + "won");
				    }
				    
				    else if(convert == 4)
				    {
				    yen = euro * 163.42;
				    System.out.println("YEN : "+f.format(yen) + "yen");
				    }
				    
				    else
				    System.out.println("Invalid Converter!!");
				}
         //KRW CONVERTED TO ANOTHER CURRENCY
				else if(currency == 4)
				{
				    System.out.println("Enter amount in KRW:");
				    krw = sc.nextFloat();
				    
				     System.out.println("\n");
				     
				     System.out.println("To be Converted to :");
				     System.out.println("Enter 1: Indian Rupee (RS)");
				     System.out.println("Enter 2: United State Dollar (USD)");
				     System.out.println("Enter 3: Euro (EU)");
				     System.out.println("Enter 4: Japnese Yen (YEN)");
				     System.out.println("\n");
				     System.out.println("Enter the Converter :");
				     convert=sc.nextInt();
				     
				    System.out.println("\n");
				    
				    if(convert == 1)
				    {
				    rs = krw * 0.060;
				    System.out.println("RS : "+f.format(rs) + "rupee");
				    }
				    
				    else if(convert == 2)
				    {
				    dollar = krw * 0.00071;
				    System.out.println("Dollar : "+f.format(dollar) + "dollar");
				    }
				    
				    else if(convert == 3)
				    {
				    euro = krw * 0.00068;
				    System.out.println("Euro : "+f.format(euro) + "euro");
				    }
				    
				    else if(convert == 4)
				    {
				    yen = krw * 0.11;
				    System.out.println("YEN : "+f.format(yen) + "yen");
				    }
				   
				    else
				    System.out.println("Invalid Converter!!");
				}
        //YEN Converted to Another Currency
				else if(currency == 5)
				{
				    System.out.println("Enter amount in BHD:");
				    yen = sc.nextFloat();
				    
				    System.out.println("\n");
				    
				     System.out.println("To be Converted to :");
				     System.out.println("Enter 1: Indian Rupee (RS)");
				     System.out.println("Enter 2: United State Dollar (USD)");
				     System.out.println("Enter 3: Euro (EU)");
				     System.out.println("Enter 4: South Korean Won (KRW)");
				     System.out.println("\n");
				     System.out.println("Enter the Converter :");
				     convert=sc.nextInt();
				     
				    System.out.println("\n");
				    
				    if(convert == 1)
				    {
				    rs = yen * 0.54;
				    System.out.println("RS : "+f.format(rs) + "rupee");
				    }
				    
				    else if(convert == 2)
				    {
				    dollar = yen * 0.0065;
				    System.out.println("US Dollar : "+f.format(dollar) + "dollar");
				    }
				    
				    else if(convert == 3)
				    {
				    euro = yen * 0.061;
				    System.out.println("KRW : "+f.format(euro) + "euro");
				    }
				    
				    else if (convert == 4)
				    {
				    krw = yen * 9.02;
				    System.out.println("YEN : "+f.format(krw) + "won");
				    }
				    
				    else
				    System.out.println("Invalid Converter!!");
				}
				else
				    System.out.println("Invalid Currency!!");
			}
    }
}