public class layRiding implements Vehicles {

    @Override
    public void ride() {

    }

    public void brake() {

    }

    public void park() {

    }

    private class Stroller extends layRiding {

        public void ride() {
            //layingInside();
            int maxSpeed = 2;
        }
    }

    private class Cart extends layRiding {

        public void ride() {
            //layingInside();
            int maxSpeed = 30;
        }
    }

    private class Skullboard extends layRiding {

        public void ride() {
            //jumpOnKickOff();
            int maxSpeed = 40;
        }
    }
}
