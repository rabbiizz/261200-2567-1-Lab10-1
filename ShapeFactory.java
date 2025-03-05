public class ShapeFactory {
    public static final int TYPE_CIRCLE = 0;
    public static final int TYPE_RECTANGLE = 1;
    public static final int TYPE_SQUARE =2;
    public static int Totalshape = 5 ;
    public static int countCirclelimit = 2;
    public static int countCirclc = 0;
    public static int countregtanglelimit = 2;
    public static int countragtangle = 0;
    public static int countsquarelimit = 2 ;
    public static int countsquare = 0;

    public static Shape getShape(int type) {
        switch (type) {
            case TYPE_CIRCLE:
                if (countCirclc < countCirclelimit){
                    countCirclc++;
                    Totalshape++;
                    return new Circle();
                }
                return null;
            case TYPE_RECTANGLE:
                if (countragtangle < countregtanglelimit){
                    countragtangle++;
                    Totalshape++;
                    return new Rectangle();
                }
                return null;

            case TYPE_SQUARE:
                if (countsquare < countsquarelimit){
                    countsquare++;
                    Totalshape++;
                    return new Square();
                }
                return null;
            default:
                return null ;


        }
    }
}