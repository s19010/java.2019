class Ex3 {

	public String ex3_0(int n) {
	String ret = "";
		if (n > 0) {
			ret = "その値は正です";
		}
		else {
			ret = "その値は０か負です";
		}
		return ret;
	}

	public int ex3_1(int n) {
		if (n > 0) {
			return n;
		}
		else if (n < 0) {
			return -n;
		}
		else {
			return 0;
		}
	}

	public String ex3_2(int a, int b) {
	String ret = "";
		if (a % b == 0) {
			ret = "4は12の約数です";
		}
		else {
			ret = "5は12の約数ではありません";
		}
		return ret;
	}

	public String ex3_3(int a, int b) {
	String ret = "";
		if (a > b)
		{
			ret = "8の方が大きいです";
		}
		else if (a < b){
			ret = "9の方が大きいです";
		}
		else{
			ret = "同じ値です";
		}
		return ret;
	}

	public String ex3_4(int a) {
	String ret = "";
		if (a > 0 && a % 5 == 0) {
			ret = "その値は5で割り切れます";
		}
		else if (a < 0) {
			ret = "正でない整数値です";
		}
		else {
			ret = "その値は5で割り切れません";
		}
		return ret;
	}

	public String ex3_5(int a) {
	String ret = "";
		if (a % 10 == 0) {
			ret = "その値は10の倍数です";
		}
		else if (a < 0) {
			ret = "正でない整数値です";
		}
		else {
			ret = "その値は10の倍数ではありません";
		}
		return ret;
	}

	public String ex3_6(int a) {
	String ret = "";
		if (a > 0 && a % 3 == 0) {
			ret = "その値は3で割り切れます";
		}
		else if (a > 0 && a % 3 == 1) {
			ret = "その値を3で割った余りは1です";
		}
		else if (a > 0 && a % 3 == 2) {
			ret = "その値を3で割った余りは2です";
		}
		else {
			ret = "正でない整数値です";
		}
		return ret;
	}

	public String ex3_7(int a) {
	String ret = "";
		if (0 <= a && a <= 59) {
			ret  = "不可";
		}
		else if (60 <= a  && a <= 69) {
			ret = "可";
		}
		else if (70 <= a && a <= 79) {
			ret = "良";
		}
		else if (80 <= a && a <= 100) {
			ret = "優";
		}
		else {
			ret = "範囲(0～100)外の値です";
		}
		return ret;
	}

	public double ex3_8(double a, double b) {
		if (a > b) {
			return a;
		}
		else if (a < b) {
			return b;
		}
		else {
			return  0;
		}
	}

	public int ex3_9(int a, int b) {
		return a - b;
	}

	public String ex3_10(int a, int b) {
	String ret = "";
		int c = a - b;
		if (c <= 10) {
			ret = "それらの差は10以下です";
		}
		else {
			ret = "それらの差は11以上です";
		}
		return ret;
	}

	public int ex3_11(int a, int b, int c) {
		if (a <= b && a <= c) {
			return a;
		}
		else if (b <= a && b <= c) {
			return b;
		}
		else {
			return c;
		}
	}

	public int ex3_12(int a, int b, int c) {
		int num = 0;
		if (a <= b && a <= c) {
			num = a;
		}
		else if (b <= a && b <= c) {
			num = b;
		}
		else {
			num = c;
		}
		if (num == a && b <= c) {
			return b;
		}
		else if (num == a && c <= b) {
			return c;
		}
		else if (num == b && a <= c) {
			return a;
		}
		else if (num == b && c <= a) {
			return c;
		}
		else if (num == c && b < a) {
			return b;
		}
		else {
			return a;
		}
	}

	public String ex3_13(int a) {
	String ret = "";
		if (a > 0 && (a == 12 || a <= 2)) {
			ret = "冬";
		}
		else if (a > 0 && (3 <= a && a <= 5)) {
			ret = "春";
		}
		else if (a > 0 && (6 <= a && a <=8)) {
			ret= "夏";
		}
		else if (a > 0 && (9 <= a && a <= 11)) {
			ret = "秋";
		}
		else {
			ret = "範囲(1～12)外の値です";
		}
		return ret;
	}
}
