/**
 * @author by wuYang
 * @date 2019/1/18
 * @describe
 */

class Director {

    public Human createHuman(IBuildHuman iBuildHuman){

        iBuildHuman.buildHead();
        iBuildHuman.buildBody();
        iBuildHuman.buildFoot();
        iBuildHuman.buildHand();
        return iBuildHuman.createHuman();

    }
}
