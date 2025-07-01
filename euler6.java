class sumsquare
{
    public static void main(String[] args)
  {
        int sum = 0;
        int sum1 = 0;
        for(int i = 1;i<=100;i++){
            sum += i;
            sum1+= i*i;
        }

        System.out.println(Math.abs(sum1-(sum*sum)));
    }
}
