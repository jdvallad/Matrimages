public class Driver{

  public static void main(String[] args) throws Exception{
    double[] data = {0,1,2,3,4,5};
    Matrix a = Matrix.create(data,2,3);
    Matrix b = Matrix.create(data,3,2);
    a.print();
    b.print();
    Matrix.productClone(a,b).print();
    Matrix.productClone(b,a).print();
    System.out.print("Ain't that neat?\n");
    return;
  }
}
