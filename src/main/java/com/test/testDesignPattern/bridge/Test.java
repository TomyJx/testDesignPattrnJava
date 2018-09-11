package com.test.testDesignPattern.bridge;

/**
 * 桥接模式
 *
 * @author jiyx
 * @create 2017-05-08-12:24
 */
public class Test {
    public static void main(String[] args) {
        HandsetSoft game = new HandsetGame();
        HandsetSoft addressList = new HandsetAddressList();

        HandsetBrand nokia = new HandsetNokia(game);
        nokia.run();
        nokia.setSoft(addressList);
        nokia.run();

        HandsetBrand moto = new HandsetMoto(game);
        moto.run();
        moto.setSoft(addressList);
        moto.run();
    }
}
