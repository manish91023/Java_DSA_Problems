import java.util.Stack;

class RotateArray{
    public static void main(String[] args) {
       
    }
    //print the array 
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //for rotating the array
    public static void rotateArray(int  arr[],int k){
        if(arr.length==0 || arr==null || k<0){
            return;
        }
        if(k>arr.length){
            k=k%arr.length;
        }
        int a=arr.length-k;


        reverseArray(arr, 0, a-1);
        reverseArray(arr, a, arr.length-1);
        reverseArray(arr, 0, arr.length-1);
    }
    //reversing the array
    public static void reverseArray(int arr[],int low,int high){
        if(arr==null || arr.length==1){
            return;
        }
        while (low<high) {
            int temp=arr[low];
             arr[low]=arr[high];
             arr[high]=temp;
             low++;
             high--;

        }
    }

    //2 evaluate reverse polish notation 
      /*
       * evaluate the value of an airthamtic expresion reerse polish notation
       * valid operator are +,-,*,/ each operand may be an  integer of another expression for example
       * ["2","1","+","3","*"]
       */

       public static int evalRPN(String[] tokens){
            int returnvalue=0;
            String operators="+-*/";
            Stack<String>stack=new Stack<>();
            for(String t:tokens){
                if(!operators.contains(t)){
                    stack.push(t);
                }
                else{
                    int a=Integer.valueOf(stack.pop());
                    int b=Integer.valueOf(stack.pop());
                    switch (t){
                        case "+":
                            stack.push(String.valueOf(a+b));
                            break;
                        case "-":
                            stack.push(String.valueOf(b-a));
                            break;
                        case "*":
                            stack.push(String.valueOf(a*b));
                            break;
                        case "/":
                            stack.push(String.valueOf(b/a));
                            break;
                    }
                }
            }
            returnvalue=Integer.valueOf(stack.pop());
            return returnvalue;
       }


       
}