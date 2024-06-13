//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Box{
    int width;
    int height;
    int depth;
}

class BoxDemo{
    public static void main(String args[]){
        double volume , volume2;
        Box mybox = new Box();
        mybox.height = 12;
        mybox.width = 13;
        mybox.depth = 10;

        Box mybox2 = new Box();
        mybox2.height = 15;
        mybox2.width = 20;
        mybox2.depth = 12;



        volume = mybox.height*mybox.depth*mybox.width;
        volume2 = mybox2.height*mybox2.depth*mybox2.width;

        System.out.println(volume);
        System.out.println(volume2);
    }
}