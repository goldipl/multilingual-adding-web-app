package atj;

public class SumatorVO {
	private double arg0;
	private double arg1;
	private String result;
	
	public double getArg0() {
		return arg0;
	}
	public void setArg0(double arg0) {
		this.arg0 = arg0;
	}
	public double getArg1() {
		return arg1;
	}
	public void setArg1(double arg1) {
		this.arg1 = arg1;
	}
	public String getResult() {
		arg0 = arg0 + arg1;
		return result = "" + arg0;
	}
	public void setResult(String result) {
		this.result = result;
	}
		
}
