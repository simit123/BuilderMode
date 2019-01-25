/**
 * @author by wuYang
 * @date 2019/1/18
 * @describe
 */

/**
 * 构建者模式：为了创建复杂对象，将对象的构建过程封装起来，实现解耦
 *
 * Director 负责执行具体的创建动作
 * IBuild 定义对象创建所需要的步骤
 * SmartHuman 具体的创建过程
 * product 最终创建的对象
 *
 *
 */
class Test {
    public static void main(String[] args) {
        Director director = new Director();
        Human human = director.createHuman(new SmartHuman());
        System.out.println(human.getHand());
    }
}
