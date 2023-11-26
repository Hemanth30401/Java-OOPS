package polymorphism;

public class PolymorphismAllTypesProgram_Compile_Runtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Crex c = new Crex();
		System.out.println(c);
		Crex c1=new Crex("Ind vs Pak","15th Oct",3);
		System.out.println(c1.callA1(10));
		SemiFinal s = new SemiFinal();
		System.out.println(s);
		SemiFinal s1 = new SemiFinal("Aus V Pak","10th Oct",2); 
		System.out.println(s1.callA1(11));
		
	}

}
class Crex
{
	String series,dates,Time,match,m_date;int m_time;
	Crex(){
		series="WC";
		dates="9th Oct to 19th Nov";Time="2:00pm";
	}
	Crex(String match,String m_date,int m_time)
	{
		this.match=match;
		this.m_date=m_date;
		this.m_time=m_time;
	}
	public String toString() {
		return series + " " + dates + " " + Time;
	}
	public String callA1(int a) {
		return match + " " + m_date + " " + m_time;
	}
	
}
class SemiFinal extends Crex
{
	String match,sf_date,match2,sf_date2;
	int sf_time,sf_time2;
	SemiFinal(){
		super();
		match="Ind V Eng";sf_date="9th Nov";sf_time=2;
	}
	SemiFinal(String match2,String sf_date2,int sf_time2){
		this.match2=match2;
		this.sf_date2=sf_date2;
		this.sf_time2=sf_time2;
	}
	public String toString() {
		return match + " " + sf_date + " " + sf_time;
	}
	public String callA1(int b) {
		return match2+" " + sf_date2+" " + sf_time2;
	}
}