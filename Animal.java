public class Animal {
    int eyes;

    public Animal() {
        System.out.println("I am animal");
    }

    void eat() {
        System.out.println("Animal eats");
    }

    void drink() {
        System.out.println("Animal drinks");
    }

    static class Pet extends Animal {
        String name;
        int tail = 1;
        int paw = 4;

        public Pet() {
            System.out.println("I am pet");
        }

        void run() {
            System.out.println("Pet runs");
        }

        void jump() {
            System.out.println("Pet jumps");
        }

        static class Dog extends Pet {

            public Dog(String name) {
                System.out.println("I am dog and my name is:" + name);
            }

            void play() {
                System.out.println("Dog plays");
            }

            static class Cat extends Pet {

                public Cat(String name) {
                    System.out.println("I am cat and my name is:" + name);
                }

                void sleep() {
                    System.out.println("Cat sleeps");
                }

                public static class Test {
                    public static void main(String[] args) {
                        Dog dog = new Dog("Nusya");
                        Cat cat = new Cat("Musya");
                        cat.sleep();

                    }
                }
            }
        }
    }
}
