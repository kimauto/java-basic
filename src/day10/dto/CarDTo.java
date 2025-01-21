package day10.dto;

public class CarDTo {
        private String model;
        private int speed;
        private boolean start;
        private Tire tire;

        public CarDTo(){}

        public CarDTo(String model, Tire tire){
                this.model = model;
                this.tire = tire;
        }

        public String getModel() {
                return model;
        }

        public void setModel(String model) {
                this.model = model;
        }

        public int getSpeed() {
                return speed;
        }

        public void setSpeed(int speed) {
                this.speed = speed;
        }

        public boolean isStart() {
                return start;
        }

        public void setStart(boolean start) {
                this.start = start;
        }

        public Tire getTire() {
                return tire;
        }

        public void setTire(Tire tire) {
                this.tire = tire;
        }

        @Override
        public String toString() {
                return "CarDTo{" +
                        "model='" + model + '\'' +
                        ", speed=" + speed +
                        ", start=" + start +
                        ", tire=" + tire +
                        '}';
        }
}
