package LCG;

public class LinearCongruenceGenerator{
	private static final long serialVersionUID = 1673833806300427407L;
	private long m;
	private long a;
	private long b;
	private long y;

	public LinearCongruenceGenerator (long m, long a, long b, long y){
		try {
			init(m, a, b, y);
		} catch (WrongParameterException e) {
			e.printStackTrace();
		}
	}

	private void init(long m, long a, long b, long y) throws WrongParameterException{
		if(!checkForInitError(m, a, b)){
			setInit(m, a, b, y);
		}
	}

	private void setInit(long m, long a, long b, long y){
		this.m=m;
		this.a=a;
		this.b=b;
		this.y=y;
	}

	private boolean checkForInitError(long m, long a, long b) throws WrongParameterException{
		if(a>=m){
			throw new WrongParameterException("Parameter a mustn't bee larger or equal to m");
		}
		else if(b>=m){
			throw new WrongParameterException("Parameter b mustn't bee larger or equal to m");
		}
		else{
			return false;
		}
	}

	public long nextLong(){
		y = (a*y+b) % m;
		return y;
	}
	
	public int nextInt(){
		y = (a*y+b) % m;
		return (int) y;
	}

	public double nextDouble(){
		y = (a*y+b) % m;
		return y;
	}

	public long getM() {
		return m;
	}

	public void setM(long m) {
		this.m = m;
	}

	public long getA() {
		return a;
	}

	public void setA(long a) {
		this.a = a;
	}

	public long getB() {
		return b;
	}

	public void setB(long b) {
		this.b = b;
	}

	public long getY() {
		return y;
	}

	public void setY(long y) {
		this.y = y;
	}
}
