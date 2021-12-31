package Use_Memory_Efficiently_with_Memory_Pool;

public class Bullet {
    public static int count = 0;
    private int position;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Bullet() {
        count++;
    }

    public void move() {
        position++;
    }
}
