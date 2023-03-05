package week_03;

public class VariableInfo {

    public static void main(String[] args) {

    //1Primitive
    //double

    //dataType variableName = variableValue
    double pi = 3.14;
    double num= 10;
    //float

    float floatVar = 12.5f;
    float floatVar2=(float)14.5;// explicit casting
    //long
    long l=11_111_111_110L;
    long l2= (long) 1111111110;
    //int
    int i = 12;
    //short
    short s= 2;
    //byte
    byte b= 127;//-128 to 127
    //char
    char ch = 'Y';
    //boolean

    boolean bool=true;
    boolean bool2 =false;

    //2 Non-Primitive
    String str ="Adam";
    //===============================
    // implicit vc explicit

    double dd= 10;
    long ll= 10;
    int ii= 10;
    short ss=10;

    //implicit casting
    dd=ss; // we are able to put smaller to bigger directly it is done by compiler.

    ll=ii;

    // explicit casting

    ii=(int) dd;  // if we able to put bigger to smaller we have to do aht action as a developer




    }
}
