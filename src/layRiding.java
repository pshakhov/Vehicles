/** Абстрактный класс средств,
 * на которых можно передвигаться лежа.*/
public abstract class layRiding implements Vehicles {

    /** Перегрузка метода торможения.*/
    @Override
    public void brake() {
    }

    /** Перегрузка метода парковки.*/
    @Override
    public void park() {
    }

    private class Stroller extends layRiding {

        /** Перегрузка метода езды для коляски.*/
        @Override
        public void ride() {
            //layingInside();
            int maxSpeed = 2;
        }
    }

    private class Cart extends layRiding {

        /** Перегрузка метода езды для тележки.*/
        @Override
        public void ride() {
            //layingInside();
            int maxSpeed = 30;
        }
    }

    private class Skullboard extends layRiding {

        /** Перегрузка метода езды для скуллборда.*/
        @Override
        public void ride() {
            //jumpOnKickOff();
            int maxSpeed = 40;
        }
    }
}
