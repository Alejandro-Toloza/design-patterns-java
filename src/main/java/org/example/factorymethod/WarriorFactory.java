package org.example.factorymethod;

public class WarriorFactory extends EnemyFactoryMethod{
    @Override
    public Enemy createEnemy() {
        return new Warrior();
    }
}
