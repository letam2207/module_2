package ss7_abstract_and_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc;

public class Square extends Rectangle implements Resizeable {

    public Square(){
    }
    public Square(double side ){
        super(side , side);
    }
    public double getSide(){
        return super.getWidth();
    }
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                " side="+getWidth()+
                " Area="+getArea()
                +"}";
    }
    @Override
    public void resize(double percent) {
        setSide(getLength()+getLength()*percent/100);
    }
}
