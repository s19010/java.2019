import java.util.*;

class Ex4{

	public int [] ex4_1(int [] a) {
		int[] foo = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			foo[i] = a[i];
		}
		Arrays.sort(foo);
		return foo;
	}

	public int [] ex4_2(int [] a) {
		int[] foo = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				if(a[j] > a[j+1]) {
					int num = a[j];
					a[j] = a[j+1];
					a[j+1] = num;
					return num;
				}
			}
		}
	}

	public String [] ex4_3(int [] a){

		String [] hantei = {"dummy"};

		return hantei;

	}

	public int ex4_4(int a){

		return -1;

	}

	public int ex4_5(int a){

		return -1;

	}

	public int [] ex4_6(int a){

		int [] ret = new int[1];

		return ret;

	}

	public boolean ex4_7(int a){

		return false;

	}

	public int ex4_8(int [] a){

		int ret = 0;

		return ret;

	}

	public int ex4_9(int [] a){

		int ret = 0;

		return ret;

	}
}
