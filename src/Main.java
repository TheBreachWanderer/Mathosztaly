void main() {
    double rnda = Math.random();
    double rnd1 = rnda * 100;
    double rndb = Math.random()*100;
    double rnd2 = rndb * 100;

    if(rnd2 < rnd1) {
        int temp = (int) rnd2;
        rnd2 = rnd1;
        rnd1 = temp;
    }
    System.out.println("a nagyobb szám: " + rnd2);
    System.out.println("a kisebb szám: " + rnd1);
    System.out.println(Math.sqrt(rnd1));
    System.out.println(Math.sqrt(rnd2));
    System.out.println(rnd2 - rnd1);
    System.out.println(Math.pow(rnd1, 3));
    System.out.println(Math.pow(rnd2, 3));
    System.out.println(Math.round(rnd2/rnd1));
    System.out.println(Math.floor(rnd2/rnd1));
    System.out.println(Math.ceil(rnd2/rnd1));
}
