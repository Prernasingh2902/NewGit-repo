package com.lti.model;

import java.time.LocalDate;

public class Transactions {
int Tid;
LocalDate Tdate;
public int getTid() {
	return Tid;
}
public void setTid(int tid) {
	Tid = tid;
}
public LocalDate getTdate() {
	return Tdate;
}
public void setTdate(LocalDate tdate) {
	Tdate = tdate;
}

}
