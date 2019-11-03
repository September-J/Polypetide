package Polypeptide;
interface IShape{
    void draw();
}
class Cycle implements IShape{
    @Override
    public void draw(){
        System.out.println("O");
    }
}
