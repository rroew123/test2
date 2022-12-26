package kr.co.hyeon.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class MemVO {
	
	@NonNull
	private String MEMID;
	private String MEMNAME;
	private String MEMPWD;
	private String PHONE;
	private String REGIDATE;
	
}
