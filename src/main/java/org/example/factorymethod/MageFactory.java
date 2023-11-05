package org.example.factorymethod;

public class MageFactory extends EnemyFactoryMethod {

    @Override
    public Enemy createEnemy() {
        return new Mage();
    }
}
