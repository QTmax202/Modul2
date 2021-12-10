package Point_And_MoveablePoint;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[]  xy = {getxSpeed(),getySpeed()};
        return xy;
    }



    @Override
    public String toString() {
        return super.toString() +
                ", speed{ " +
                "xSpeed= "+getxSpeed() +", "+
                "ySpeed= "+ getySpeed() +
                " }"
                ;
    }

    public MovablePoint move(){
        float x = super.getX();
        float y = super.getY();
        x += xSpeed;
        y += ySpeed;
        super.setX(x);
        super.setY(y);
        return this;
    }
}
