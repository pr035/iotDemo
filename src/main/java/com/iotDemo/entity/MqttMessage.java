package com.iotDemo.entity;
public class MqttMessage {

	public MqttMessage(String t, String m, String a, String d1, String d2, String d3, String d4, int b, int w) {
		super();
		T = t;
		M = m;
		A = a;
		D1 = d1;
		D2 = d2;
		D3 = d3;
		D4 = d4;
		B = b;
		W = w;
	}

	public MqttMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String T;
	private String M;
	private String A;
	private String D1;
	private String D2;
	private String D3;
	private String D4;
	private int B;
	private int W;

	@Override
	public String toString() {
		return "{T:" + T + ", M:" + M + ", A:" + A + ", D1:" + D1 + ", D2:" + D2 + ", D3:" + D3 + ", D4:" + D4 + ", B:"
				+ B + ", W:" + W + "}";
	}

	public String getT() {
		return T;
	}

	public void setT(String t) {
		T = t;
	}

	public String getM() {
		return M;
	}

	public void setM(String m) {
		M = m;
	}

	public String getA() {
		return A;
	}

	public void setA(String a) {
		A = a;
	}

	public String getD1() {
		return D1;
	}

	public void setD1(String d1) {
		D1 = d1;
	}

	public String getD2() {
		return D2;
	}

	public void setD2(String d2) {
		D2 = d2;
	}

	public String getD3() {
		return D3;
	}

	public void setD3(String d3) {
		D3 = d3;
	}

	public String getD4() {
		return D4;
	}

	public void setD4(String d4) {
		D4 = d4;
	}

	public int getB() {
		return B;
	}

	public void setB(int b) {
		B = b;
	}

	public int getW() {
		return W;
	}

	public void setW(int w) {
		W = w;
	}
	
  

}
