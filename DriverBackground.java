import java.awt.image.BufferedImage;

public class DriverBackground{

  public static void main(String[] args) throws Exception{
    Matrix left = Matrix.create(9,16);
    left.add(-1.);
    Matrix right;
    BufferedImage image;
    for(int i = 0; i < 10;i++){
      ImageViewer.imageToPath(ImageViewer.matrixToImage(left.addClone(2.).product(128.)), "./ratio/"+i+".png");
      right = left.productClone(-1);
      left = Matrix.pack(new Matrix[][]{{left,right},{right,left}});
    }
    return;
  }
}
