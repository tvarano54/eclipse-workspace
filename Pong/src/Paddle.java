import java.awt.Graphics2D;
import java.awt.Rectangle;

//Thomas Varano
//The paddle used in pong and other similar games
//Jan 18, 2017

public class Paddle
{
   private int x, y, width, height;
   private double dx, dy, dyMax, dxMax;
   private boolean up, down, left, right; 
   
   public Paddle(int x, int y, int width, int height) {
      super();
      this.x = x;
      this.y = y;
      this.width = width;
      this.height = height;
      dy = 0;
      dx = 0;
      dyMax = 5;
      dxMax = 5;
   }
   public Paddle(){
      this(0, 0, 0, 0);
   }
   
   public void update(){
       
      if (down){
         dy--;
         if (y+height>Pong.PREF_H){
            setY(Pong.PREF_H-height);
         }
         if(dy<dyMax){
            dy = dyMax;
            
         }
      }
      else if (up){
         dy++;
         if (y<0)
            setY(0);
         if (dy>-dyMax){
            dy = -dyMax;
         }
      }
      else{
         if (dy>0)
            dy--;
         else if (dy<0)
            dy++;
      }
      y+=dy;
      x+=dx;
   }
   
   public void collide(PongBall ball){
      if(ball.getBounds().intersects(getBounds()))
         ball.setDy(-ball.getDy());
   }

   public void draw(Graphics2D g2){
    g2.fill(getBounds());  
   }
   public Rectangle getBounds(){
      return new Rectangle(x,y,width,height);
   }
   public int getX() {
      return x;
   }
   public void setX(int x) {
      this.x = x;
   }
   public int getWidth() {
      return width;
   }
   public void setWidth(int width) {
      this.width = width;
   }
   public int getHeight() {
      return height;
   }
   public void setHeight(int height) {
      this.height = height;
   }
   public int getY() {
      return y;
   }
   public void setY(int y) {
      this.y = y;
   }
   public double getDx() {
      return dx;
   }
   public void setDx(double dx) {
      this.dx = dx;
   }
   public double getDy() {
      return dy;
   }
   public void setDy(double dy) {
      this.dy = dy;
   }
   public boolean isUp() {
      return up;
   }
   public void setUp(boolean up) {
      this.up = up;
   }
   public boolean isDown() {
      return down;
   }
   public void setDown(boolean down) {
      this.down = down;
   }
   public boolean isLeft() {
      return left;
   }
   public void setLeft(boolean left) {
      this.left = left;
   }
   public boolean isRight() {
      return right;
   }
   public void setRight(boolean right) {
      this.right = right;
   }
   
}
