package javaTasksOOP2;

import java.math.BigDecimal;

class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }


    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return String.format("(%.1f%+.1fi)",real,imag);
    }

    public  boolean hasReal(){
        if (real == 0){
            return false;
        } else return true;
    }

    public boolean hasImaginary(){
        if (imag == 0){
            return false;
        } else return true;
    }

    public boolean equals(double real, double imag){
        if ((new BigDecimal(this.real).compareTo(new BigDecimal(real)) == 0) &&
                (new BigDecimal(this.imag).compareTo(new BigDecimal(imag)) == 0)) {
            return true;
        } else return false;
    }

    public boolean equals(MyComplex another){
        if ((new BigDecimal(this.real).compareTo(new BigDecimal(another.getReal())) == 0) &&
                (new BigDecimal(this.imag).compareTo(new BigDecimal(another.getImag())) == 0)) {
            return true;
        } else return false;
    }

    public double calculateMagnitude(){
        return Math.sqrt(Math.pow(real, 2) +Math.pow(imag,2));
    }

    public double calculateArgument(){

        if ((!this.hasReal()) && (!this.hasImaginary())){
            //undefined result
            return Double.NaN;
        }

        if (!this.hasImaginary()){
            if (real > 0){
                return 0;
            } else return Math.PI;
        }

        if (!this.hasReal()){
            if (imag > 0){
                return Math.PI / 2;
            } else return - Math.PI / 2;
        }

        //first/fourth quarter of the coordinate plane
        if (((real > 0) && (imag > 0)) || ((real > 0) && (imag < 0))){
            return Math.atan(imag/real);
        }
        //second quarter of the coordinate plane
        if ((real < 0) && (imag > 0)){
            return Math.atan(imag/real)+Math.PI;
        }
        //third quarter of the coordinate plane
        if ((real < 0) && (imag < 0)){
            return Math.atan(imag/real)-Math.PI;
        }
        return Double.NaN;
    }

    public MyComplex add(MyComplex right){
        this.real += right.getReal();
        this.imag += right.getImag();
        return this;
    }

    public MyComplex addNew(MyComplex right){
        return new MyComplex(this.real + right.getReal(), this.imag + right.getImag());
    }

    public MyComplex subtract(MyComplex right){
        this.real -= right.getReal();
        this.imag -= right.getImag();
        return this;
    }

    public MyComplex subtractNew(MyComplex right){
        return new MyComplex(this.real - right.getReal(), this.imag - right.getImag());
    }

    public MyComplex multiply(MyComplex right){
        double tmpReal = this.real*right.getReal() - this.imag*right.getImag();
        double tmpImag = this.real*right.getImag() + this.imag*right.getReal();
        this.real = tmpReal;
        this.imag = tmpImag;
        return this;
    }

    public MyComplex multiplyNew(MyComplex right){
        return new MyComplex(this.real*right.getReal() - this.imag*right.getImag(),
        this.real*right.getImag() + this.imag*right.getReal());
    }

    private MyComplex conjugate(){
        return new MyComplex(this.real,-this.imag);
    }

    public MyComplex divide(MyComplex right){

        MyComplex numerator = this.multiply(right.conjugate());
        MyComplex denominator = right.multiply(right.conjugate());

        //work with part complex number
        double realNew = numerator.getReal() / denominator.getReal();
        double imagNew = numerator.getImag() / denominator.getReal();

        return  new MyComplex(realNew,imagNew);
    }


}
