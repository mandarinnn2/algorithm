public class timeComplexExample {
    public static void main(String[] args) {

        int findNumber = (int)(Math.random()*100);

        for(int i = 0; i < 100; i++){
            if(i == findNumber){
                System.out.println(i);
                break;
            }
        }

//        빅 오메가: 1
//        빅 세타: 2/N
//        빅 오: N
    }
}
