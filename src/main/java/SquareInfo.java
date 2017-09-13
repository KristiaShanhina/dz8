public class SquareInfo {

    public Boolean check(Square square){
        double a,b,c,d,e,f;

        a = calc(square.getX1(), square.getX2(),square.getY1(), square.getY2());
        b = calc(square.getX2(), square.getX3(),square.getY2(), square.getY3());
        c = calc(square.getX3(), square.getX4(),square.getY3(), square.getY4());
        d = calc(square.getX4(), square.getX1(),square.getY4(), square.getY1());

        e = calc(square.getX1(), square.getX3(),square.getY1(), square.getY3());
        f = calc(square.getX2(), square.getX4(),square.getY2(), square.getY4());

        if ( a == b && b == c && c == d && a == d )
            return e == f;
        else
            return false;
    }

    private double calc(int x1, int x2, int y1, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
