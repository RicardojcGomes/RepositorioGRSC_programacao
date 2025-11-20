package FichaPratica03;

public class Ex07 {
    public static void main(String[] args) {

        int num, soma;

        num = 1;
        soma = 0;

        while (num <= 100){

            soma = soma + num;
            System.out.println(num);
            num = num +1;

        }

        System.out.println(soma);
    }
}
