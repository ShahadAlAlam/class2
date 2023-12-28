package org.example;

import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        int[] ara = {1,2,30,4,50};
        getSecondMax(ara);
        getSumOfAllNumbersInArray(ara);
        getEvenOrOdd(ara);
        getRevarseArray(ara);
        getFactorial(5);
        getIsPalindrome("bara".toCharArray());
        getPrimes(100);
        getPrimes(89);
        getNFibonacci(10);
        int n=50;
        System.out.println(n+" in "+ Arrays.toString(ara)+" with Linear Search"+(linearSearch(ara,n)?" found":" not found"));
        System.out.println(n+" in "+ Arrays.toString(ara)+" with Binary Search"+(binarySearch(ara,n)?" found":" not found"));
        getDuplicateElements("Shahad Al Alam");
        getVowelElements("Shahad Al Alam");
        getMultiplicationTable(2);
        int[][] inMatrixA = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] inMatrixB = {{1,2,3},{4,5,6},{7,8,9}};
        getMatrixAddition(inMatrixA,inMatrixB);
        getAverage(ara);
        getLeapYear(2100);
        getLeapYear(2016);
        getLeapYear(2023);
        petternPrintPiramid(5);
        getRevarseString("apple");
        getArmStong(153);
        getArmStong(10);
        getMax(ara);

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

    public static void getSumOfAllNumbersInArray(int[] ara){
        int sumValue = 0;
//        System.out.println(Arrays.stream(ara).sum());
        int i = 0;
        while(i < ara.length){
            sumValue = sumValue + ara[i];
            i++;
        }
        System.out.println("Sum of Array Elements = "+sumValue);
    }

    public static void getEvenOrOdd(int[] ara) {
        int i = 0, evenIndex = 0, oddIndex = 0;
        StringBuilder evenValues = new StringBuilder();
        StringBuilder oddValues = new StringBuilder();
        while(i < ara.length){
            if((ara[i]%2) == 0){
                evenValues.append((evenValues.toString().length()>0?(","+ara[i]):String.valueOf(ara[i])));
                evenIndex++;
            } else {
                oddValues.append(oddValues.toString().length()>0?(","+ara[i]):ara[i]);
                oddIndex++;
            }
            i++;
        }
        System.out.println( "Even Values = "+evenValues.toString()+"  Count of Even Values "+evenIndex );
        System.out.println( "Odd Values = "+oddValues.toString()+"  Count of Even Values "+oddIndex );
    }


    public static void getRevarseArray(int[] ara){
        StringBuilder revValues = new StringBuilder();
        int i = ara.length-1;
        while(i >= 0){
            revValues.append(revValues.toString().length()>0?(","+ara[i]):ara[i]);
            i--;
        }
        System.out.println("Revarse of Array Elements = "+revValues.toString());
    }

    public static void getFactorial(int i){
        System.out.println("Factorial of "+i+" is "+calFactorial(i,i));
    }

    public static int calFactorial(int i,int result){
        if(i-1>0)
            return calFactorial((i - 1),result * (i - 1));
        else
            return result;
    }

    public static void getIsPalindrome(char[] ara){
        boolean isPalindrome = true;
        for(int i=0; i<floor(ara.length/2); i++){
            if( !String.valueOf(ara[i]).equalsIgnoreCase(String.valueOf(ara[ara.length-1-i])) ){
                isPalindrome = false;
                break;
            }
        }

        System.out.println("String "+String.copyValueOf(ara)+" is"+(isPalindrome? " a":" not a" )+" Palindrome");
    }

    public static void getPrimes(int inValue){
        List<String> primeList = new ArrayList<>();
        StringBuilder primeValues = new StringBuilder();
//        for(int i=inValue; i>1 ; i--){
            int i = inValue;
            int k = i;
            boolean isPrime = true;
            for(int j =i-1; j>1 ; j--){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
//                primeValues.append( (primeValues.toString().length()>0 ? ", "+k:k));
//                primeList.add(String.valueOf(k) );
                System.out.println("The given int "+inValue+" is a Prime number");
            } else {
                System.out.println("The given int "+inValue+" is not a Prime number");
            }
//        }
//        primeValues.append((primeValues.toString().length()>0 ? ", "+1:1));
//        primeList.add("1");
//        System.out.println("Prime values till "+inValue+" are "+ primeValues.toString());
//        System.out.println("Prime values till "+inValue+" are "+ primeList.toString());
    }

    public static void getNFibonacci(int n){
        List<Integer> fList = new ArrayList<>();
        fList.add(0);
        fList.add(1);
        System.out.println("First "+n+" elements of Fibonacci series is "+createFibonacci(0,1,fList,n-2).toString());
        ;
    }

    public static List<Integer> createFibonacci(int firstNumber, int secondNumber, List<Integer> fList, int n){
        List<Integer> finalList=new ArrayList<>();
        if(n>0) {
            fList.add(firstNumber + secondNumber);
            finalList=createFibonacci(secondNumber, firstNumber + secondNumber, fList, n - 1);
        }
        return fList;
    }

    public static boolean linearSearch(int[] ara,int elementToSearch){
        for(int i = 0; i<ara.length;i++){
            if(ara[i]==elementToSearch){
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] ara,int elementToSearch){
        int firstHalfMinValue = ara[0] ;
        int firstHalfMaxValue = ara[(int) ceil(ara.length/2)];
        int lastHalfMinValue = ara[((int) ceil(ara.length/2) + 1)] ;
        int lastHalfMaxValue = ara[ara.length-1];
        if(elementToSearch >= firstHalfMinValue && elementToSearch <= firstHalfMaxValue && ((int) ceil(ara.length/2))>2){
            int[] farray = Arrays.copyOfRange(ara, 0, (int) ceil(ara.length/2));
            binarySearch(farray, elementToSearch);
        } else if (elementToSearch >= lastHalfMinValue && elementToSearch <= lastHalfMaxValue && ((int) ceil(ara.length/2))>2 ) {
            int[] larray = Arrays.copyOfRange(ara, ((int) ceil(ara.length/2) + 1),ara.length-1);
            binarySearch(larray, elementToSearch);
        } else if (((int) ceil(ara.length/2))==2){
            if(firstHalfMinValue == elementToSearch || firstHalfMaxValue == elementToSearch || lastHalfMinValue == elementToSearch || lastHalfMaxValue == elementToSearch) {
                return true;
            }
        }
        return false;
    }

    public static void getDuplicateElements(String stringValue){
        char[] checkValue=stringValue.replace(" ","").toCharArray();
        List<Map<String ,String>> dupValues = new ArrayList<>();
        StringBuilder addedValue = new StringBuilder();

        for (int i = 0; i < checkValue.length ; i++){
            int countValue = 0;
            for(int j = i+1; j < checkValue.length; j++){
                if( String.valueOf(checkValue[i]).equalsIgnoreCase(String.valueOf(checkValue[j]) )){
                    countValue++;
                }
            }
            if(countValue>0){
                if(!addedValue.toString().contains(String.valueOf(checkValue[i]) )){
                    addedValue.append(String.valueOf(checkValue[i]));
                    Map<String,String> dups = new HashMap<>();
                    dups.put("Chares",String.valueOf(checkValue[i]) );
                    dups.put("Count",String.valueOf((countValue+1)) );
                    dupValues.add(dups);
                }
            }
        }
        System.out.println("Duplicate charecters are "+dupValues.toString());
    }

    public static void getVowelElements(String stringValue){
        char[] checkValue=stringValue.replace(" ","").toCharArray();
        List<Map<String ,String>> dupValues = new ArrayList<>();
        StringBuilder addedValue = new StringBuilder();
        int countValueA = 0;
        int countValueE = 0;
        int countValueI = 0;
        int countValueO = 0;
        int countValueU = 0;

        for (int i = 0; i < checkValue.length ; i++){
            if(String.valueOf(checkValue[i]).equalsIgnoreCase("a")){
                countValueA++;
            } else if(String.valueOf(checkValue[i]).equalsIgnoreCase("e")){
                countValueE++;
            } else if(String.valueOf(checkValue[i]).equalsIgnoreCase("i")){
                countValueI++;
            } else if(String.valueOf(checkValue[i]).equalsIgnoreCase("o")){
                countValueO++;
            } else if(String.valueOf(checkValue[i]).equalsIgnoreCase("u")){
                countValueU++;
            }

        }
        Map<String,String> dups = new HashMap<>();
        dups.put("Charecter","A" );
        dups.put("Count",String.valueOf(countValueA) );
        dupValues.add(dups);

        dups = new HashMap<>();
        dups.put("Charecter","E" );
        dups.put("Count",String.valueOf(countValueE) );
        dupValues.add(dups);

        dups = new HashMap<>();
        dups.put("Charecter","I" );
        dups.put("Count",String.valueOf(countValueI) );
        dupValues.add(dups);

        dups = new HashMap<>();
        dups.put("Charecter","O" );
        dups.put("Count",String.valueOf(countValueO) );
        dupValues.add(dups);

        dups = new HashMap<>();
        dups.put("Charecter","U" );
        dups.put("Count",String.valueOf(countValueU) );
        dupValues.add(dups);
        System.out.println("Vowel charecter counts are "+dupValues.toString());
    }

    public static void getMultiplicationTable(int inValue){
        for(int i = 1; i<=10;i++){
            System.out.println(inValue+" x "+i+" = "+(i*inValue));
        }
    }

    public static void getMatrixAddition(int[][] inMatrixA,int[][] inMatrixB){
        int matrixSize = inMatrixA[0].length;
        int[][] resultMatrix =new int[matrixSize][matrixSize];
        for(int i=0;i<matrixSize;i++){
            for(int j=0;j<matrixSize;j++){
                resultMatrix[i][j]=inMatrixA[i][j]+inMatrixB[i][j];
            }
        }
        for(int i=0;i<matrixSize;i++){
            for(int j=0;j<matrixSize;j++){
                System.out.print(resultMatrix[i][j]+" ");
            }
            System.out.println("");
        }

    }

    public static void getAverage(int[] ara){
        double sumValue = 0L;
        for(int i = 0; i<ara.length;i++){
            sumValue+=ara[i];
        }
        System.out.println("Avarage of "+Arrays.toString(ara)+" is "+(sumValue/ara.length));
    }

    public static void getLeapYear(int inYear){
        if((inYear%4==0 && inYear%100!=0)||(inYear%400==0)) {
            System.out.println(inYear+" is a Leap Year. ");
        } else {
            System.out.println(inYear+" is a not a Leap Year. ");
        }
    }


    public static void petternPrintPiramid(int inHeight){
        for(int i = inHeight-1 ; i>=0; i--){
            for(int j = 1 ; j<=i; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=(((inHeight-i)*2)-1); j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void getRevarseString(String inString){
        char[] c = inString.toCharArray();
        String revarseString = "";
        for(int i = c.length-1 ; i>=0; i--){
            revarseString=revarseString+c[i];
        }
        System.out.println("Revarse String of "+inString+" is "+revarseString);
    }
    public static void getArmStong(int inValue){
        int[] ara = new int[String.valueOf(inValue).length()];
        int someValue=inValue;
        Double sumValue = 0D;
        for(int i=0;i<String.valueOf(inValue).length();i++){
            ara[i] = (someValue%( 10));
            someValue=someValue/(10);
//            System.out.println(ara[i]);
        }
        for(int i=0;i<ara.length;i++){
//            System.out.println(ara[i] );
            sumValue=sumValue+(pow(Double.parseDouble(String.valueOf(ara[i]) ) ,ara.length  ) );
        }
        int finalValue= (int) Math.round(sumValue);
        if(inValue==finalValue){
            System.out.println(inValue+" is a Armstrong number ");
        } else {
            System.out.println(inValue+" is a not Armstrong number ");
        }
    }

    public static void getMax(int[] ara){
        int max = 0;
        for(int i=0;i < ara.length;i++){
            if(ara[i] > max){
                max = ara[i];
            }
        }

        System.out.println("value of Max = "+max);
    }
}