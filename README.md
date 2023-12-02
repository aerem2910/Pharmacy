# Pharmacy
Программа представляет собой простую систему для работы с аптекой, представленной в виде классов и интерфейсов в языке программирования Java.

PharmancyComponent.java: Этот класс представляет общий компонент аптечного товара и реализует интерфейс Comparable, позволяя сравнивать компоненты по их мощности (power).

Azitronit.java, Pinicilin.java, Water.java: Это конкретные классы аптечных компонентов, которые наследуются от PharmancyComponent. Каждый из них представляет разные товары, такие как антибиотик Azitronit, пенициллин и вода.

IteratorComponent.java: Этот класс реализует интерфейс Iterator для перебора компонентов в аптеке.

Pharmacy.java: Этот класс представляет аптеку, содержащую список компонентов. Реализует интерфейс Iterable, что позволяет использовать цикл for-each для итерации по компонентам. Также реализует Comparable для возможности сравнения аптек между собой.

Main.java: Этот класс содержит метод main, который служит в качестве точки входа в программу. В нем создаются экземпляры различных аптечных компонентов, аптеки, и производится сортировка компонентов.

Программа также демонстрирует использование интерфейсов и полиморфизма в Java. Помимо этого, в Main.java создаются несколько экземпляров аптек, включая аптеки с одинаковыми компонентами, чтобы продемонстрировать уникальность объектов при использовании Set.
