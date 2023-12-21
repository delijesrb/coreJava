public class Calculator{
  int a;
  int b;
    Calculator(int a,int   b){
        this.a=a;
        this.b=b;
    }
 double mnozenje(){
        return a*b;
    }
    double deljenje(){
        return a/b;
    }
    double sabiranje(){
        return a+b;
    }
    double oduzimanje(){
        return a-b;
    }
}