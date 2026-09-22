class value{
    public void display1(){
        System.out.println("methord without perimeter");
    }
    public void display2(int a){

        System.out.println("methord with a single peremeter+a");
    }

    public static void main(String[] args){
        value obj = new value();
        obj.display1();
        obj.display2(24);
    }
}
