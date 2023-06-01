import java.awt.image.BufferedImage;

public class Driver{

  public static void main(String[] args) throws Exception{
    Matrix left = Matrix.create(new double[]{-1},1,1);
    Matrix right;
    BufferedImage image;
    for(int i = 0; i < 10;i++){
      ImageViewer.imageToPath(ImageViewer.matrixToImage(left.addClone(2.).product(128.)), "./images/"+i+".png");
      right = left.productClone(-1);
      left = Matrix.pack(new Matrix[][]{{left,right},{right,left}});
    }
    return;
  }
}
