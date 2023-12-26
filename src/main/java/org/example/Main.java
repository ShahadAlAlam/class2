package org.example;

public class Main {
    public static void main(String[] args) {
        int[] ara = {1,2,30,4,50};
        getSecondMax(ara);
    }

    public static void getSecondMax(int[] ara){
        int max = ara[0];
        int secondMax = -1;
        for(int i=0;i < ara.length;i++){
            /*  i value in loop will be incremented by 1 until it equals ara.length which is 5
                when i == 0 then
                    ara[i] ora ara[0] = 1
                    max = 1
                    secondMax = -1
                    if(ara[i] > max) = false
                when i == 1 then
                    ara[i] ora ara[1] = 2
                    max = 1
                    secondMax = -1
                    if(ara[i] > max) = true so values of max and secondMax will be changed
                        secondMax = 1   ( because secondMax = max = 1)
                        max = 2         ( because Max = ara[i] = ara[1] = 2)
                when i == 2 then
                    ara[i] ora ara[2] = 30
                    max = 2
                    secondMax = 1
                    if(ara[i] > max) = true so values of max and secondMax will be changed
                        secondMax = 2   ( because secondMax = max = 2)
                        max = 30         ( because Max = ara[i] = ara[2] = 30)
                when i == 3 then
                    ara[i] ora ara[3] = 4
                    max = 30
                    secondMax = 2
                    if(ara[i] > max) = false so values of max and secondMax is unchanged
                when i == 4 then
                    ara[i] ora ara[4] = 50
                    max = 30
                    secondMax = 2
                    if(ara[i] > max) = true so values of max and secondMax will be changed
                        secondMax = 30   ( because secondMax = max = 30)
                        max = 50         ( because Max = ara[i] = ara[2] = 50)
               loop ends because value of i is 5 and it equals to ara.length
               thus value of max is 50 and secondMax is 30
            */
            System.out.println("value of i = "+i+" , value of ara[i] = "+ara[i]+" , value of Max = "+max+", value of SecondMax = "+secondMax);

            if(ara[i] > max){
                secondMax = max;
                max = ara[i];
                System.out.println("ara[i] > max is true, thus max and secondMax will be chaned , value of Max = "+max+", value of SecondMax = "+secondMax);
            } else {
                System.out.println("ara[i] > max condition value = "+(ara[i] > max)+", so max and secondMax value will not be changed");
            }
        }

        System.out.println("value of Second Max = "+secondMax);
    }
}