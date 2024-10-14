public class Triangle {
    int a;
    int b;
    int c;

    public double area(){
        int hP=(a+b+c)/2;  //halfPerimetr
        return  Math.sqrt((hP*(hP-a)*(hP-b)*(hP-c)));
    }
}

