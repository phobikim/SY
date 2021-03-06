package com.sist.goods.vo;



import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsVo {
	private int no;
	private String name;
	private int qty;
	private int price;
	private String fname;	
	private MultipartFile uploadFile;
}
