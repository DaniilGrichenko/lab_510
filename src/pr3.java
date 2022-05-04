public class pr3 {
    public static void main(String[] args) {
        int a = 10;
               System.out.print("Дільники числа "+  a+"-----");
            for(int i=a;i>0;i--){
        int b=a%i;
        if(b==0)
            System.out.print(i+" ");

    }
}


}

