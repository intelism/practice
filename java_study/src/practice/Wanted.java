package practice;

public class Wanted {

	private String company;
	private String part;
	private String career;
	
	public Wanted(){
		System.out.println("���������� ä�� ����");
	}
	
	public static void showDesc(Wanted you){
		System.out.print("https://dorionni.notion.site/4afb8b07a53c45ed96308a4ccb6cebe2");
	}
	
	public static void main(String[] args){
		Wanted job = new Wanted();
		job.setCompany("�ѱ����ް���");
		job.setPart("Java Developer");
		job.setCareer("junior");
		showDesc(job);
	}

	public void setCompany(String company) {
		this.company = company;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public void setCareer(String career) {
		this.career = career;
	}
}
