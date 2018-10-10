class Main {
    public static void main(String[] args) {}
}

public class standRiding implements Vehicles {
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

    private class Scooter extends standRiding {

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

    public class sitRiding implements Vehicles {
        private String sitMaterial;

        sitRiding(String sitMaterial) {
            this.sitMaterial = sitMaterial;
        }

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

        public class layRiding implements Vehicles {
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
    }
}