package me.zohar.lottery.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 业务处理错误枚举类
 * 
 * @author zohar
 * @date 2019年1月7日
 *
 */
@Getter
@AllArgsConstructor
public enum BizError {

	参数异常("1000", "参数异常"),

	休市中("1001", "休市中"),

	投注期号不对("1002", "输入的期号与当前时间的期号对不上"),
	
	期号非法("1002", "期号非法"),
	
	只能追当天的号("1002", "只能追当天的号"),
	
	该期已封盘无法投注("1002", "该期已封盘,无法投注"),

	已截止投注("1003", "已截止投注"),

	余额不足("1006", "余额不足"),

	游戏玩法不存在("1012", "游戏玩法不存在"),

	游戏玩法被禁用("1012", "游戏玩法被禁用"),

	玩法赔率异常("1013", "玩法赔率异常"),

	用户名已存在("1014", "用户名已存在"),
	
	投注订单不存在("1015", "投注订单不存在"),

	无权查看投注记录("1015", "无权查看投注记录"),
	
	已开奖或已取消无法撤单("1015", "已开奖或已取消无法撤单"),
	
	该期已封盘无法撤单("1015", "该期已封盘,无法撤单"),

	旧的登录密码不正确("1016", "旧的登录密码不正确"),

	旧的资金密码不正确("1017", "旧的资金密码不正确"),
	
	资金密码不正确("1017", "资金密码不正确"),

	签名不正确("1018", "签名不正确"),

	充值订单不存在("1019", "充值订单不存在"),
	
	只有待支付状态的充值订单才能取消("1019", "只有待支付状态的充值订单才能取消"),

	发起支付异常("1021", "发起支付异常"),

	游戏玩法代码已存在("1013", "游戏玩法代码已存在"),

	游戏代码已存在("1014", "游戏代码已存在"),

	期号设置已存在("1014", "期号设置已存在"),

	该期已开奖("1014", "该期已开奖,不能重复开奖"),

	开奖后才能结算("1014", "必须开奖后才能结算"),

	期号作废失败("1014", "期号作废失败,只有未开奖的期号才能作废"),
	
	银行卡未绑定无法进行提现("1014", "银行卡未绑定无法进行提现"),
	
	只有状态为发起提现的记录才能审核通过("1014", "只有状态为发起提现的记录才能审核通过"),
	
	只有状态为发起提现或审核通过的记录才能进行审核不通过操作("1014", "只有状态为发起提现或审核通过的记录才能进行审核不通过操作"),
	
	只有状态为审核通过的记录才能进行确认到帐操作("1014", "只有状态为审核通过的记录才能进行确认到帐操作"),
	
	邀请码不存在或已失效("1014", "邀请码不存在或已失效"),
	
	字典项code不能重复("1000", "字典项code不能重复"),
	
	邀请人不存在("1014", "邀请人不存在"),
	
	邀请注册功能已关闭("1014", "邀请注册功能已关闭"),
	
	无权查看追号记录("1015", "无权查看追号记录"),
	
	追号订单不存在("1015", "追号订单不存在"),
	
	无权撤销追号订单("1015", "无权撤销追号订单"),;

	private String code;

	private String msg;

}
