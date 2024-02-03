package DataStructures;

// Клас "Вектор" — математичний обʼєкт за варіантом
public class Vector {
    // Описується у полярній системі координати
    double magnitude;   /* Довжина вектора ρ */
    double angle;       /* Кут вектора φ */

    // Конструктор вектора використовує сетери для нормалізації значень
    public Vector(int magnitude, int angle){
        this.setMagnitude(magnitude);
        this.setAngle(angle);
    }
    // Заміщення методу переведення у рядок; використовується для виведення
    @Override
    public String toString() {
        return String.format("(%.2f; %.2f)", this.getX(), this.getY());
    }
    /*
     * Заміщення методу порівняння з іншим вектором; необхідний для виявлення,
     * чи містить хеш-таблиця вже такий же самий вектор, адже дублікатні значення
     * не мають бути дозволеними.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Vector other)
            return this.magnitude == other.magnitude && this.angle == other.angle;
        else return false;
    }

    // Сетери та гетери довжини і кута: довжина не може бути відʼємною, а кут — більше 360°
    public void setMagnitude(double magnitude){
        this.magnitude = Math.abs(magnitude);
    }
    public double getMagnitude(){
        return this.magnitude;
    }
    public void setAngle(double angle){
        this.angle = Math.abs(angle) % 360.0;
    }
    public double getAngle(){
        return this.angle;
    }

    // Методи обчислення координат у декартовій системі за математичними формулами
    public double getX(){
        return this.magnitude * Math.cos(this.angle);
    }
    public double getY(){
        return this.magnitude * Math.sin(this.angle);
    }
}
