/**
 * @author by wuYang
 * @date 2019/1/18
 * @describe
 */

class SmartHuman implements IBuildHuman {

    Human human = new Human();

    @Override
    public void buildHead() {
        human.setHead("大头");
    }

    @Override
    public void buildBody() {
        human.setBody("强壮的身体");
    }

    @Override
    public void buildHand() {
        human.setHand("大手");
    }

    @Override
    public void buildFoot() {
        human.setFoot("大脚");
    }

    @Override
    public Human createHuman() {
        return human;
    }
}
