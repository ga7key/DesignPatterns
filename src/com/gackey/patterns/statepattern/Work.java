/*
 * title: Work.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.statepattern;

/**
 * @desc: TODO
 * @className: Work
 * @author: gackey
 * @date: 2018-12-01 20:49
 */
class Work {

    private State current;

    private double hour;

    private boolean finish = false;

    public Work() {
        current = new ForenoonState();
    }

    public void writeProgram() {
        current.writeProgram(this);
    }

    public State getCurrent() {
        return current;
    }

    public void setCurrent(State current) {
        this.current = current;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean beFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

}
