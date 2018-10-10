public class standRiding implements  Vehicles{
    @Override
    public void ride() {
        //balancing();
    }

    public void brake() {

    }

    public void park() {
        //stayAtCorner();
    }

    private Roll BackWardRoll = new Roll(100, "Rubber"),
            ForWardRoll = new Roll(100, "Rubber");

    private class Roll {
        private int diameter;
        private String material;

        private Roll(int diameter, String material) {
            this.diameter = diameter;
            this.material = material;
        }
    }

    private class Scooter extends standRiding{

        public void ride() {
            //pushOff();
           int maxSpeed = 43;
        }

        public void brake() {
           int minSpeed = 0;
        }

        public void park() {
            //outOfBox();
        }
    }

    private class Skateboard extends standRiding {

        public void ride() {
            //pushOff();
           int maxSpeed = 130;
            //likeTonyHawkProSkaterRiding();
            //backFlip();
        }

        public void brake() {
            //standUp();
        }

        public void park() {
            //verticalStanding();
        }
    }

    public class rollerSkate extends standRiding {

        public void ride() {
            //kicking();
        }

        public void brake() {
            //inertiaLoss();
        }

        public void park() {
            //inBox();
        }
    }
}
