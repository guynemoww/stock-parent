package cn.tcht.stock.test;

/**   
* @Title: ApplyBase.java 
* @Package cn.tcht.stock.test 
* @Description: 
* @author teamsun_wangwei
* @date 2018年9月12日 下午5:51:44 
* @version V1.0.0  
*/
public class ApplyBase {
	private String id;
	
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ApplyBase [id=" + id + ", name=" + name + "]";
	}
}
