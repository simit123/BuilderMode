/**
 * @author by wuYang
 * @date 2019/1/18
 * @describe
 */

/**
 * 具体对象
 */
class SmartHuman implements IBuildHuman {

    Human human = new Human();

    @Override
    public IBuildHuman buildHead() {
        human.setHead("大头");
        return this;
    }

    @Override
    public IBuildHuman buildBody() {
        human.setBody("强壮的身体");
        return this;
    }

    @Override
    public IBuildHuman buildHand() {
        human.setHand("大手");
        return this;
    }

    @Override
    public IBuildHuman buildFoot() {
        human.setFoot("大脚");
        return this;
    }

    @Override
    public Human createHuman() {
        return human;
    }
}
