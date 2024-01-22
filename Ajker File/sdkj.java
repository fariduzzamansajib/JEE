
package WW;

public class sdkj {
   String name;
   int id;
   int round;

    public sdkj() {
    }

    public sdkj(String name, int id, int round) {
        this.name = name;
        this.id = id;
        this.round = round;
    }

    @Override
    public String toString() {
        return "sdkj{" + "name=" + name + ", id=" + id + ", round=" + round + '}';
    }
   
}
