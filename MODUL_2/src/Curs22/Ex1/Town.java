package Curs22.Ex1;

public class Town implements Comparable {
    private String name;
    private int distance;

    public Town (){
    }
    public Town(String name){
        this.name = name;
    }
    public Town(String name, int distance){
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        if(this == obj) {
            return true;
        }

        if(!(obj instanceof Town)) {
            return false;
        }

        Town newTown = (Town) obj;
        if(this.distance == newTown.distance && this.name.equals(newTown.name)) {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Object obj) {
        Town otherTown = (Town) obj;
        int result = this.distance - otherTown.distance;
        if(result == 0) {
            return this.name.compareTo(otherTown.name);
        }
        return result;
    }

    public static void main(String[] args) {
    }
}
