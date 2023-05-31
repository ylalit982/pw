package PW;

class CreateingObj{
    public void obj(){
        System.out.println("Creating an Object and calling from main Method...");
    }
}

class SumArray{
    public void Add(int ...args){
        int total=0;

        for (int a: args){
            total +=a;
        }
        System.out.println("Sum = "+total);
    }
}

class MethodOverloading{

    public void num(int a){

        System.out.println(a);
    }
    public void num(int a, int b){
        System.out.println(a+b);
    }
    public void num(int a, int b, int c){
        System.out.println(a+b+c);
    }
}

public class PwArray {
    public static void main(String[] args) {

        // create an object
        CreateingObj obj = new CreateingObj();
        obj.obj();

        System.out.println("----------------");


        // Sum of Array
        int [] arr = {2,5,6,8,5,8,52,8,7};
        SumArray arr1 = new SumArray();
        arr1.Add(arr);

        System.out.println("----------------");

        // Method Overloading
        MethodOverloading ovr = new MethodOverloading();
        ovr.num(2);
        ovr.num(2,3);
        ovr.num(2,3,4);

        System.out.println("----------------");

        // print entire array
        int [] prnt = {2,3,5,8,2,86,85,62,8};

        for (int b: prnt){
            System.out.println(b);
        }

        System.out.println("----------------");

        // find the index of a specific element
        int element=86;
        int index=-1;
        int i=0;
        while (i < prnt.length){
            if (prnt[i] == element){
                index = i;
                break;
            }
            i++;
        }
        System.out.println("Index of "+element+" is : "+index);


    }
}
