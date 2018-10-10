public class sitRiding implements Vehicles {

    private String sitMaterial;

    sitRiding(String sitMaterial) {
        this.sitMaterial = sitMaterial;
    }

    @Override
    public void ride() {

    }

    public void brake() {

    }

    public void park() {
        //Spreading();
    }

    public class Cruiser extends sitRiding {
        public Cruiser(String sitMaterial) {
            super(sitMaterial);
            super.sitMaterial = "Leather";
        }

        public void ride() {
            //spin();
            int maxSpeed = 268;
        }

        public void brake() {
            //V-brake();
            int minSpeed = 0;
        }

        public void park() {
            //codeLockUse();
        }
    }

    public class WheelChair extends sitRiding {
        public WheelChair(String sitMaterial) {
            super(sitMaterial);
            super.sitMaterial = "textile";
        }

        public void ride() {
            //wheelSpin();
            int maxSpeed = 35;
        }

        public void brake() {
            //handBrake();
            int minSpeed = 0;
        }

        public void park() {

        }
    }

    public class SwivelChair extends sitRiding {
        public SwivelChair(String sitMaterial) {
            super(sitMaterial);
            super.sitMaterial = "cotton";
        }

        public void ride() {
            //kicking();
            int maxSpeed = 1;
        }

        public void brake() {
            //footStop();
            int minSpeed = 0;
        }

        public void park() {
            //toWorkplace();
        }
    }
}
