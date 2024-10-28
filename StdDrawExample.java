public class StdDrawExample {
    static class position{
        double x;
        double y;
        position(double x, double y){
            this.x = x;
            this.y = y;
        }
        public double getposX(){
            return this.x;
        }
        public double getposY(){
            return this.y;
        }
    }
    static position tmp;

    public static void main(String[] args) {

        /* Design one
        for(int i=0;i<=500;i+=20){
            for(int j=0;j<=500;j+=20){
                StdDraw.square(i, j, 10);
            }
        }
         */
        /* Design two
        StdDraw.setScale(0, 1);
        double w = 1.0/50;

        StdDraw.setPenRadius(0.2/50);
        StdDraw.setPenColor(StdDraw.BLACK);
        for(int i=0;i<=50;i++){
            StdDraw.line(w*i, 0, 1, w*i);
            StdDraw.line(0, w*i, w*i, 1);
        }
        */

        /*draw 3
        StdDraw.setScale(0, 500);
        StdDraw.setPenRadius(0.005);
        for(int i=10;i<300;i+=20){
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.circle(250, 250, i);

        }
        */
        /*draw 4*/
        StdDraw.setScale(0, 1);
        position p1 = new position(0, 0);
        position p2 = new position(1, 0);
        position p3 = new position(0.5, 0.5 * Math.sqrt(3));

        StdDraw.line(p1.getposX(), p1.getposY(), p2.getposX(), p2.getposY());
        StdDraw.line(p2.getposX(), p2.getposY(), p3.getposX(), p3.getposY());
        StdDraw.line(p3.getposX(), p3.getposY(), p1.getposX(), p1.getposY());
        tmp = new position((p1.getposX() + p2.getposX())/2, (p1.getposY() + p2.getposY())/2);
        for(int i=0;i<100000;i++) {
           int random3 = (int)(Math.random()*3);
              if(random3 == 0){

                tmp = new position((p1.getposX() + tmp.getposX())/2, (p1.getposY() + tmp.getposY())/2);
                StdDraw.point(tmp.getposX(), tmp.getposY());
              }else if(random3 == 1){

               tmp = new position((p2.getposX() + tmp.getposX())/2, (p2.getposY() + tmp.getposY())/2);
                  StdDraw.point(tmp.getposX(), tmp.getposY());
              }else{
                tmp = new position((p3.getposX() + tmp.getposX())/2, (p3.getposY() + tmp.getposY())/2);
                    StdDraw.point(tmp.getposX(), tmp.getposY());

              }
        }
    }
}

/*
StdDraw.line(0, 500, 500, 0);
        StdDraw.line(0, 0, 500, 500);
        StdDraw.square(250, 250, 100);
        StdDraw.circle(250, 250, 100);

        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.filledCircle(100, 100, 50);
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.filledCircle(100, 400, 50);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.filledCircle(400, 400, 50);

        StdDraw.setPenColor(StdDraw.YELLOW);
        StdDraw.filledCircle(400, 100, 50);
 */
