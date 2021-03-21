package javaTasksOOP2;

import java.util.Arrays;

class MyPolynomial {
    private double[] coeffs;

    //coeffs[0] = c0*x^0 .. coeffs[n] = cn*x^n
    public MyPolynomial(double ...coeffs){
        this.coeffs = coeffs;
    }

    public int getDegree(){
        return coeffs.length - 1;
    }

    public double[] getCoeffs(){
        return coeffs;
    }


    //looks beautiful but maybe useless
    @Override
    public String toString() {
        String result = "";
        for(int i = getDegree(); i > 0; i--){
            if (getCoeffs()[i] != 0){
                result += String.format("%+.1fx^%d",getCoeffs()[i], i);
            }
        }
        if (getCoeffs()[0] != 0){
            result += String.format("%+.1f",getCoeffs()[0]);
        }
        return result;
    }

    public double evaluate(double x){
        double result = coeffs[0];
        for (int i = 1; i <= getDegree(); i++){
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right){
        int smallerDegree = this.getDegree();
        double[] tmp;
        if (this.getDegree() < right.getDegree()){
            tmp = right.getCoeffs();
        } else {
            smallerDegree = right.getDegree();
            tmp = this.getCoeffs();
        }

        for (int i = 0; i <= smallerDegree; i++){
            tmp[i] = this.getCoeffs()[i] + right.getCoeffs()[i];
        }

        return new MyPolynomial(tmp);
    }

    public MyPolynomial multiply(MyPolynomial right){

        double[] tmp = new double[this.getDegree()+right.getDegree()+1];

        for (int i = 0; i <= this.getDegree(); i++){
            for (int j = 0; j <= right.getDegree(); j++){
                tmp[i+j] += this.getCoeffs()[i] * right.getCoeffs()[j];
            }
        }
        return new MyPolynomial(tmp);

    }

}
