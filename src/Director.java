/**
 * @author by wuYang
 * @date 2019/1/18
 * @describe
 */

/**
 * 创建者
 */
class Director {

    public Human createHuman(IBuildHuman iBuildHuman) {
        return iBuildHuman.buildHead()
                .buildBody()
                .buildFoot()
                .buildHand()
                .createHuman();
    }
}
