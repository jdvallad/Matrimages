import java.awt.image.BufferedImage;

public class Chris{

  public static void main(String[] args) throws Exception{
    BufferedImage chris = ImageViewer.pathToImage("./chrises/chris.png");
    Matrix left = ImageViewer.greyMatrix(chris);
    left.add(-128.);
    Matrix right;
    BufferedImage image;
    for(int i = 0; i < 10;i++){
      ImageViewer.imageToPath(ImageViewer.matrixToImage(left.addClone(128.)), "./chrises/"+i+".png");
      right = left.productClone(-1);
      left = Matrix.pack(new Matrix[][]{{left,right},{right,left}});
    }
    return;
  }
}
