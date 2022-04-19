package atv7_11211100076;

/*
 * autor Leonardo Piascentini Bugmann 11211100076
 * co-autor Lucas da Silva Cardoso 11211102438
 */
public class Conversao {
	    public static void main(String[] args){
	        String st, st2;
	        float real, real2;
	        //int int1, int2;

	        //String para real
	        st = "12";
	        real = (float) (new Float(st).floatValue());
	        System.out.println("String para real " + real);

	        //Real para string
	        real2 = 10;
	        st2 = new Float(real2).toString();
	        System.out.println("Real para string " + st2);

	        //String para inteiro
	        st2 = "13";
	        Produto.int1 = Integer.parseInt(st2);
	        System.out.println("String para inteiro " + Produto.int1);

	        //Inteiro para String
	        Produto.int2 = 5;
	        st2 = Integer.toString(Produto.int2);
	        System.out.println("Inteiro para String " + st2);
	}
}
