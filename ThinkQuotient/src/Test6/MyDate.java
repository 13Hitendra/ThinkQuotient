package Test6;

public class MyDate {
int dd,mm,yy;

@Override
public String toString() {
	return "MyDate [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
}

public int getDd() {
	return dd;
}

public void setDd(int dd) {
	this.dd = dd;
}

public int getMm() {
	return mm;
}

public void setMm(int mm) {
	this.mm = mm;
}

public int getYy() {
	return yy;
}

public void setYy(int yy) {
	this.yy = yy;
}

public MyDate(int dd, int mm, int yy) {
	super();
	this.dd = dd;
	this.mm = mm;
	this.yy = yy;
}

}
