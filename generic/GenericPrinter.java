package generic;

public class GenericPrinter<T> {
    private T material; //T자료형으로 변수 선언


    public void setMaterial(T material){
        this.material =material;
    }

    public T getMaterial(){
        return material;
    }
    public String toString(){
        return material.toString();
    }
}
