package com.hookey.state;

public interface State {
	public abstract void doClock(Context context, int hour);	// set time.
	public abstract void doUse(Context context);				// use safety.
	public abstract void doAlarm(Context context);				// emergency alarm.
	public abstract void doPhone(Context context);				// call a phone.
}
