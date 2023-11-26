public class Main {
    public static void main(String[] args) {
        int [] array = {23,213,12,3,123,2};
        sort(array);
    }

    public  static  void Hello (){
        System.out.println("Salam");
    }public  static  void Bye (){
        System.out.println("Poka");
    }

    public  static  void table10 (){
        for(int i = 1; i<=10; i++){
            System.out.println(i + " x " + i + " = " + i * i);
        }
    }

    public  static void stars (int count){
        for(int i = 0;i<=count;i++){
            System.out.print("*");
        }
    }

    public  static  void arrayConcat (int array []){
        for(int i : array){
            System.out.print(i);
        }
    }

    public  static  void sort (int array []){
        int min = 0;
        int max = 0;
        for(int i:array){
            while(max < i){
                max++;
                min = max;
            }
            while(min > i){
                min--;
            }
        }
        System.out.println("MAX: " + max);
        System.out.println("MIN: " + min);
    }

}