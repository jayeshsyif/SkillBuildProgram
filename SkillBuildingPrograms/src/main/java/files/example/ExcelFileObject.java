package files.example;

public class ExcelFileObject {

	private String src="",des="";

	
	public ExcelFileObject(String src, String des) {
		super();
		this.src = src;
		this.des = des;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	@Override
	public String toString() {
		return "ExcelFileObject [src=" + src + ", des=" + des + "]";
	}
	
}
