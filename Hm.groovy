class Hm {
    static void main(String[] args) {
        HashMap<Integer,Integer> hm =new HashMap<Integer,Integer>()

        hm.put(1,2)
        hm.put(2,3)
        hm.put(3,4)
        hm.put(4,5)
        //Integer i=hm
       // println(i)int lineN=1;
        int lineN=1;
        int ele=10
        new File("/home/naveenmahantesh/groovy/newone/src/Doc3.txt").eachLine {line ->
            if (lineN==ele) {
                print(line)
            }
            lineN++
        }

    }
}
