package kr.co.hyeon.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class BoardVO {
	@NonNull
	private String BOARDNUM;
	@NonNull
	private String BOARDTITLE;
	@NonNull
	private String IRUM;
	@NonNull
	private String BOARDPWD;
	private String BOARDCONTENT;
	private String REGIDATE;
}
