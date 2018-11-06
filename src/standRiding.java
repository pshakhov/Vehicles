/** Абстрактный класс средств,
 * на которых можно передвигаться стоя.*/
public abstract class standRiding implements Vehicles {

    private Roll BackWardRoll = new Roll(100, "Rubber"),
            ForWardRoll = new Roll(100, "Rubber");

    /** Класс колесика*/
    private class Roll {
        private int diameter;
        private String material;

        private Roll(int diameter, String material) {
            this.diameter = diameter;
            this.material = material;
        }
    }

    /** Дочерний абстрактному -- класс самоката.*/
    private class Scooter extends standRiding {

        /** Перегрузка метода езды для самоката.*/
        @Override
        public void ride() {
            //pushOff();
            int maxSpeed = 43;
        }

        /** Перегрузка метода торможения.*/
        @Override
        public void brake() {
            int minSpeed = 0;
        }

        /** Перегрузка метода парковки.*/
        @Override
        public void park() {
            //outOfBox();
        }
    }

    /** Дочерний абстрактному -- класс скейта.*/
    private class Skateboard extends standRiding {

        /** Перегрузка метода езды для скейта.*/
        @Override
        public void ride() {
            //pushOff();
            int maxSpeed = 130;
            //likeTonyHawkProSkaterRiding();
            //backFlip();
        }

        /** Перегрузка метода торможения.*/
        @Override
        public void brake() {
            //standUp();
        }

        /** Перегрузка метода парковки.*/
        @Override
        public void park() {
            //verticalStanding();
        }
    }

    /** Дочерний абстрактному -- класс роликов.*/
    public class rollerSkate extends standRiding {

        /** Перегрузка метода езды для роликов.*/
        @Override
        public void ride() {
            //kicking();
        }

        /** Перегрузка метода торможения.*/
        @Override
        public void brake() {
            //inertiaLoss();
        }

        /** Перегрузка метода парковки.*/
        @Override
        public void park() {
            //inBox();
        }
    }
}
