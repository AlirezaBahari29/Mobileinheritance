public class Iphone14 extends IOSPhone{
    private String factory = "Apple";
    private String iphoneType;
    private int memory ;

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getIphoneType() {
        return iphoneType;
    }

    public void setIphoneType(String iphoneType) {
        this.iphoneType = iphoneType;
    }

    @Override
    public int getMemory() {
        return memory;
    }

    @Override
    public void setMemory(int memory) {
        this.memory = memory;
    }
}
