package com.qmcy.comment;

public enum HttpCode {

    OK(1000, "请求成功"),

    SYS_ERROR(1001, "系统异常"),

    SYS_ACCESS_NOTALLOWED(1002, "系统不允许访问"),

    SYS_ACCESS_UNAUTHORIZED(1003, "未经授权不允许访问"),

    SYS_DROIT_INVALID(1004, "权限错误"),

    SYS_ACCESS_INVALID(1005, "非法访问请求"),

    SYS_ACCESS_IPBOUNDED(1006, "系统不允许访问，IP地址受限"),

    ORDER_REFUND_APPLICATION_REVOCATION_FAILURE(1008, "撤销退款申请失败"),

    PARAMETER_NOT_FULL(9001, "参数不完整"),

    PARAMETER_FORMAT_ERROR(9002, "参数格式错误"),

    PARAMETER_FORMAT_PHONE_ERROR(9003, "请输入正确的手机号"),

    PARAMETER_PHONE_INVALID(9004, "获取验证码失败，手机号不合法"),

    PARAMETER_IS_FILE(9100, "参数错误,该手机号和用户不对应"),

    PARAMETER_LOGIN_FAIL(9101, "登录失败，用户名或者密码错误"),

    USER_LOGIN_DEVICE_CHANGE(9181, "系统检测到您本次登录使用的网络波段与上一次登录使用网络波段差异较大，存在安全隐患，" +
                                     "为保障您的账户资产安全，请使用手机号+验证码的方式进行重新登录"),

    PARAMETER_LOGIN_MANY_FAIL(9102, "登录失败，该手机号对应多个用户，请选择用户"),

    PARAMETER_LOGIN_NULL_FAIL(9103, "登录失败，该手机号未绑定用户，请前往注册"),

    PARAMETER_CHECK_CODE_FAIL(9104, "验证码错误或验证码已失效，请重新获取验证码"),

    PARAMETER_TOKEN_GET_NULL_USER(9105, "请求失败，未获取到该Token对应的用户信息，请检查或者重新登录"),

    SMS_CODE_MUL(9220, "获取验证码过于频繁,请您30分钟之后再试"),

    NO_TOKEN(310, "未登录"),

    BAD_REQUEST(400, "错误请求"),

    FORBIDDEN(403, "服务拒绝执行"),

    RESPONSE_DATA_ISNULL(405, "未获取到有效数据"),

    INTERNAL_ERROR(500, "服务器内部错误"),

    NOT_SUPPORTED(505, "非法连接"),

    PAY_FAIL_SHOPPING(2001, "普通购物支付业务失败"),

    PAY_FAIL_UPGRADE(2002, "会员升级支付业务失败"),

    PAY_FAIL_EXCHANGE(2003, "抢兑订单支付业务失败"),

    PAY_FAIL_LUCKDRAW(2004, "大转盘订单支付业务失败"),

    PAY_FAIL_BUYSCORE(2005, "引流支付业务失败"),

    PAY_FAIL_RECHARGE(2006, "充值支付业务失败"),

    PAY_FAIL_TAKECASH(2007, "提现支付业务失败"),

    PAY_FAIL_QRCODE(2008, "二维码支付支付业务失败"),

    WUSR_ALTER_FAIL(8001, "用户钱包变更失败，变更后数额不许可"),

    WSC_ALTER_FAIL(8002, "服务中心钱包变更失败，变更后数额不许可"),

    RP_SOLO_ONLY_ONE(8031, "发个人红包的数量不能超过1！"),

    RP_DECREASE_ACCOUNT_ERR(8032, "发红包减款异常！"),

    RP_INCREASE_ACCOUNT_ERR(8033, "领红包加款异常！"),

    RP_NO_MORE_JUST_NOW(8034, "对不起，您手只慢了一点点，红包刚被抢完！"),

    RP_NO_MORE(8035, "对不起，您手慢了，红包已被抢完！"),

    RP_YOU_SNATCHED(8036, "对不起，您已经领取过该红包！"),

    RP_YOU_APPLIED(8037, "对不起，您之前的抢红包请求正在处理中，请不要重复抢这个红包！"),

    RP_GROP_EXCEED_LIMIT(8038, "群红包个数超限！"),

    RP_GROP_ALLOC_SUM_ERR(8039, "群红包分配后最小金额错误！"),

    RP_SUM_ERR(8040, "发送红包金额错误！"),

