class ArrayAverage{
    public static void main(String args[]){
        double nums[] = {10.11,12.23,13.45,15,5,18.75};
        double res = 0;
        double avg;
        int i;
        for(i=0;i<6;i++)
            res = res+nums[i];
        System.out.println("The average is " +(res/6));



    }
}