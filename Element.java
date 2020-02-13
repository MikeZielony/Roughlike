public abstract class Element {

    private String look;
    private int weight;
    private int x;
    private int y;
    private boolean canPassThrough;
    private boolean isToxic;
    private boolean isMoveable;
    

    public Element(String look, int weight, int x, int y, boolean isMoveable) {
        this.look = look;
        this.weight = weight;
        this.x = x;
        this.y = y;
        this.isMoveable = isMoveable;
    }

    public String getLook() {
        return this.getColor() + this.look + Color.RESET;
    }

    protected abstract String getColor();

    public int getWeight() {
        return this.weight;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public boolean getCanPassThrough() {
        return this.canPassThrough;
    }

    public void setLook(String look) {
        this.look = look;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setX(int x) {
        this.x += x;
    }

    public void setY(int y) {
        this.y += y;
    }

    public void setCanPassThrough(boolean canPassThrough) {
        this.canPassThrough = canPassThrough;
    }
    
    public void setIsMoveable() {
        this.isMoveable = true;
    }
    
}
    
