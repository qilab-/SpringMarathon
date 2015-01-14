package jp.qilab.spring.domain.intermediate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clothes")
public class Clothes {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private Integer sex_id;
	
	private Integer clothes_color_id;
	
	private Integer price;
}
