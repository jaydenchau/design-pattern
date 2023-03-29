package com.nature.design.pattern.strategy.normal;

/**
 * @author nature
 * @date 2021/6/10 17:17
 */
public class RoleContext {

    private final RoleAction roleAction;

    public RoleContext(int userType) {
        switch (userType) {
            case 1:
                this.roleAction = new SuperVipAction();
                break;
            case 2:
                this.roleAction = new VipAction();
                break;
            default:
                this.roleAction = new UserAction();
        }
    }

    public void sendWelcomeWord() {
        roleAction.sendWelcomeWord();
    }
}
