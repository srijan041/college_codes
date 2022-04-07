class Plate{
    int length, width;
    Plate(int l, int w){
        length = l;
        width = w;
    }

    int returnArea(){
        return length*width;
    }

}

class Box extends Plate{
    int height;

    Box(int l, int w, int h){
        super(l, w);
        height = h;
    }

    int returnVolume(){
        return returnArea()*height;
    }

}


public class WoodBox extends Box{
    int thickness;

    WoodBox(int l, int w, int h, int t){
        super(l, w, h);
        thickness = t;
    }

    int returnVolumeThickness(){
        return returnVolume()*thickness;
    }

    public static void main(String[]args){

        WoodBox woodBox = new WoodBox(4, 4, 4, 4);

        System.out.println("Figures: \n"
        + woodBox.returnArea() + "\n" + woodBox.returnVolume() + 
        "\n" + woodBox.returnVolumeThickness());
    }
    
}
