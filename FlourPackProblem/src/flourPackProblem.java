public class flourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(2, 0, 9));
    }

    public static boolean canPack(int bigFlourPacks, int smallFlourPacks, int goal) {
        if ((bigFlourPacks >= 0) || (smallFlourPacks >= 0) || (goal >= 0)) {
            int amount = 5 * bigFlourPacks + smallFlourPacks;
            if (amount == goal) {
                return true;
            }
            if ((amount > goal) && (smallFlourPacks >= goal % 5)) {
                return true;//(smallFlourPacks >= goal % n '5') eg:'Assume n==5' | %n '5' means the remainder will not more than n-1 '4',
                            //since the maximum is n-1 '4', it cannot be divided completely by bigFLourPack which is set to n '5'.
            } else if ((bigFlourPacks == 0)&&(smallFlourPacks >= goal)) {
                return true;
            }else{
                return false;
            }
        } else {
            return false;
        }
    }
}
