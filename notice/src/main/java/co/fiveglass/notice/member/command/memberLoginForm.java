package co.fiveglass.notice.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.fiveglass.notice.common.Command;

public class memberLoginForm implements Command {
	//jsp폼으로 보내는 역할
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		
		return "member/memberLogin";
	}

}
