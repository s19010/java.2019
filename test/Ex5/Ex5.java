class Ex5 {
	public double ex5_1(int [] a) {
		double ave = 0;
		for(int i = 0; i < a.length; i++ ) {
			ave += a[i];
		}
		ave /= a.length;
		return ave;
	}
}