    NO_CHECK_ORDER(9009, "未查询到订单"),

    LOGISTIC_ERROR(8701, "快递100接口调用失败"),

    ZUUL_ERR_INVALID_TOKEN(9105, "TOKEN非法！"),

    ZUUL_ERR_EMPTY_TOKEN(9106, "TOKEN为空！"),
    //账号被封
    USER_IS_DISABLE(9107, "该账户已被冻结"),
    //店铺被封
    STORE_IS_DISABLE(9108, "抱歉，您的店铺被冻结，暂不可进行操作"),
    USER_OLD_PASSWORD_ERROR(9108, "修改密码失败，旧密码错误"),
    USER_OLD_PASSWORD_SAME(9108, "修改密码失败，新密码与旧密码相同"),
    USER_WXBINDING_DISSIMILARITY(9108, "提交修改失败，用户系统编号与微信绑定的系统编号不一致"),
    USER_MOBILE_IS_REGISTER(9109, "提交修改失败，该手机号已经绑定其他账号"),
    OPERTAE_CITY_ERROR(9109, "生成服务中心编号失败，请输入正确的省份名称"),
    USER_PERSON_APPROVE_UNPASS(9109, "您还未实名认证，无法申请店铺，请先前往实名认证"),
    USER_UPGRADE_ERROR_USER(9111, "请传入正确的用户信息"),
    USER_UPGRADE_ERROR_RANK(9112, "您已经是二星以上会员的辅导员，不可更改辅导员"),
    USER_UPGRADE_ERROR_CHENG(9113, "所修改的辅导员已经跟您存在辅导关系"),
    USER_UPGRADE_INSTRUCTOR_UNCHANGE(9114, "该辅导员不可选，请重新选择"),
    USER_UPGRADE_INSTRUCTOR_CANOT_SELF(9115, "不能选择自己为自己的辅导员"),
    USER_UPGRADE_INSTRUCTOR_UNFINDE(9116, "未找到编号为instructorName的辅导员信息"),
    USER_UPGRADE_CANNOT_CHANGE(9117, "您当前星级无法购买此星级商品"),
    USER_STORE_APPROVE_HAVE(9120, "您已经有店铺了，无法重复申请"),
    USER_STORE_IS_APPROVE(9121, "您的店铺正在审核中，无法重复申请"),
    USER_NOTFIND_BY_USERNAME(9015, "未找到该系统编号对应的用户信息"),
    USER_OPEN_NUMBERPASSWORD_UNCHECK(9016, "开启访问密码失败，验证信息已失效"),
    USER_CLOSE_NUMBERPASSWORD_UNCHECK(9017, "关闭访问密码失败，验证信息已失效"),
    USER_ADDRESS_TOO_MANY(9018, "新增地址失败，地址数量超过限制"),

    SAVE_OPERATE_CHANGE_PERSON_EMPTY(9122, "变更合伙人失败，合伙人不能为空"),

    SAVE_OPERATE_CHANGE_PERSON_REPEAT(9123, "变更合伙人失败，合伙人不能重复"),

    SAVE_OPERATE_CHANGE_PERSON_CAN_NOT_CHOICE(9124, "变更合伙人失败，所选合伙人#{username}不可选"),

    SAVE_OPERATE_CHANGE_PERSON_NON_EXISTENT(9125, "变更合伙人失败，所选合伙人#{username}不存在"),

    SAVE_OPERATE_CHANGE_PERSON_IS_IDENTICAL(9126, "变更合伙人失败，新旧合伙人不能相同"),

    SAVE_OPERATE_CHANGE_PERSON_IS_CLONE(9127, "变更合伙人失败，服务中心被冻结"),

    SAVE_OPERATE_CHANGE_PERSON_IS_APPROVELY(9128, "变更合伙人失败，您有审核中的变更申请"),

    LEVEL_LORE_THAN_STORE_APPROVE(9129, "您的星级不满足申请店铺的条件"),

    USER_LOGIN_NO_MOBILE(9161, "用户未绑定手机号，请客服申述"),

    USER_LOGIN_NEED_SET_PASSWORD(9162, "为了系统安全，需要您重新设置密码"),

    USER_LOGIN_PASSWORD_ERROR_MORE_COUNT(9163, "用户密码错误超过次数"),

    SAVE_OPERATE_CENTER_PERSON_EMPTY(9132, "申请失败，合伙人不能为空"),

