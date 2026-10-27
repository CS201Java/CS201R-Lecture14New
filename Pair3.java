public class Pair3<E extends Number>{
    private E x;
    private E y;

    public Pair3(E x, E y){
        this.x = x;
        this.y = y;
    }
    public E getX(){return x;}
    public void setX(E x){this.x = x;}
    public Double sum(){
        return x.doubleValue() + y.doubleValue();
    }
    @Override
    public String toString(){
        return "Pair = (" + x + "," + y + "). The sum = " + sum();
    }
}