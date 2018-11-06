/** Абстрактный класс средств,
 * на которых можно передвигаться сидя.*/
public abstract class sitRiding implements Vehicles {

    /** Параметр - материал сиденья.*/
    private String sitMaterial;

    sitRiding(String sitMaterial) {
        this.sitMaterial = sitMaterial;
    }

    /** Дочерний абстрактному -- класс круизера.*/
    public class Cruiser extends sitRiding {
        public Cruiser(String sitMaterial) {
            super(sitMaterial);
            super.sitMaterial = "Leather";
        }

        /** Перегрузка метода езды для круизера.*/
        @Override
        public void ride() {
            //spin();
            int maxSpeed = 268;
        }

        /** Перегрузка метода торможения.*/
        @Override
        public void brake() {
            //V-brake();
            int minSpeed = 0;
        }

        /** Перегрузка метода парковки.*/
        @Override
        public void park() {
            //codeLockUse();
        }
    }

    /** Дочерний абстрактному -- класс каталки.*/
    public class WheelChair extends sitRiding {
        public WheelChair(String sitMaterial) {
            super(sitMaterial);
            super.sitMaterial = "textile";
        }

        /** Перегрузка метода езды для каталки.*/
        @Override
        public void ride() {
            //wheelSpin();
            int maxSpeed = 35;
        }

        /** Перегрузка метода торможжения.*/
        @Override
        public void brake() {
            //handBrake();
            int minSpeed = 0;
        }

        /** Перегрузка метода парковки.*/
        @Override
        public void park() {

        }
    }

    /** Дочерний абстрактному -- класс офисного кресла.*/
    public class SwivelChair extends sitRiding {
        public SwivelChair(String sitMaterial) {
            super(sitMaterial);
            super.sitMaterial = "cotton";
        }

        /** Перегрузка метода передвижения.*/
        @Override
        public void ride() {
            //kicking();
            int maxSpeed = 1;
        }

        /** Перегрузка метода торможения.*/
        @Override
        public void brake() {
            //footStop();
            int minSpeed = 0;
        }

        /** Перегрузка метода парковки.*/
        @Override
        public void park() {
            //toWorkplace();
        }
    }
}
