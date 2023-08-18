package com.adapter_dp;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

	@Override
	public Volt get120Volts() {
		return getVolt();
	}

	@Override
	public Volt get30Volts() {

		Volt v = new Volt();
		return convertVolt(v, 4);
	}

	@Override
	public Volt get10Volts() {
		Volt v = new Volt();
		return convertVolt(v, 12);
	}

	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}
}
