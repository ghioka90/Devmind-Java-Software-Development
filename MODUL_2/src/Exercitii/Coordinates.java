package Exercitii;

public class Coordinates {
    public static class Coordinates3D {
        private int ox;
        private int oy;
        private int oz;
        public Coordinates3D(int ox, int oy, int oz) {
            this.ox = ox;
            this.oy = oy;
            this.oz = oz;
        }
        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Coordinates3D))
                return false;
            Coordinates3D otherC = (Coordinates3D) obj;
            return (this.ox + this.oy + this.oz) == (otherC.ox + otherC.oy + otherC.oz);
        }
    }
    public static void main(String[] args) {
    }
}
