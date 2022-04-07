public class MyVolume {
    int side;
    double radius; 
    int length, breadth, height;

    MyVolume(int s){
        side = s;
    }

    MyVolume(double r){
        radius = r;
    }

    MyVolume(int l, int b, int h){
        length = l;
        breadth = b;
        height = h;
    }

    int cubeVolume(){
        return side*side*side;
    }

    int cuboidVolume(){
        return length*height*breadth;
    }

    double sphereVolume(){
        return (4.0/3)*Math.PI*(radius*radius*radius);
    }

    public static void main(String[] args){
        MyVolume cube = new MyVolume(5);
        MyVolume cuboid = new MyVolume(5,4,5);
        MyVolume sphere = new MyVolume(6.0);

        System.out.println("Sphere = " + sphere.sphereVolume());
        System.out.println("Cube = " + cube.cubeVolume());
        System.out.println("Cuboid = " + cuboid.cuboidVolume());
    }
}