    SAVE_OPERATE_CENTER_PERSON_REPEAT(9133, "申请失败，合伙人不能重复"),

    SAVE_OPERATE_CENTER_PERSON_CAN_NOT_CHOICE(9134, "申请失败，所选合伙人#{username}不可选"),

    SAVE_OPERATE_CENTER_PERSON_NON_EXISTENT(9135, "申请失败，所选合伙人#{username}不存在"),

    CART_CANNOT_ADD_NOT_SHOW_DISABLE_STORE(9136, "商品未上架或店铺封闭不能加入购物车"),

    CART_CANNOT_ADD_LOW_STOCKS(9137, "库存不足不能加入购物车"),

    CART_ADD_FAIL(9138, "添加失败！"),

    CART_CLEANUP_FAIL(9139, "清除失败！"),

    CART_DELETE_FAIL(9140, "删除失败！"),

    CART_YOU_SELECTED_ADDRESS_EXCEEDS_DISTRIBUTION_SCOPE(9141, "您所选的地址超出配送范围！"),

    CART_CHECKOUT_SUCCESS(9142, "下单成功！"),

    CART_SET_PRODUCT_INVALID_FAIL(9143, "设置商品失效失败！"),

    CART_LOW_STOCKS(9144, "库存不足！"),

    CART_CANNOT_BUY_OWN_PRODUCT(9145, "不能购买自己的商品！"),

    CART_SELF_SHOPS_CONTAIN_NONSELF_RAISED_PRODUCTS(9146, "自提店铺含有非自提的产品，请检查！"),

    CART_SET_PRODUCT_VALID_FAIL(9147, "设置商品有效失败！"),

    CART_PRODUCT_NOTSHOW(9148, "商品已下架"),

    CART_PRODUCT_RECEIPT_PLACE_FAIL(9150, "匹配商品收货地址失败！"),

    CART_CALCULATE_CARRIAGE_FEE_FAIL(9151, "计算运费失败！"),

    PRODUCT_NO_FOUND(9600, "没有找到商品"),

    PRODUCT_SENSITIVEWORD(9601, "有非法字符，请检查"),

    CART_PRODUCT_NOTSHOW_SELECT_OTHER(9149, "商品已下架，请选择其它商品！"),

    CART_CANNOT_GOBUY_NOT_SHOW_DISABLE_STORE(9152, "商品未上架或店铺封闭不能购买"),

    FREIGHT_TEMPLATE_ERROR(9700, "请先编辑完善运费模板信息，再进行操作"),
    FREIGHT_TEMPLATE_IS_NULL(9701, "运费模板不存在或已删除,请重新添加"),

    USER_PASSWORD_ERROR_COUNT(9156, "密码错误次数过多，该账号被冻结1天"),
    USER_FALSE_COUNT_1(9153, "验证码输入错误过多，冻结60分钟"),
    USER_FALSE_COUNT_2(9154, "验证码输入错误过多，冻结120分钟"),
    USER_FALSE_COUNT_3(9155, "验证码错误过于频繁，请联系客服"),
    CART_PRODUCTNUM_ERROR(9156, "购买商品数量不正确！"),
    DOUNT_DEL_ADDRESS(9164,"该自提地址被使用，无法被删除"),
    SET_MOBILE_OFTERWECHATBINDING_ERROR(9166, "该账号已经有手机号，不能设置"),
    SET_PASSWORD_OFTERWECHATBINDING_ERROR(9168, "该账号已经有密码，不能设置"),
    USER_REGISTER_SOME_ERROR(9169, "注册失败，不能重复提交"),
    USER_APPROVE_NOT_PASS(9170, "请求权限受限，实名认证未通过"),
    STORE_APPROVE_NOT_PASS(9171, "请求权限受限，店铺认证未通过"),
    SET_MOBILE_UNCHECK_ERROR(9167, "修改失败，账号原手机验证码已失效"),
    USER_URL_NOT_USER(9165, "该功能暂不可用！"),
    CART_CLOSE_ZITI(9702, "商品自提功能已关闭！"),
    PRODUCT_ISSHOW_FAIL(9703, "商品上架失败！"),
    DISABLE_ADDRESS(9704,"系统升级中"),
    WRONG_NUMBER(9705,"号码有误，请重试");

    private int code;

    private String desc;// 描述

    private HttpCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }
}
