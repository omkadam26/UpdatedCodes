public class CountDays {
        public static void main(String[] args) {
            int num=373;
            int year =num/365;            
            System.out.print(year+" ");
            int rem1=num%365;
            int month=rem1/30;
            System.out.print(month+" ");
            int rem2=rem1%30;
            int week=rem2/7;
            System.out.print(week+" ");
            int days=rem2%7;
            System.out.print(days);
    
        }
    }
    

