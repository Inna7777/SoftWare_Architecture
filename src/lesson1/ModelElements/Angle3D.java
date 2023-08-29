package lesson1.ModelElements;

//класс Angle3D- описывает угол поворота в трехмерном пространстве.
// класс содержит x, y и z, которые показывают  угл поворота.

public class Angle3D {
        private double x;
        private double y;
        private double z;
    // Конструктор класса принимает параметры x, y и z
        public Angle3D(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
   // методы get() set() которые позволяют получать и изменять значения x,y,z

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

        public double getZ() {
            return z;
        }

        public void setZ(double z) {
            this.z = z;
        }


    }


